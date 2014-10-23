package com.acordier.patterns;

public class MediatorApp {

	public static void main(String[] args) {
		Mediator mediator = new MediatorImpl();
		Colleague c1 = new Colleague(mediator, "c1");
		Colleague c2 = new Colleague(mediator, "c2");
		Colleague c3 = new Colleague(mediator, "c3");
		Colleague c4 = new Colleague(mediator, "c4");
		mediator.registerColleague(c1);
		mediator.registerColleague(c2);
		mediator.registerColleague(c3);
		mediator.registerColleague(c4);
		c1.send("Hello world !");		
	}

}
