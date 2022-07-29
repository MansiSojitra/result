package com.mansi.result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText et1,et2,et3,et4;
    Button bttotal;
//    TextView txttotal,txtpr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        bttotal = findViewById(R.id.bttotal);
//        txttotal = findViewById(R.id.txttotal);
//        txtpr = findViewById(R.id.txtpr);

        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t1 = et1.getText().toString();
                String t2 = et2.getText().toString();
                String t3 = et3.getText().toString();
                String t4 = et4.getText().toString();
               int sub1 = Integer.parseInt(t1);
                int sub2 = Integer.parseInt(t2);
                int sub3 = Integer.parseInt(t3);
                int sub4 = Integer.parseInt(t4);

                int total = sub1 + sub2 + sub3 + sub4;

                float per = (total) / 4;

                Toast.makeText(getApplicationContext(), "TOTAL : "+total+"   "+"PERCENTAGE :"+per, Toast.LENGTH_SHORT).show();

            }
        });
    }
}