public class Galaxy extends Phone implements Ringable {
    // Constructor
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return "Your Galaxy phone is ringing.";
    }

    @Override
    public String unlock() {
        return "Your Galaxy phone is unlocked.";
    }

    @Override
    public void displayInfo() {
        System.out.printf("Version: %s%n Battery: %d%n Carrier: %s%n Ring Tone: %s", getVersionNumber(), getBatteryPercentage(), getCarrier(), getRingTone());
    }
}