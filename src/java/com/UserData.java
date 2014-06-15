package com;

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

    public static double totalYears = 0;
    
    public static String username = "";

    public static void getData() {

        String key = "c64600ddca04dfc310703c59fe1b5230";
        username = "jonnydoesmusic";

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
        totalYears = ((double) totalDays) / 365;
        totalYears = totalDays / 365;
    }

}
