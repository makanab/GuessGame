package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkGuess(v);

            }
        });
    }

    public void checkGuess( View view){
        EditText userInput  = findViewById(R.id.userInput);
        String text  =  userInput.getText().toString();
        int guess = Integer.parseInt(text);

        Toast toast = Toast.makeText(this , "you won!", Toast.LENGTH_LONG);

        if(!game.check(guess)){
            toast.setText("incorrect...try again!");
        }

        toast.show();
    }
}