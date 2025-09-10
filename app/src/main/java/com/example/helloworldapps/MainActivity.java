package com.example.helloworldapps;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView myText = findViewById(R.id.myText);
        Button myButton = findViewById(R.id.myButton);

        myButton.setOnClickListener(v -> {
            myText.setText("You Clicked Here Wow!");
        });

        Button myButton2 = findViewById(R.id.myButton2);
        myButton2.setOnClickListener(v -> {
            myText.setTextColor(Color.BLUE);
        });

    }
}
