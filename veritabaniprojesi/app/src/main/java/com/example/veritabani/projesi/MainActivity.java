package com.example.veritabani.projesi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {


    private EditText editUser,editPass;
    private  String txtUser,txtPass;
    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_yap);
        editUser=(EditText)findViewById(R.id.giris_username);
        editPass=(EditText)findViewById(R.id.giris_pass);

        mAuth=FirebaseAuth.getInstance();
    }

    public void girisYap(View view){
        txtUser=editUser.getText().toString();
        txtPass=editPass.getText().toString();

        if(!TextUtils.isEmpty(txtUser) && !TextUtils.isEmpty(txtPass)){
            mAuth.signInWithEmailAndPassword(txtUser,txtPass)
                    .addOnSuccessListener(this, new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            mUser=mAuth.getCurrentUser();
                            Toast.makeText(this,"Giriş Başarılı",Toast.LENGTH_SHORT).show();

                        }
                    }).addOnFailureListener(this, new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(GirisYap.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            });
        }
        else{
            Toast.makeText(this,"Kullanıcı adı veya şifre boş olamaz",Toast.LENGTH_SHORT).show();
        }

    }
}