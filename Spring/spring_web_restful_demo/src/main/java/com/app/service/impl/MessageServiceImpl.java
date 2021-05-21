package com.app.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.app.model.Message;
import com.app.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	private static Map<Integer, Message> map=new HashMap<>();
	private static int counter=0;
	@Override
	public Message addMessage(Message message) {
		// TODO Auto-generated method stub
		message.setId(++counter);
		map.put(counter, message);
		return message;
	}

	@Override
	public Message updateMessage(Message message) {
		map.put(message.getId(), message);
		return message;
	}

	@Override
	public Message getMessageById(int id) {
		// TODO Auto-generated method stub
		return map.get(id);
	}

	@Override
	public List<Message> getAllMessages() {
		// TODO Auto-generated method stub
		return new ArrayList<>(map.values());
	}

	@Override
	public List<Message> getMessagesByUser(String userName) {
		// TODO Auto-generated method stub
		List<Message> messages=new ArrayList<>();
		for(Map.Entry<Integer, Message> e:map.entrySet()) {
			if(e.getValue().getUserName().equals(userName)) {
				messages.add(e.getValue());
			}
		}
		return messages;
	}

	@Override
	public void deleteMessageById(int id) {
		// TODO Auto-generated method stub
		map.remove(id);
	}

}
