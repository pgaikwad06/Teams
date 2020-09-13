package com.teams.openshift.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

	@RequestMapping("/")
	public TeamList getMyteams() {

		TeamList myTeams = new TeamList();
		
		System.out.println(myTeams.getTeams().size());
		return myTeams;
	}

	
    
	/*
	 * @RequestMapping("/") public String getMyteams() {
	 * 
	 * 
	 * return "Hello World !"; }
	 */

}
