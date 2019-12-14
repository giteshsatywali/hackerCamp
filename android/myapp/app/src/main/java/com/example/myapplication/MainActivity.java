package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.myapplication.api.*;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVars();
    }

    private void initVars(){
        name = findViewById(R.id.ma_ti_name);
        email = findViewById(R.id.ma_ti_email);
        register = findViewById(R.id.btn_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    ApiCaller apiCaller = new ApiCaller();
                    apiCaller.invokeApi(getApplicationContext());
                }
        });
    }
}
