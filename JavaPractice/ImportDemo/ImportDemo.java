// Importing the Date class
import java.util.Date;
public class ImportDemo {
    public String getCurrentDate() {
        Date date = new Date();
        System.out.println("Today's date is " + date);
        return "Today's date is " + date;
    }
}