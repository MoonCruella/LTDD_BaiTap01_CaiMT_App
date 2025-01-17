package com.example.baitap01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StringCau05Activity extends AppCompatActivity {
    EditText editTextInput;
    Button buttonReverse;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        editTextInput = findViewById(R.id.editTextInput);
        buttonReverse = findViewById(R.id.buttonReverse);
        textViewResult = findViewById(R.id.textViewKetQua);

        buttonReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = editTextInput.getText().toString().trim();

                if (!inputText.isEmpty()) {
                    String reversedText = daoChuoi(inputText);
                    String result = reversedText.toUpperCase();
                    textViewResult.setText(result);

                    Toast.makeText(StringCau05Activity.this, result, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(StringCau05Activity.this, "Hãy nhập chuỗi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private String daoChuoi(String str) {
        String[] chuoi = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = chuoi.length - 1; i >= 0; i--) {
            ans.append(chuoi[i]).append(" ");
        }
        return ans.toString().trim();
    }
}
