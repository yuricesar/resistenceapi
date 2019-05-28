package com.rebels.resistenceapi.models;

public class Market {
	
	public void trade(Rebel rebelOne, Rebel rebelTwo) throws Exception {
		if (rebelOne.isBetrayer() || rebelTwo.isBetrayer()) {
			throw new Exception("Trade between betrayers is forbidden!");
		}
		else {
			
		}
		
	}

}
