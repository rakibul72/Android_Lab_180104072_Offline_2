package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{

    Button backtomainActivityButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        backtomainActivityButton=(Button)findViewById(R.id.aboutbackButtonId);
        backtomainActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.aboutbackButtonId)
        {
            Intent backIntent=new Intent(AboutActivity.this,MainActivity.class);
            startActivity(backIntent);
        }
    }
}
