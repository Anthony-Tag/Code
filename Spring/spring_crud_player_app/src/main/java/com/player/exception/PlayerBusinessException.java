package com.player.exception;

public class PlayerBusinessException extends RuntimeException{

	private static final long serialVersionUID = 1l;
	
	public PlayerBusinessException() {
		super();
	}
	
	public PlayerBusinessException(final String message) {
		super(message);
	}
}
