package com.player.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.model.Player;
import com.player.repository.PlayerRepository;
import com.player.service.PlayerSearchService;

@Service
public class PlayerSearchServiceImpl implements PlayerSearchService {

	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}

	@Override
	public List<Player> getPlayersByName(String name) {
		// TODO Auto-generated method stub
		return playerRepository.findByName(name);
	}

	@Override
	public List<Player> getPlayersByAge(int age) {
		// TODO Auto-generated method stub
		return playerRepository.findByAge(age);
	}

	@Override
	public List<Player> getPlayersByCity(String city) {
		// TODO Auto-generated method stub
		return playerRepository.findByCity(city);
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return playerRepository.findByTeamName(teamName);
	}

}

