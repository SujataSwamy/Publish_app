package com.example.sujata.publish;

import android.app.Application;

import com.example.sujata.utilities.AppConstants;
import com.raweng.built.Built;
import com.raweng.built.BuiltApplication;
import com.raweng.built.utilities.BuiltAppConstants;

/**
 * Created by sujata on 3/6/15.
 */
public class MainApplication extends Application {

    static BuiltApplication builtApplication;

    public static BuiltApplication getBuiltApplication(){
        return builtApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        try {
             builtApplication = Built.application(getApplicationContext(), AppConstants.PUBLISH_API_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
