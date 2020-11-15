public class CarFactory {
    public ICar getCar (String carType) {

        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("BMW")) {
            return new BMW();

        } else if (carType.equalsIgnoreCase("AUDI")) {
            return new Audi();

        } else if (carType.equalsIgnoreCase("MERCEDES")) {
            return new Mercedes();
        }
        return null;
    }
}
