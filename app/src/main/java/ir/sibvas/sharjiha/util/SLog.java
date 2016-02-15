package ir.sibvas.sharjiha.util;

import android.util.Log;

import ir.sibvas.sharjiha.BuildConfig;


/**
 * Created by alirezaahmadi on 10/25/2015 AD.
 */
public class SLog {
    private static final String LOG_TAG = "alireza";

    public static void d(String msg){
        if(BuildConfig.DEBUG) Log.d(LOG_TAG, msg);
    }
}
