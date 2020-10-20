package com.example.hello10_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button add, sub, mul, div;
    EditText num1, num2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(MainActivity.this, "ok버튼", Toast.LENGTH_SHORT).show();
        //연결
        add.findViewById(R.id.addBtn);
        sub.findViewById(R.id.subBtn);
        mul.findViewById(R.id.mulBtn);
        div.findViewById(R.id.divBtn);
        num1.findViewById(R.id.num1Text);
        num2.findViewById(R.id.num2Text);
        result.findViewById(R.id.resultView);

        //addBtn클릭이벤트
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=num1.getText().toString();
                String str2=num2.getText().toString();
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);
                int res=n1+n2;
                result.setText(res+"");
            }
        });

    }
}