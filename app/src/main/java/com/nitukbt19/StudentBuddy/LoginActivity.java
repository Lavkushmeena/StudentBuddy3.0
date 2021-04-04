package com.nitukbt19.StudentBuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.nitukbt19.StudentBuddy.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    ProgressDialog progressDialog;
    FirebaseAuth mauth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // Progress Dialog
        progressDialog=new ProgressDialog(LoginActivity.this);
        progressDialog.setTitle("Logging In");
        progressDialog.setMessage("Welcome Back");
        //
        binding.tvSignUp.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this,RegisterActivity.class)));
        binding.btnLogin.setOnClickListener(v -> {
            progressDialog.show();
            mauth.signInWithEmailAndPassword(binding.inputEmail.getText().toString(),binding.etPassword.getText().toString()).
                    addOnCompleteListener(task -> {
                        progressDialog.dismiss();
                        if(task.isSuccessful()){
                            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(LoginActivity.this,task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }
                    });
        });
//        if we want auto sign up()
//        if(mauth.getCurrentUser()!=null){
//            startActivity(new Intent(LoginActivity.this,MainActivity.class));
//        }
    }
}