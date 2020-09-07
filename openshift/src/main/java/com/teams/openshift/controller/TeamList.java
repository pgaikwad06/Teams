package com.teams.openshift.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.teams.openshift.domain.Team;

public class TeamList implements Serializable{
    private static final long serialVersionUID = 1L;

	
	List<Team> newTeam;

	public TeamList() {
		
		System.out.println("Con called..");
		this.newTeam = new ArrayList<>();
		this.newTeam.add(new Team(1, "Mumbai Indians", "Mumbai"));
		this.newTeam.add(new Team(2, "Chennai Superkings", "Chennai"));
		this.newTeam.add(new Team(3, "Delhi Derdevils", "Delhi"));
	}

	public List<Team> getTeams() {

		return this.newTeam;
	}

}
