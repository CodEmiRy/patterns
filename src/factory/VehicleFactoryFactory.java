package factory;

public class VehicleFactoryFactory {
    private static VehicleFactoryFactory vehicleFactoryFactoryInstance;

    private VehicleFactoryFactory() {
    }

    public static VehicleFactoryFactory getInstance() {
        if (vehicleFactoryFactoryInstance == null) {
            vehicleFactoryFactoryInstance = new VehicleFactoryFactory();
        }
        return vehicleFactoryFactoryInstance;
    }

    public Vehicle getVehicle(VehicleFactoryEnum vehicleFactoryEnum) {
        switch (vehicleFactoryEnum) {
            case PLANE: {
                return new Plane();
            }
            case SHEEP: {
                return new Sheep();
            }
            case CAR: {
                return new Car();
            }
            default: {
                return null;
            }
        }
    }
}