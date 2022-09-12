public class Galaxy extends Phone implements Ringable {
    // Constructor
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return getRingTone();
    }

    @Override
    public String unlock() {
        return "Your Galaxy phone is unlocked.";
    }

    @Override
    public void displayInfo() {
        System.out.printf("Version: %s%nBattery: %d%nCarrier: %s%nRing Tone: %s%n", getVersionNumber(), getBatteryPercentage(), getCarrier(), getRingTone());
    }
}