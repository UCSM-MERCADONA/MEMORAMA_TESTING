package com.example.braintrainer;
import android.annotation.SuppressLint;
import android.os.Build;
import android.widget.Button;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.robolectric.annotation.Config;
import org.junit.runner.RunWith;
import android.os.Build;

@Config(maxSdk = Build.VERSION_CODES.P, minSdk = Build.VERSION_CODES.P)
@RunWith(RobolectricTestRunner.class)
//@Config(sdk = {Build.VERSION_CODES.O_MR1})
//@Config(constants = BuildConfig.class)
public class Roboelectric {

    private LoginActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(LoginActivity.class);
    }

    @SuppressLint("IgnoreWithoutReason")
    @Test @Ignore("TODO")
    public void clickButton() {
        Button button = activity.findViewById(R.id.login);
        assertNotNull("test button could not be found", button);
        assertEquals("button does not contain text 'Click Me!'", "Click Me", button.getText());
    }

}

