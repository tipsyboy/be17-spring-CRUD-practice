package study.crud.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.crud.board.model.BoardDto;
import study.crud.board.service.BoardService;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService){
        this.boardService = boardService;
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody BoardDto.Register dto){
        boardService.register(dto);
        return ResponseEntity.status(200).body("등록 성공");
    }

    @GetMapping("/list")
    public ResponseEntity list(){
        List<BoardDto.Board> response = boardService.list();
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/read")
    public ResponseEntity read(Integer idx){
        BoardDto.Board response = boardService.read(idx);
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/search")
    public ResponseEntity search(String name){
        List<BoardDto.Board> response = boardService.search(name);
        return ResponseEntity.status(200).body(response);
    }
}
