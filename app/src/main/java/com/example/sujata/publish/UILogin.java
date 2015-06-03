package com.example.sujata.publish;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sujata.utilities.AppConstants;
import com.raweng.built.BuiltApplication;
import com.raweng.built.BuiltError;
import com.raweng.built.BuiltResultCallBack;
import com.raweng.built.BuiltUser;
import com.raweng.built.userInterface.BuiltUILoginController;
import com.raweng.built.utilities.BuiltConstant;

/**
 * Created by sujata on 3/6/15.
 */
public class UILogin extends BuiltUILoginController{

    private BuiltApplication builtApplication;
    private EditText username_editText;
    private EditText password_editText;
    private Button login_button;
    private String username_text;
    private String password_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setApplicationKey(AppConstants.PUBLISH_API_KEY);

//        setContentView(R.layout.uilogin_screen);
/*

        username_editText = (EditText) findViewById(R.id.username_editText);
        password_editText = (EditText) findViewById(R.id.password_editText);
        login_button      = (Button) findViewById(R.id.login_button);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username_text = username_editText.getText().toString();
                password_text = password_editText.getText().toString();

                builtApplication = MainApplication.getBuiltApplication();

                BuiltUser builtUser = builtApplication.user();


                builtUser.loginInBackground(username_text, password_text, new BuiltResultCallBack() {
                    @Override
                    public void onCompletion(BuiltConstant.ResponseType responseType, BuiltError builtError) {
                        if (builtError == null) {
                            Log.d("Success", "Successfully logged in");
                        } else {
                            Log.d("Failure", "Login Failed");
                        }
                    }
                });
            }
        });

*/


    }

    @Override
    public void loginSuccess(BuiltUser builtUser) {

    }

    @Override
    public void loginError(BuiltError builtError) {

    }


}
