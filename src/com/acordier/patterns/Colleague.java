package com.acordier.patterns;

public class Colleague extends AbstractColleague{

	public Colleague(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.printf("%s - message sent: %s\n", this.name, message);
		this.mediator.sendMessage(message, this);
		
	}

	@Override
	public void receive(String message) {
		System.out.printf("%s - message received: %s\n", this.name, message);	
	}
	
}
