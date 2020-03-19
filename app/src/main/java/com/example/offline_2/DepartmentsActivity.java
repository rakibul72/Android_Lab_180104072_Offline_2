package com.example.offline_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DepartmentsActivity extends AppCompatActivity implements View.OnClickListener{

    Button backtomainActivityButton;
    ImageView CSEImageView,EEEImageView,MEImageView,TEImageView,CivilImageView,ArchitectureImageView,IPEImageView,BBAImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);

        backtomainActivityButton=(Button)findViewById(R.id.departmentbackButtonId);
        backtomainActivityButton.setOnClickListener(this);

        CSEImageView=(ImageView)findViewById(R.id.CSEImgId);
        EEEImageView=(ImageView)findViewById(R.id.EEEImgId);

        EEEImageView.setOnClickListener(this);
        CSEImageView.setOnClickListener(this);

        MEImageView=(ImageView)findViewById(R.id.MEImgId);
        MEImageView.setOnClickListener(this);
        TEImageView=(ImageView)findViewById(R.id.TEImgId);
        TEImageView.setOnClickListener(this);
        CivilImageView=(ImageView)findViewById(R.id.CivilImgId);
        CivilImageView.setOnClickListener(this);
        ArchitectureImageView=(ImageView)findViewById(R.id.ArchitectureImgId);
        ArchitectureImageView.setOnClickListener(this);
        IPEImageView=(ImageView)findViewById(R.id.IPEImgId);
        IPEImageView.setOnClickListener(this);
        BBAImageView=(ImageView)findViewById(R.id.BBAImgId);
        BBAImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.CSEImgId)
        {
            CSEImageView.setVisibility(v.GONE);
            EEEImageView.setVisibility(v.VISIBLE);
        }

        else if(v.getId()==R.id.EEEImgId)
        {
            EEEImageView.setVisibility(v.GONE);
            ArchitectureImageView.setVisibility(v.VISIBLE);
        }

        else if(v.getId()==R.id.ArchitectureImgId)
        {
            ArchitectureImageView.setVisibility(v.GONE);
            TEImageView.setVisibility(v.VISIBLE);
        }

        else if(v.getId()==R.id.TEImgId)
        {
            TEImageView.setVisibility(v.GONE);
            MEImageView.setVisibility(v.VISIBLE);
        }

        else if(v.getId()==R.id.MEImgId)
        {
            MEImageView.setVisibility(v.GONE);
            IPEImageView.setVisibility(v.VISIBLE);
        }

        else if(v.getId()==R.id.IPEImgId)
        {
            IPEImageView.setVisibility(v.GONE);
            CivilImageView.setVisibility(v.VISIBLE);
        }

        else if(v.getId()==R.id.CivilImgId)
        {
            CivilImageView.setVisibility(v.GONE);
            BBAImageView.setVisibility(v.VISIBLE);
        }

        else if(v.getId()==R.id.BBAImgId)
        {
            BBAImageView.setVisibility(v.GONE);
            CSEImageView.setVisibility(v.VISIBLE);
        }

        else if(v.getId()==R.id.departmentbackButtonId)
        {
            Intent backIntent=new Intent(DepartmentsActivity.this,MainActivity.class);
            startActivity(backIntent);
        }

    }
}
