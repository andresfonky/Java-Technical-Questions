package interfaces.multiple;

//The code simply won't compile, as there's a conflict caused by multiple 
//interface inheritance (a.k.a the Diamond Problem). The Car class would
//inherit both sets of default methods. Which ones should be called then?
//To solve this ambiguity, we must explicitly provide an implementation for 
//the methods
public class Car implements Vehicle, Alarm {
	 
    private String brand;
     
    // constructors/getters
    
    public Car(String brand) {
    	this.brand = brand;
    }
     
    @Override
    public String getBrand() {
        return this.brand;
    }
     
    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }
     
    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }

    // Implementation of the default method, needed because is available in two interfaces
	@Override
	public String turnAlarmOff() {
		return Vehicle.super.turnAlarmOff() + Alarm.super.turnAlarmOff();
	}

	@Override
	public String turnAlarmOn() {
		return Vehicle.super.turnAlarmOn() + Alarm.super.turnAlarmOn();
	}
}