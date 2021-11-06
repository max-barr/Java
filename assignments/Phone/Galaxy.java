public class Galaxy extends Phone implements Ringable {
    
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return getRingTone();
    }

    @Override
    public String unlock() {
        return "Your Galaxy is unlocked";
    }

    @Override
    public void displayInfo() {
        System.out.println(getVersionNumber());
        System.out.println(getBatteryPercentage());
        System.out.println(getCarrier());
        System.out.println(getRingTone());
    }
}