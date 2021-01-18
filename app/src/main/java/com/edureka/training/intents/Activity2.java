package com.edureka.training.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    EditText etName, etNumber, etWebsite, etLocation;
    ImageView ivHappy, ivNeutral, ivSad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        etName = findViewById(R.id.etName);
        etNumber = findViewById(R.id.etNumber);
        etWebsite = findViewById(R.id.etWebsite);
        etLocation = findViewById(R.id.etLocation);
        ivHappy = findViewById(R.id.ivHappy);
        ivNeutral = findViewById(R.id.ivNeutral);
        ivSad = findViewById(R.id.ivSad);

        ivHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your name!",
                    Toast.LENGTH_SHORT).show();
                }
                if(etNumber.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your number!",
                            Toast.LENGTH_SHORT).show();
                }
                if(etWebsite.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your website!",
                            Toast.LENGTH_SHORT).show();
                }
                if(etLocation.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your location!",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    String name = etName.getText().toString().trim();
                    String number = etNumber.getText().toString().trim();
                    String website = etWebsite.getText().toString().trim();
                    String location = etLocation.getText().toString().trim();

                    Intent intent = new Intent(Activity2.this, MainActivity.class);
                    intent.putExtra("name", name);
                    intent.putExtra("number", number);
                    intent.putExtra("website", website);
                    intent.putExtra("location", location);
                    intent.putExtra("image", "happy");

                    setResult(RESULT_OK, intent);
                    Activity2.this.finish();
                }
            }
        });

        ivNeutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your name!",
                            Toast.LENGTH_SHORT).show();
                }
                if(etNumber.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your number!",
                            Toast.LENGTH_SHORT).show();
                }
                if(etWebsite.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your website!",
                            Toast.LENGTH_SHORT).show();
                }
                if(etLocation.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your location!",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    String name = etName.getText().toString().trim();
                    String number = etNumber.getText().toString().trim();
                    String website = etWebsite.getText().toString().trim();
                    String location = etLocation.getText().toString().trim();

                    Intent intent = new Intent(Activity2.this, MainActivity.class);
                    intent.putExtra("name", name);
                    intent.putExtra("number", number);
                    intent.putExtra("website", website);
                    intent.putExtra("location", location);
                    intent.putExtra("image", "neutral");

                    setResult(RESULT_OK, intent);
                    Activity2.this.finish();                      }
            }
        });

        ivSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etName.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your name!",
                            Toast.LENGTH_SHORT).show();
                }
                if(etNumber.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your number!",
                            Toast.LENGTH_SHORT).show();
                }
                if(etWebsite.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your website!",
                            Toast.LENGTH_SHORT).show();
                }
                if(etLocation.getText().toString().isEmpty()){
                    Toast.makeText(Activity2.this,
                            "Please enter your location!",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    String name = etName.getText().toString().trim();
                    String number = etNumber.getText().toString().trim();
                    String website = etWebsite.getText().toString().trim();
                    String location = etLocation.getText().toString().trim();

                    Intent intent = new Intent(Activity2.this, MainActivity.class);
                    intent.putExtra("name", name);
                    intent.putExtra("number", number);
                    intent.putExtra("website", website);
                    intent.putExtra("location", location);
                    intent.putExtra("image", "sad");

                    setResult(RESULT_OK, intent);
                    Activity2.this.finish();
                }
            }
        });
    }
}