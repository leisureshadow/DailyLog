package chc.dailylog;

import java.util.Hashtable;

/**
 * Created by CHC on 2017/12/8.
 */

public class Config {
    // List all your vehicle name into this array
    final static String[] vehicle = {};
    // put the key-value pair of your vehicle name and its google sheet id e.g. put("XXX",  "$google_sheet_id")
    final static Hashtable sheetIDTable= new Hashtable<String, String>() {{}};
}
