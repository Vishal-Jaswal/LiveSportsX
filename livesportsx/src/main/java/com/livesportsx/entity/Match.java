package com.livesportsx.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String team1;
	private String team2;
	private String score;
	private String status; // Example: LIVE, FINISHED, etc.
	private String matchDate; // Date or timestamp when the match happens
	
	public Match() {}

    public Match(String team1, String team2, String score, String status, String matchDate) {
        this.team1 = team1;
        this.team2 = team2;
        this.score = score;
        this.status = status;
        this.matchDate = matchDate;
    }
}
