package com.teams.openshift;

import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.teams.openshift.controller.TeamList;
import com.teams.openshift.domain.Team;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OpenshiftApplicationTests {

	@LocalServerPort
	private int port;

	private URL base;

	@Autowired
	private TestRestTemplate template;

	@BeforeEach
	public void setUp() throws Exception {

		this.base = new URL("http://localhost:" + port + "/");

	}

	@Test
	public void getMyTeamsTest() {

		TeamList response = template.getForObject(base.toString(), TeamList.class);
		//List<Team> theList = response.getBody().getTeams();
		
		
		System.out.println(response.getTeams().size());
		response.getTeams().forEach(games -> System.out.println(games));
		
		

		// System.out.println(response.get(0).getTeamId().toString());
		// assert(response.getBody()).equals("");
	}

}
