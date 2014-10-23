package com.acordier.patterns;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
	
	private List<AbstractColleague> colleagues;
	
	public MediatorImpl(){
		this.colleagues = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String message, AbstractColleague colleague) {
		for(AbstractColleague col : colleagues){
			if(col!=colleague){
				col.receive(message);
			}
		}
	}

	@Override
	public void registerColleague(AbstractColleague colleague) {
		this.colleagues.add(colleague);
	}

}
