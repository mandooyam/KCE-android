package com.example.hello10_22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 1.선언한다
    Button add, sub, mul, div;
    EditText num1, num2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2.연결시킨다.
        add=findViewById(R.id.addButton);
        sub=findViewById(R.id.subButton);
        mul=findViewById(R.id.mulButton);
        div=findViewById(R.id.divButton);
        num1=findViewById(R.id.num1Text);
        num2=findViewById(R.id.num2Text);
        result=findViewById(R.id.resultView);

        // 3.이벤트주기
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

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=num1.getText().toString();
                String str2=num2.getText().toString();
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);
                int res=n1-n2;
                result.setText(res+"");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=num1.getText().toString();
                String str2=num2.getText().toString();
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);
                int res=n1*n2;
                result.setText(res+"");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1=num1.getText().toString();
                String str2=num2.getText().toString();
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);
                int res=n1/n2;
                result.setText(res+"");
            }
        });

    }
}