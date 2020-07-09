package com.example.braintrainer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.robolectric.Shadows.shadowOf;

import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadow.api.Shadow;
import org.robolectric.shadows.ShadowMediaStore;
import org.robolectric.shadows.ShadowView;
import com.example.braintrainer.BuildConfig;
import com.example.braintrainer.R;
import com.example.braintrainer.LoginActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import org.junit.Test;
import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    /**Queremos escribir una prueba que afirme que cuando un usuario hace clic en un botón, la aplicación inicia LoginActivity.**/
    private LoginActivity activity;
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
     @Test
    public void loginUser() {
             LoginActivity mActivity;
             TextView textView = (TextView) activity.findViewById(R.id.Mercadoña);
             int bottomMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).bottomMargin;
             assertEquals(5, bottomMargin);
             int topMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).topMargin;
             assertEquals(5, topMargin);
             int rightMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).rightMargin;
             assertEquals(10, rightMargin);
             int leftMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin;
             assertEquals(10, leftMargin);
     }public void setUp() throws Exception {

        activity = Robolectric.buildActivity(LoginActivity.class)
                .create()
                .resume()
                .get();
    }

    @Test
    public void shouldHaveDefaultMargin() throws Exception {
        TextView textView = (TextView) activity.findViewById(R.id.Mercadoña);
        int bottomMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).bottomMargin;
        assertEquals(5, bottomMargin);
        int topMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).topMargin;
        assertEquals(5, topMargin);
        int rightMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).rightMargin;
        assertEquals(10, rightMargin);
        int leftMargin = ((LinearLayout.LayoutParams) textView.getLayoutParams()).leftMargin;
        assertEquals(10, leftMargin);
    }

    @Test
    public void clickingButton_shouldChangeMessage() {
        LoginActivity activity = Robolectric.setupActivity(LoginActivity.class);
        activity.findViewById(R.id.login).performClick();
        Intent expectedIntent = new Intent(activity, NivelesMemorama.class);
        Intent actual = shadowOf(RuntimeEnvironment.application).getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
}
