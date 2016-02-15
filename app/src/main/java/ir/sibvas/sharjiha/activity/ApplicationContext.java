package ir.sibvas.sharjiha.activity;


import android.app.Application;
import android.content.Context;

import ir.sibvas.sharjiha.R;
import ir.sibvas.sharjiha.model.User;
import ir.sibvas.sharjiha.util.DataCache;
import ir.sibvas.sharjiha.util.PreferencesHelper;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class ApplicationContext extends Application {

    public static User currentUser = null;

    private DataCache dataCache;

    public static DataCache getDataCache(Context context){

        if(((ApplicationContext) context.getApplicationContext()).dataCache == null)
            ((ApplicationContext) context.getApplicationContext()).dataCache = new DataCache();

        return ((ApplicationContext) context.getApplicationContext()).dataCache;
    }

    public static void setCurrentUser(User user){
        currentUser = user;
    }

    public static void setCurrentUser(Context context){
        PreferencesHelper help = new PreferencesHelper(context);
        help.setUser(((ApplicationContext) context.getApplicationContext()).currentUser);
    }

    public static User getCurrentUser(){
        return currentUser;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        PreferencesHelper help = new PreferencesHelper(this);
        User user = help.getUser();
        if (user != null)
            this.currentUser = user;

//        Fabric.with(this, new Crashlytics());

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/BHoma.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );

        //Util.dateTimeFormatter = DateTimeFormat.forPattern(Constant.DATETIME_PATTERN);
    }
}