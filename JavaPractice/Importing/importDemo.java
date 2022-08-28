import java.util.Date;
public class importDemo {
    public String getCurrentDate() {
        Date date = new Date();
        System.out.println("Today's date is " + date);
        return "Today's date is " + date;
    }
}