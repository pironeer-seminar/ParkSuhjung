package pironeer.sentence_analyzing_api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

import pironeer.sentence_analyzing_api.dto.SentenceRequest;
import pironeer.sentence_analyzing_api.dto.SentenceResponse;


@RestController
@RequestMapping("/api")
public class SentenceAnalyzingController {

    @GetMapping("/sentence")
    public String hello() {
        return "Hello, Spring Boot!";
    }

    @PostMapping("/analyze")
    public SentenceResponse analyzeSentence(@RequestBody @Valid SentenceRequest req) {
        String s = req.getSentence();

        int length = s.length();
        int wordCount = s.trim().split("\\s+").length;
        boolean containsSpring = s.toLowerCase().contains("spring");

        return new SentenceResponse(length, wordCount, containsSpring);
    }



}
