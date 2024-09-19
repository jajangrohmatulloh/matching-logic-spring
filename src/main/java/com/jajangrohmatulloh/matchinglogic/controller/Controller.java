package com.jajangrohmatulloh.matchinglogic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jajangrohmatulloh.matchinglogic.model.ClientRequest;
import com.jajangrohmatulloh.matchinglogic.model.WebResponse;

import me.xdrop.fuzzywuzzy.FuzzySearch;

@RestController
public class Controller {

    @PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse getScores(@RequestBody ClientRequest request) {

        String fullName = request.getFullName();
        List<String> DBFullNames = request.getDBFullNames();

        List<Integer> scores = new ArrayList<>();

        for (String DBFullName : DBFullNames) {
            int score = FuzzySearch.ratio(fullName, DBFullName);
            scores.add(score);
        }

        WebResponse response = new WebResponse();
        response.setScores(scores);

        return response;
    }

}
