package ir.sibvas.sharjiha.util;

import android.content.Context;
import android.content.SharedPreferences;

import ir.sibvas.sharjiha.model.User;


public class PreferencesHelper {

    private SharedPreferences sharedPreferences;
    private static final String PREFERENCES_NAME = "lgshop_main_pref";

    private static final String USER_ID = "user_id";
    private static final String USER_TOKEN = "token";
    private static final String USER_NAME = "name";
    private static final String USER_FAMILY = "family";
    private static final String USER_USERNAME = "username";


    public static final String KEY_SHOW_TYPE = "show_type";

    public void setUser(User user){
//        putInt(USER_ID, user.getId());
//        putString(USER_TOKEN, user.getToken());
//        putString(USER_USERNAME, user.getUsername());
//        putString(USER_NAME, user.getName());
//        putString(USER_FAMILY, user.getFamily());
    }

    public User getUser(){
        User user = new User();

//        user.setId(getInt(USER_ID));
//        if (user.getId() < 0) return null;
//
//        user.setToken(getString(USER_TOKEN));
//        if (user.getToken() == null) return null;
//
//        user.setUsername(getString(USER_USERNAME));
//        if (user.getUsername() == null) return null;
//
//        user.setName(getString(USER_NAME));
//        if (user.getName() == null) return null;
//
//        user.setFamily(getString(USER_FAMILY));
//        if (user.getFamily() == null) return null;

        return user;
    }

    public PreferencesHelper(Context context){
        sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public boolean getBoolean(String key){
        return sharedPreferences.getBoolean(key, false);
    }

    public void putBoolean(String key, boolean value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public String getString(String key){
        return sharedPreferences.getString(key, null);
    }

    public void putString(String key, String value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public int getInt(String key){
        return sharedPreferences.getInt(key, -1);
    }

    public void putInt(String key, int value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }


}




