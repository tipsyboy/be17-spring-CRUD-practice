package study.crud.movie.service;

import org.springframework.stereotype.Service;
import study.crud.movie.model.MovieDto;
import study.crud.movie.model.MovieEntity;
import study.crud.movie.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public void register(MovieDto.Register dto){
        movieRepository.save(dto.toEntity());
    }

    public List<MovieDto.Movie> list() {
        List<MovieEntity> result = movieRepository.findAll();
        return result.stream().map(MovieDto.Movie::from).toList();
    }

    public MovieDto.Movie read(Integer idx){
        Optional<MovieEntity> result = movieRepository.findById(idx);

        if(result.isPresent()){
            MovieEntity entity = result.get();
            return MovieDto.Movie.from(entity);
        }
        return null;
    }

    public List<MovieDto.Movie> search(String name) {
        List<MovieEntity> result = movieRepository.findByName(name);
        return result.stream().map(MovieDto.Movie::from).toList();
    }
}
