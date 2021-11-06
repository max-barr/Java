public class IPhone extends Phone implements Ringable {
    
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return getRingTone();
    }

    @Override
    public String unlock() {
        return "Your iPhone is unlocked";
    }

    @Override
    public void displayInfo() {
        System.out.println(getVersionNumber());
        System.out.println(getBatteryPercentage());
        System.out.println(getCarrier());
        System.out.println(getRingTone());
    }
}