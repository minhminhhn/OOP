package Week7;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove.
     * @param registrationNumber e.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getRegistrationNumber() == registrationNumber) {
                vehicleList.remove(i);
            }
        }
    }

    /**
     * get.
     * @return s.
     */
    public String getVehiclesInfo() {
        String s;
        if (vehicleList.size() == 0) {
            s = name + " has no vehicle!\n";
        } else {
            s = name + " has:\n";
            for (int i = 0; i < vehicleList.size(); i++) {
                s += "\n" + vehicleList.get(i).getInfo();
            }
        }
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
