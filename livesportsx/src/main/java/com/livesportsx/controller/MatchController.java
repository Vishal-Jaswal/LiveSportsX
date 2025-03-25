package com.livesportsx.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livesportsx.entity.Match;
import com.livesportsx.service.MatchService;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

	@Autowired
    private MatchService matchService;
	
	
	@GetMapping("/{id}")
    public Optional<Match> getMatchById(@PathVariable Long id) {
        return matchService.getMatchById(id);
    }

    @PostMapping
    public Match createMatch(@RequestBody Match match) {
        return matchService.createMatch(match);
    }

    @DeleteMapping("/{id}")
    public void deleteMatch(@PathVariable Long id) {
        matchService.deleteMatch(id);
    }
    
	/*
	 * Explanation: The MatchController exposes four basic RESTful API endpoints:
	 * 
	 * GET /api/matches → Get all matches.
	 * 
	 * GET /api/matches/{id} → Get a match by ID.
	 * 
	 * POST /api/matches → Create a new match.
	 * 
	 * DELETE /api/matches/{id} → Delete a match by ID.
	 */
}
