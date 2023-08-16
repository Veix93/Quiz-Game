package com.sda.Quiz.Game;

import com.sda.Quiz.Game.entities.PlayerEntity;
import com.sda.Quiz.Game.repositories.PlayerRepository;
import com.sda.Quiz.Game.services.QuizDataService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // -> Spring bean
@Log       // ->  elegant alternative to System.out.println(),
// which contains additional information (such as date and time, or what class the message comes from
public class StartupRunner implements CommandLineRunner {

    private final PlayerRepository playerRepository;
    private final QuizDataService quizDataService;

    @Autowired
    public StartupRunner(PlayerRepository playerRepository,
                         QuizDataService quizDataService) {
        this.playerRepository = playerRepository;
        this.quizDataService = quizDataService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Executing startup actions...");

        playerRepository.save(new PlayerEntity("John"));
        playerRepository.save(new PlayerEntity("Harry"));
        playerRepository.save(new PlayerEntity("George"));
        quizDataService.getQuizCategories();
        quizDataService.getQuizQuestions();

        log.info("List of players from database:");
        List<PlayerEntity> playersFromDatabase = playerRepository.findAll();
        for (PlayerEntity player : playersFromDatabase) {
            log.info("Retrieved player: " + player);
        }
    }
}
