package dev.jibovico.apps.sharem.misc;

import com.google.firebase.crash.FirebaseCrash;

import dev.jibovico.apps.sharem.BuildConfig;

/**
 * Created by HaKr on 23/05/16.
 */

public class CrashReportingManager {

    public static void logException(Exception e) {
        logException(e, false);
    }

    public static void logException(Exception e, boolean log) {
        if(BuildConfig.DEBUG){
            e.printStackTrace();
        } else if(log) {
            FirebaseCrash.report(e);
        }
    }
}
