package spring.web.flux.essentials_devdojo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import spring.web.flux.essentials_devdojo.domain.Anime;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {
}
