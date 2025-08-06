package study.crud.board.service;

import org.springframework.stereotype.Service;
import study.crud.board.model.BoardDto;
import study.crud.board.model.BoardEntity;
import study.crud.board.repository.BoardRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) { this.boardRepository = boardRepository; }

    public void register(BoardDto.Register dto) { boardRepository.save(dto.toEntity()); }

    public List<BoardDto.Board> list() {
        List<BoardEntity> result = boardRepository.findAll();

        return result.stream().map(BoardDto.Board::from).toList();
    }

    public BoardDto.Board read(Integer idx) {
        Optional<BoardEntity> result = boardRepository.findById(idx);

        if (result.isPresent()) {
            BoardEntity entity = result.get();

            return BoardDto.Board.from(entity);
        }

        return null;
    }

    public List<BoardDto.Board> search(String name) {
        List<BoardEntity> result = boardRepository.findByName(name);

        return result.stream().map(BoardDto.Board::from).toList();
    }
}
