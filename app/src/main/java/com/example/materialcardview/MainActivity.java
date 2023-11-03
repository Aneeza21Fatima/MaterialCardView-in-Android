package com.example.materialcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ConstraintLayout parent;

    MaterialCardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // snack bar code
        btn=findViewById(R.id.hello);
        parent=findViewById(R.id.parent);

        // card view
        cardView = findViewById(R.id.cardView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnakbar();
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Card view selected", Toast.LENGTH_SHORT).show();
            }
        });
    }



    public void showSnakbar(){
        Snackbar.make(parent,"I am a snack bar",Snackbar.LENGTH_SHORT)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "RETRY selected", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }





}