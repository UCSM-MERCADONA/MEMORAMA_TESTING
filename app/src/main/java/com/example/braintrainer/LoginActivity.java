package com.example.braintrainer;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static java.util.Objects.isNull;

public class LoginActivity extends AppCompatActivity {

    public Button registro , Login;
    private EditText Usuario , Contraseña;
    private String NombreUsuario ="";
    private String ContraseñaUsuario="";
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        registro = (Button) findViewById(R.id.Registrate);
        Usuario = (EditText) findViewById(R.id.username);
        Contraseña = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.login);
        mAuth = FirebaseAuth.getInstance();
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this , Registro.class);
                startActivity(i);
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {

                NombreUsuario = Usuario.getText().toString();
                ContraseñaUsuario = Contraseña.getText().toString();
                if(!NombreUsuario.isEmpty() && !ContraseñaUsuario.isEmpty()){
                    loginUser();
                }else{
                    Toast.makeText(LoginActivity.this,"Debe completar todos los campos",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void loginUser() {
        mAuth.signInWithEmailAndPassword(NombreUsuario, ContraseñaUsuario).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent i = new Intent(LoginActivity.this , Principal.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this,"No se pudo inicar sesion compruebe los datos o registrese",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}