package com.example.baitap01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;

public class LogActivity extends AppCompatActivity {

    Button btnOk;
    EditText editTextNum;
    TextView textViewArray;
    TextView textViewChan;
    TextView textViewLe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btnOk = (Button)findViewById(R.id.buttonOk);
        editTextNum = (EditText)findViewById(R.id.editTextNumber);
        textViewArray = (TextView)findViewById(R.id.textViewArray);
        textViewChan = (TextView)findViewById(R.id.textViewSoChan);
        textViewLe = (TextView)findViewById(R.id.textViewSoLe);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewArray.setText("");
                textViewChan.setText("");
                textViewLe.setText("");
                int num = Integer.parseInt(String.valueOf(editTextNum));
                for (int i = 0; i < num; i++) {
                    Random random = new Random();
                    int ranInt = random.nextInt(100) + 1;
                    textViewArray.append((ranInt + "  "));
                    if (ranInt % 2 == 0) {
                        textViewChan.append((ranInt + "  "));
                    } else {
                        textViewLe.append((ranInt + "  "));

                    }
                }
            }

        });



    }
}
