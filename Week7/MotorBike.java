package Week7;
public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSideCar;
    }

    @Override
    String getInfo() {
        return "Motor Bike:"
                + "\n\tBrand: " + brand
                + "\n\tModel: " + model
                + "\n\tRegistration Number: " + registrationNumber
                + "\n\tHas Side Car: " + hasSidecar
                + "\n\tBelongs to " + owner.getName()
                + " - " + owner.getAddress();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSideCar) {
        this.hasSidecar = hasSideCar;
    }
}
