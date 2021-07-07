package com.player.service.impl;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.player.exception.PlayerBusinessException;
import com.player.model.Player;
import com.player.service.PlayerCrudService;

@Service
public class PlayerCrudServiceImpl implements PlayerCrudService {

//	@Autowired
//	private PlayerRepository playerRepository;
//	
	private String url="http://localhost:8000/player/";
	private RestTemplate restTemplate=new RestTemplate();
	
	@Override
	public Player addPlayer(Player player) {
		return restTemplate.postForObject(url, player, Player.class);
	}

	@Override
	public Player updatePlayer(Player player) {
		try {
			ResponseEntity<Player> playerTemp=restTemplate.exchange(url+player, HttpMethod.PUT,null,Player.class);
			return playerTemp.getBody();
		}catch(HttpClientErrorException e) {
			throw new PlayerBusinessException(e.getMessage());
		}
	}

	@Override
	public Player getPlayerById(int id) {
		try {
		ResponseEntity<Player> player=restTemplate.exchange(url+id, HttpMethod.GET,null,Player.class);
		return player.getBody();
		}catch(HttpClientErrorException e) {
			throw new PlayerBusinessException(e.getMessage());
		}
	}

	@Override
	public void deletePlayer(int id) {
		try {
			ResponseEntity<Player> player=restTemplate.exchange(url+id, HttpMethod.DELETE,null,Player.class);
			System.out.println(id+ " is deleted");

		}catch(HttpClientErrorException e) {
			throw new PlayerBusinessException(e.getMessage());
		}
	}

}
