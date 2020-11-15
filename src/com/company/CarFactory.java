public class CarFactory {
    public ICar getCar (String driveType) {

        if (driveType == null) {
            return null;
        }
        if (driveType.equalsIgnoreCase("BMW")) {
            return new BMW();

        } else if (driveType.equalsIgnoreCase("AUDI")) {
            return new Audi();

        } else if (driveType.equalsIgnoreCase("MERCEDES")) {
            return new Mercedes();
        }
        return null;
    }
}
