package delivery;

public class DeliveryUtil {
    public static void startDelivery(Vehicle vehicle, String address) {
        vehicle.deliver(address);
    }
}