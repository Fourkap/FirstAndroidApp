package com.example.testcours1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        private Button button;
        private Editable input;
        private EditText edit1;
        private TextView affichage;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button = findViewById(R.id.button);
            edit1 = findViewById(R.id.editText);
            affichage = findViewById(R.id.textView3);

            input = edit1.getText();


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "comment va tu ? "+input, Toast.LENGTH_LONG).show();
                    affichage.setText("comment va tu ?"+input);
                }
            });
        }
}
