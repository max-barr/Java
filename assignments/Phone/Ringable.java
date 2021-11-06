public interface Ringable {
    
    default String ring() {
        return "Your phone is ringing";
    }

    default String unlock() {
        return "Your phone is unlocked";
    }
}