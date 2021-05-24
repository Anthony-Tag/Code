package com.player.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.player.model.Player;
import com.player.service.PlayerSearchService;

@Service
public class PlayerSearchServiceImpl implements PlayerSearchService {

	private String url = "http://localhost:7000/players/";
	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public List<Player> getAllPlayers() {
		
		ResponseEntity<List<Player>> entity=restTemplate.exchange(url, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Player>>() {
				}
				);
		
		return entity.getBody();
	}

	@Override
	public List<Player> getPlayersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

}
