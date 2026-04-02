package vehicle;

public class GasStation {

    public GasStation() {}

    public void reFuel(Vehicle vehicle) {
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }

    public void setFuel(Vehicle vehicle, int fuel) {
        vehicle.setRemainingFuel(fuel);
    }
}
