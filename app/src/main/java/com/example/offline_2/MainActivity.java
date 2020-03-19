package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button AboutButton,DepartmentsButton,AdmissionProcedureButton,TuitionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AboutButton=(Button) findViewById(R.id.aboutButtonId);
        AboutButton.setOnClickListener(this);
        DepartmentsButton=(Button) findViewById(R.id.departmentsButtonId);
        DepartmentsButton.setOnClickListener(this);
        AdmissionProcedureButton=(Button) findViewById(R.id.AdmissionButtonId);
        AdmissionProcedureButton.setOnClickListener(this);
        TuitionButton=(Button) findViewById(R.id.tuitionButtonId);
        TuitionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.aboutButtonId)
        {
            Intent aboutIntent=new Intent(MainActivity.this,AboutActivity.class);
            startActivity(aboutIntent);
        }

        if(v.getId()== R.id.departmentsButtonId)
        {
            Intent departmentsIntent=new Intent(MainActivity.this,DepartmentsActivity.class);
            startActivity(departmentsIntent);
        }

        if(v.getId()== R.id.AdmissionButtonId)
        {
            Intent admissionIntent=new Intent(MainActivity.this,AdmissionActivity.class);
            startActivity(admissionIntent);
        }

        if(v.getId()== R.id.tuitionButtonId)
        {
            Intent tuitionIntent=new Intent(MainActivity.this,TuitionActivity.class);
            startActivity(tuitionIntent);
        }
    }
}
