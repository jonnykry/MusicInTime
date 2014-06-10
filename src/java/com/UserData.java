import de.umass.lastfm.User;

import java.util.Date;

/**
 * Created by jonnykry on 6/4/14.
 */
public class UserData {

    /*
    * found on http://www.statcrunch.com/5.0/viewreport.php?reportid=28647&groupid=948
    */
    private final static int avgPlaySeconds = 227;

    public static int playcount = 0;

    public static int totalSeconds = 0;

    public static int totalMinutes = 0;

    public static int totalHours = 0;

    public static int totalDays = 0;

    public static int totalYears = 0;

    public static void getData() {

        String key = "***";
        String username = "***";

        User user = User.getInfo(username, key);

        Date registeredDate = user.getRegisteredDate();
        Date currentDate = new Date();

        getTime(user);
    }

    public static void getTime(User user) {
        playcount = user.getPlaycount();
        totalSeconds = playcount * avgPlaySeconds;
        totalMinutes = totalSeconds / 60;
        totalHours = totalMinutes / 60;
        totalDays = totalHours / 24;
        totalYears = totalDays / 365;
    }

}
