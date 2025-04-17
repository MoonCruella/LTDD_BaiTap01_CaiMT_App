package com.example.baitap01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class StringCau05Activity extends AppCompatActivity {
    EditText editTextInput;
    Button buttonReverse;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_string);
        editTextInput = findViewById(R.id.editTextInput);
        buttonReverse = findViewById(R.id.buttonReverse);
        textViewResult = findViewById(R.id.textViewKetQua);

        buttonReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = editTextInput.getText().toString().trim();

                if (!inputText.isEmpty()) {

                    // Hiển thị lên TextView
                    textViewResult.setText(inputText);

                    // Xử lý đảo ngược chuỗi theo từng từ
                    String[] words = inputText.split("\\s+"); // tách theo khoảng trắng
                    StringBuilder reversed = new StringBuilder();

                    for (int i = words.length - 1; i >= 0; i--) {
                        reversed.append(words[i]).append(" ");
                    }

                    // Loại bỏ khoảng trắng dư và in hoa
                    String result = reversed.toString().trim().toUpperCase();

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
