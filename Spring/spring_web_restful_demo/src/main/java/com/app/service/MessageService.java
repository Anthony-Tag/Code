package com.app.service;

import java.util.List;

import com.app.model.Message;

public interface MessageService {

	public Message addMessage(Message message);
	public Message updateMessage(Message message);
	public Message getMessageById(int id);
	public List<Message> getAllMessages();
	public List<Message> getMessagesByUser(String userName);
	public void deleteMessageById(int id);
}
