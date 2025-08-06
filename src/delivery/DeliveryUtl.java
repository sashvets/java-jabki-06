package delivery;

public class DeliveryUtl {
    public static void startDelivery(Vehicle vehicle, String address) {
        vehicle.deliver(address);
    }
}