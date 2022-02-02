package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button startButton;
    TextView title;
    TextView yaman;
    EditText playerx;
    EditText playero;
    public void start(View view){
        String ed_text = playerx.getText().toString().trim();
        String edu_text = playero.getText().toString().trim();

        if(ed_text.isEmpty() || ed_text.length() == 0 || ed_text.equals("") || ed_text == null)
        {
            Toast.makeText(this, " Enter Player X's name", Toast.LENGTH_SHORT).show();
        }else if(edu_text.isEmpty() || edu_text.length() == 0 || edu_text.equals("") || edu_text == null){
            Toast.makeText(this, " Enter Player O's name", Toast.LENGTH_SHORT).show();
        }else {
            startButton = findViewById(R.id.startButton);
            Intent intent = new Intent(MainActivity.this, MainInterfaceScreen.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.title);
        yaman = findViewById(R.id.yamanTextView);
        playerx = findViewById(R.id.playerxEditText);
        playero = findViewById(R.id.playeroEditText);
    }
}