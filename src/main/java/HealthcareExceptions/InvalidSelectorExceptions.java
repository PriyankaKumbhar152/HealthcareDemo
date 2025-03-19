package HealthcareExceptions;

public class InvalidSelectorExceptions extends RuntimeException{

String locatorType;
	
	public InvalidSelectorExceptions(String locatorType2) {
		this.locatorType=locatorType;
	}

	
	@Override
	public String getMessage() {
	return "Invalid locator type:"+locatorType;
	}

}


