package com.teams.openshift.domain;

public class Team {

	private Integer teamId;
	private String teamName;
	private String teamLocation;

	
	public Team(Integer id, String name, String location) {
		this.teamId = id;
		this.teamName = name;
		this.teamLocation = location;

	}

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamLocation() {
		return teamLocation;
	}

	public void setTeamLocation(String teamLocation) {
		this.teamLocation = teamLocation;
	}

}
