package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@AllArgsConstructor
public class AnimeController {

    private DateUtil dateUtil;

    @GetMapping
    public List<Anime> list() {
        log.info(dateUtil.formatLocalTimeToDataBaseStyle(LocalDateTime.now()));
        return List.of(new Anime("DBZ oioi"), new Anime("Berserqwswqk"));
    }


}
