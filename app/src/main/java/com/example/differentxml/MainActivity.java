package com.example.differentxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
//   private FloatingActionButton fab;
    private ConstraintLayout mparent;
    private Button button;
    private MaterialCardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mparent = findViewById(R.id.parent);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackBar();
            }
        });
   cardView = findViewById(R.id.cardview);
   cardView.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Toast.makeText(MainActivity.this,"Card Clicked",Toast.LENGTH_SHORT).show();
       }
   });



//      fab = findViewById(R.id.floatingbtn);
//      fab.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View view) {
//              Toast.makeText(MainActivity.this,"Btn is Clicked",Toast.LENGTH_SHORT).show();
//          }
//      });
    }
    private  void showSnackBar(){
        Snackbar.make(mparent,"This is The Snack Bar",Snackbar.LENGTH_INDEFINITE).setAction("retry", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"retry is Clicked",Toast.LENGTH_SHORT).show();
            }
        })
                .setActionTextColor(Color.RED).setTextColor(Color.YELLOW) //color of text in snack bar is yellow and action text is red
                .show();
    }
}