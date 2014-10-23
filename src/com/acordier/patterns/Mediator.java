package com.acordier.patterns;

public interface Mediator {
	public void sendMessage(String message, AbstractColleague colleague);
	void registerColleague(AbstractColleague colleague);
}
