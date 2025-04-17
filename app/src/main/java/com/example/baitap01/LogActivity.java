package com.example.baitap01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;

public class LogActivity extends AppCompatActivity {

    Button btnOk;
    EditText arrayList;
    TextView textViewChan;
    TextView textViewLe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log);
        btnOk = (Button)findViewById(R.id.buttonOk);
        textViewChan = (TextView)findViewById(R.id.textViewSoChan);
        textViewLe = (TextView)findViewById(R.id.textViewSoLe);
        arrayList = (EditText) findViewById(R.id.arrayList);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewChan.setText("");
                textViewLe.setText("");
                String input = arrayList.getText().toString();
                String[] numbers = input.split(",");
                for (int i = 0; i < numbers.length; i++) {
                    int ranInt = Integer.parseInt(numbers[i]);
                    double result = Math.log10(ranInt);
                    if (ranInt % 2 == 0) {
                        textViewChan.append((result + "    "));
                    } else {
                        textViewLe.append((result + "    "));
                    }
                }
            }

        });



    }
}
