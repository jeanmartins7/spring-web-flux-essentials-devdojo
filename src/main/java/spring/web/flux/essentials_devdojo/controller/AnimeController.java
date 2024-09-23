package spring.web.flux.essentials_devdojo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import spring.web.flux.essentials_devdojo.domain.Anime;
import spring.web.flux.essentials_devdojo.repository.AnimeRepository;

@RequiredArgsConstructor
@RestController
@RequestMapping("animes")
@Slf4j
public class AnimeController {
    private final AnimeRepository animeRepository;

    @GetMapping
    public Flux<Anime> listAll() {
        return animeRepository.findAll();
    }
}
