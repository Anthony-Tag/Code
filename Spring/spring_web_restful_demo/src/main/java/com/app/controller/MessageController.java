package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Message;
import com.app.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	private MessageService service;
	
	@PostMapping("/message")
	public Message addMessage(@RequestBody Message message) {
		// TODO Auto-generated method stub
		return service.addMessage(message);
	}

	@PutMapping("/message")
	public Message updateMessage(@RequestBody Message message) {
		// TODO Auto-generated method stub
		return service.updateMessage(message);
	}

	@GetMapping("/message/{id}")
	public Message getMessageById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getMessageById(id);
	}

	@GetMapping("/messages")
	public List<Message> getAllMessages() {
		// TODO Auto-generated method stub
		return service.getAllMessages();
	}

	@GetMapping("/messages/{userName}")
	public List<Message> getMessagesByUser(@PathVariable String userName) {
		// TODO Auto-generated method stub
		return service.getMessagesByUser(userName);
	}
	
	@DeleteMapping("/message/{id}")
	public void deleteMessageById(@PathVariable int id) {
		service.deleteMessageById(id);
	}

}
