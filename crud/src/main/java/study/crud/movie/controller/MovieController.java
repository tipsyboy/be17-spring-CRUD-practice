package study.crud.movie.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.crud.movie.model.MovieDto;
import study.crud.movie.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    private final MovieService movieService;
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody MovieDto.Register dto){
        movieService.register(dto);
        return ResponseEntity.status(200).body("등록 성공");
    }

    @GetMapping("/list")
    public ResponseEntity<List<MovieDto.Movie>> list(){
        List<MovieDto.Movie> response = movieService.list();
        return ResponseEntity
                .status(200)
                .body(response);
    }
    @GetMapping("/read")
    public ResponseEntity read(Integer idx){
        MovieDto.Movie response = movieService.read(idx);
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/search")
    public ResponseEntity<List<MovieDto.Movie>> search(String name){
        List<MovieDto.Movie> response = movieService.search(name);
        return ResponseEntity.status(200).body(response);
    }

}
