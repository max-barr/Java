public class IPhone extends Phone implements Ringable {
    // Constructor
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return "Your iPhone is ringing.";
    }

    @Override
    public String unlock() {
        return "Your iPhone is unlocked.";
    }

    @Override
    public void displayInfo() {
        System.out.printf("Version: %s%n Battery: %d%n Carrier: %s%n Ring Tone: %s", getVersionNumber(), getBatteryPercentage(), getCarrier(), getRingTone());
    }
}