package com.example.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;


import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {
    private FirebaseUser currentUser;
    private FirebaseAuth mAuth;
    private DatabaseReference database;
    private DatabaseReference rootRef;
    private String currentUserID, id;

    private Button createAcctButton;
    private EditText userEmail, userPassword, userPhone;
    private TextView alreadyhaveanacct;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        database = FirebaseDatabase.getInstance().getReference();
        mAuth = FirebaseAuth.getInstance();
        rootRef = database;

        initializeFields();

        alreadyhaveanacct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
        createAcctButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 createNewAcct();
            }
        });
    }

    private void createNewAcct() {
        String email = userEmail.getText().toString().trim();
        String password = userPassword.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            userEmail.setError("Please Enter Emaill...");
        }
        if(TextUtils.isEmpty(password)){
            userPassword.setError("Please Enter Password");
        }
        else {
            progressDialog.setTitle("Creating New Account...");
            progressDialog.setMessage("Pls wait");
            progressDialog.setCanceledOnTouchOutside(true);
            progressDialog.show();

            mAuth.createUserWithEmailAndPassword(email, password).
                    addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if(task.isSuccessful()){

                                String deviceToken = FirebaseInstanceId.getInstance().getToken();
                                String currentUserId = mAuth.getCurrentUser().getUid().toString();

                                rootRef.child("Users").child(currentUserId).push().setValue("");

                                rootRef.child("Users").child(currentUserId).push().child("device_token")
                                        .setValue(deviceToken);

                                Log.d("pushed", "registered to database");

                                String pho = userPhone.getText().toString().trim();
                                HashMap<String, String> profileMap = new HashMap<>();
                                profileMap.put("phone", pho);
                                rootRef.child("Users").child(currentUserId).setValue(profileMap);


                                takeUserToMainActivity();

                                Toast.makeText(RegisterActivity.this,
                                        "Registration Successful", Toast.LENGTH_SHORT).show();
                                takeUserToMainActivity();
                                Log.d("change activity", "started main activity successfully");
                                progressDialog.dismiss();
                            }else{
                                String message = task.getException().toString();
                                Toast.makeText(RegisterActivity.this,
                                        "Sorry "+ message, Toast.LENGTH_SHORT).show();
                                progressDialog.dismiss();
                            }
                        }
                    });
//
        }
    }

    private void takeUserToMainActivity() {
        Intent intent = new Intent(RegisterActivity.this,
                MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    private void initializeFields() {
        createAcctButton = (Button) findViewById(R.id.register_button);
        userEmail = (EditText) findViewById(R.id.register_email);
        userPassword = findViewById(R.id.register_password);
        alreadyhaveanacct = findViewById(R.id.back_to_login);
        userPhone = findViewById(R.id.phone_number);
        progressDialog = new ProgressDialog(RegisterActivity.this);

    }
}
