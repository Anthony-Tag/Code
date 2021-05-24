package com.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.player.exception.PlayerBusinessException;
import com.player.model.Player;
import com.player.service.PlayerCrudService;

@RestController
public class PlayerCrudController {

	@Autowired
	private PlayerCrudService playerCrudService;

	@PostMapping("/player")
	@ExceptionHandler(PlayerBusinessException.class)
	public ResponseEntity<Object> addPlayer(@RequestBody Player player) {
//		return playerCrudService.addPlayer(player);
		try {
			return new ResponseEntity<Object>(playerCrudService.addPlayer(player),HttpStatus.OK);
		}catch(PlayerBusinessException e) {
			return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/player")
	@ExceptionHandler(PlayerBusinessException.class)
	public ResponseEntity<Object> updatePlayer(@RequestBody Player player) {
//		return playerCrudService.updatePlayer(player);
		try {
			return new ResponseEntity<Object>(playerCrudService.updatePlayer(player),HttpStatus.OK);
		}catch(PlayerBusinessException e) {
			return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/player/{id}")
	@ExceptionHandler(PlayerBusinessException.class)
	public ResponseEntity<Object> getPlayerById(@PathVariable int id) {
		
	//	return playerCrudService.getPlayerById(id);
		try {
			return new ResponseEntity<Object>(playerCrudService.getPlayerById(id),HttpStatus.OK);
		}catch(PlayerBusinessException e) {
			return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/player/{id}")
	@ExceptionHandler(PlayerBusinessException.class)
	public void deletePlayer(@PathVariable int id) {
		playerCrudService.deletePlayer(id);
//		try {
//			new ResponseEntity<Object>(playerCrudService.deletePlayer(id),HttpStatus.OK);
//		}catch(PlayerBusinessException e) {
//			new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
//		}
	}

}
