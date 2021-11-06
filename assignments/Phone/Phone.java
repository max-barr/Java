public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;

    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    // abstract method to be implemented by subclasses
    public abstract void displayInfo();

    // getter methods
    public String getVersionNumber() {
        return versionNumber;
    }
    public int getBatteryPercentage() {
        return batteryPercentage;
    }
    public String getCarrier() {
        return carrier;
    }
    public String getRingTone() {
        return ringTone;
    }
    
    // setter methods
    public String setVersionNumber(String number) {
        versionNumber = number;
        return getVersionNumber();
    }
    public int setBatteryPercentage(int percentage) {
        batteryPercentage = percentage;
        return getBatteryPercentage();
    }
    public String setCarrier(String carrier) {
        carrier = carrier;
        return getCarrier();
    }
    public String setRingTone(String tone) {
        ringTone = tone;
        return getRingTone();
    }
    
    

}