public class IPhone extends Phone implements Ringable {
    // Constructor
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return getRingTone();
    }

    @Override
    public String unlock() {
        return "Your iPhone is unlocked.";
    }

    @Override
    public void displayInfo() {
        System.out.printf("Version: %s%nBattery: %d%nCarrier: %s%nRing Tone: %s%n", getVersionNumber(), getBatteryPercentage(), getCarrier(), getRingTone());
    }
}