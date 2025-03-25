package com.livesportsx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livesportsx.entity.Match;
import com.livesportsx.repository.IMatchRepository;

@Service
public class MatchService {

	@Autowired
	private IMatchRepository matchRepository;
	
	//methods that we can develop.
	
	private List<Match> getAllMatchs(){
		return matchRepository.findAll();
	}
	
	public Optional<Match> getMatchById(Long id){
		return matchRepository.findById(id);
	}

	public Match createMatch(Match match) {
        return matchRepository.save(match);
    }

    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }
}
