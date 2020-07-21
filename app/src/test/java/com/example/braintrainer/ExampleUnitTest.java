package com.example.braintrainer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.robolectric.Shadows.shadowOf;

import android.content.Intent;
import android.widget.Button;

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
    private Principal Principal;

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
     @Test
    public void loginUser() {
        /** BOTON LOGIN **/
         LoginActivity mActivity = new LoginActivity();
         Intent expectedIntent = new Intent(activity, Principal.class);
         Intent actual = new Intent(activity, Principal.class);
         assertEquals(expectedIntent.getComponent(), actual.getComponent());
     }

    @Test
    public void Registro() {
        /** BOTON REGISTRAR **/
        LoginActivity mActivity = new LoginActivity();
        Intent expectedIntent = new Intent(activity, Principal.class);
        Intent actual = new Intent(activity, Memo_Nivel_Intermedio.class);
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
    @Test
    public void InstanciadePrincipalaMemorama(){
        Principal mPrincipal = new Principal();
        Intent expectedIntent = new Intent(activity, NivelesMemorama.class);
        Intent actual = new Intent(activity, NivelesMemorama.class);
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
    @Test
    public void IniciodeLaaplicacion(){
        MainActivity MainActivity = new MainActivity();
        Intent actual = new Intent(MainActivity, Principal.class);
        MainActivity.startActivity(actual);
        assertNotNull(actual);
    }
    @Test
    public void instancemediodificil(){
        Memo_Nivel_Intermedio mIntermedio = new Memo_Nivel_Intermedio();
        Intent expectedIntent = new Intent(activity, MemoNivelDificil.class);
        Intent actual = new Intent(activity, MemoNivelDificil.class);
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
   @Test
    public void instanceeasyamedio(){
        MemoNivelFacil MainActivity = new MemoNivelFacil();
        Intent actual = new Intent(MainActivity, Memo_Nivel_Intermedio.class);
        MainActivity.startActivity(actual);
        assertNotNull(actual);
    }

            /** TextView textView = (TextView) mActivity.findViewById(R.id.Mercadoña);
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
*
             * @return*/

            @Test
            public void boton_registro(){
                Registro mRegistro = new Registro();
                //Button button = mRegistro.findViewById(R.id.Registrate);
                //assertNotNull(button);
                assertNotNull(mRegistro.performClick());
                //assertNotNull("test button could not be found", button);
                assertFalse(mRegistro.performClick());
                //assertEquals("button does not contain text 'Click Me!'", "Usuario Registrado", mRegistro.performClick_boton_registro());
                /** LoginActivity mActivity = new LoginActivity();
                 assertTrue(mActivity.performClick());
                 /**int bottomMargin = ((LinearLayout.LayoutParams) registro.getLayoutParams()).bottomMargin;
                 assertEquals(5, bottomMargin);
                 int topMargin = ((LinearLayout.LayoutParams) registro.getLayoutParams()).topMargin;
                 assertEquals(5, topMargin);
                 int rightMargin = ((LinearLayout.LayoutParams) registro.getLayoutParams()).rightMargin;
                 assertEquals(10, rightMargin);
                 int leftMargin = ((LinearLayout.LayoutParams) registro.getLayoutParams()).leftMargin;
                 assertEquals(10, leftMargin);**/


            }
    @Test
    public void boton_login(){
        LoginActivity mLog = new LoginActivity();
        //Button button = mLog.findViewById(R.id.login);
        //assertNotNull(button);
        assertNotNull(mLog.performClick());
        //assertNotNull("test button could not be found", button);
        assertFalse(mLog.performClick());
        //assertEquals("button does not contain text 'Click Me!'", "Usuario Registrado", mLog.performClick_boton_registro());


    }
    @Test
    public void boton_aceptar(){
        Registro mRegistro = new Registro();
        //Button button = mRegistro.findViewById(R.id.Registrate);
        //assertNotNull(button);
        assertNotNull(mRegistro.performClick());
        //assertNotNull("test button could not be found", button);
        assertFalse(mRegistro.performClick());
        //assertEquals("button does not contain text 'Click Me!'", "Usuario Registrado", mRegistro.performClick_boton_registro());


    }
    @Test
    public void boton_salir(){
        Registro mRegistro = new Registro();
        //Button button = mRegistro.findViewById(R.id.Registrate);
        //assertNotNull(button);
        assertNotNull(mRegistro.performClick());
        //assertNotNull("test button could not be found", button);
        assertFalse(mRegistro.performClick());
        //assertEquals("button does not contain text 'Click Me!'", "Usuario Registrado", mRegistro.performClick_boton_registro());

    }
    @Test
    public void Registro_instance() {
        /** BOTON REGISTRAR **/
        Registro mReg = new Registro();
        Intent expectedIntent = new Intent(mReg, Principal.class);
        Intent actual = new Intent(mReg, Memo_Nivel_Intermedio.class);
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
    @Test
    public void PrincipalaRegistro() {

        Principal mPrincipal = new Principal();
        Intent expectedIntent = new Intent(mPrincipal, Registro.class);
        Intent actual = new Intent(mPrincipal, Registro.class);
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    @Test
    public void LoginaRegistro() {

        LoginActivity mReg = new LoginActivity();
        Intent expectedIntent = new Intent(mReg, Registro.class);
        Intent actual = new Intent(mReg, Registro.class);
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
    @Test
    public void NivelesFiguraDiferentes() {

        NivelesMemorama mReg = new NivelesMemorama();
        Intent expectedIntent = new Intent(mReg, NivelesFiguraDiferente.class);
        Intent actual = new Intent(mReg, NivelesFiguraDiferente.class);
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

}
