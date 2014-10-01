package com.ankitgupta.designPatterns.adapter.charger;

public class TwoPinChargeAdapter implements Charger{

	private TwoPinCharger twoPinCharger;
	
	public TwoPinChargeAdapter(final TwoPinCharger twoPinCharger) {
		this.twoPinCharger = twoPinCharger;
	}
	
	@Override
	public void chargePhone() {
		twoPinCharger.chargeUsingTwoPins();
	}
	
}
