package com.ankitgupta.designPatterns.adapter.charger;

public class ThreePinChargeAdapter implements Charger{

	private ThreePinCharger threePinCharger;
	
	public ThreePinChargeAdapter(final ThreePinCharger threePinCharger) {
		this.threePinCharger = threePinCharger;
	}
	
	@Override
	public void chargePhone() {
		threePinCharger.chargeUsingThreePins();
	}
	
}
