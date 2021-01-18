package com.edureka.training.intents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView tvContacts;
    ImageView ivFace, ivPhone, ivWebsite, ivLocation;
    Button btnContact;

    final int ACTIVITY2 = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvContacts = findViewById(R.id.tvContacts);
        ivFace = findViewById(R.id.ivFace);
        ivPhone = findViewById(R.id.ivPhone);
        ivWebsite = findViewById(R.id.ivWebsite);
        ivLocation = findViewById(R.id.ivLocation);
        btnContact = findViewById(R.id.layout);

        ivFace.setVisibility(View.GONE);
        ivPhone.setVisibility(View.GONE);
        ivWebsite.setVisibility(View.GONE);
        ivLocation.setVisibility(View.GONE);

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivityForResult(intent, ACTIVITY2);
            }
        });
    }
        @Override
        protected void onActivityResult(int requestCode, int ResultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, ResultCode, data);

            if(requestCode==ACTIVITY2) {
                String faceName = Objects.requireNonNull(data).getStringExtra("image");
                System.out.println(faceName);
                int facialExpression = this.getResources().getIdentifier(faceName, "drawable", this.getPackageName());
                ivFace.setImageResource(facialExpression);
                ivPhone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Objects.requireNonNull(data).getStringExtra("number")));
                        startActivity(intent);
                    }
                });
                ivWebsite.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                                Objects.requireNonNull(data).getStringExtra("website")));
                        startActivity(intent);
                    }
                });
                ivLocation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                                Objects.requireNonNull(data).getStringExtra("location")
                        ));
                        startActivity(intent);
                    }
                });
            }

            ivFace.setVisibility(View.VISIBLE);
            ivPhone.setVisibility(View.VISIBLE);
            ivWebsite.setVisibility(View.VISIBLE);
            ivLocation.setVisibility(View.VISIBLE);
    }
}