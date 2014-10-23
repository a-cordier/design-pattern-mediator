package com.acordier.patterns;

public abstract class AbstractColleague {
	protected Mediator mediator;
	protected String name;
	
	public AbstractColleague(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);
}
