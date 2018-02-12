package com.example.ujjwalgupta.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resB,eqB;
    String eq;
    String res;
    int a,b,l;
    char ch;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resB = (TextView) findViewById(R.id.res);
        eqB = (TextView) findViewById(R.id.eq);
        eq="";
        res="";
        a=b=l=0;
        eqB.setText("0");
        resB.setText("0");
        ch=' ';
    }
    public void One(View view) {
        if(b==0)
            eqB.setText("0");
        if(ch==' ') {
            a = Integer.parseInt(eqB.getText().toString());
            b = a * 10 + 1;
            eqB.setText(String.valueOf(b));
        }
        else {
            b=b*10+1;
            eqB.setText(eq+ch+String.valueOf(b));
        }
    }
    public void Two(View view) {
        if(b==0)
            eqB.setText("0");
        if(ch==' ') {
            a = Integer.parseInt(eqB.getText().toString());
            b = a*10+2;
            eqB.setText(String.valueOf(b));
        }
        else {
            b=b*10+2;
            eqB.setText(eq+ch+String.valueOf(b));
        }
    }
    public void Three(View view) {
        if(b==0)
            eqB.setText("0");
        if(ch==' ') {
            a = Integer.parseInt(eqB.getText().toString());
            b = a * 10 + 3;
            eqB.setText(String.valueOf(b));
        }
        else {
            b=b*10+3;
            eqB.setText(eq+ch+String.valueOf(b));
        }
    }
    public void Four(View view) {
        if(b==0)
            eqB.setText("0");
        if(ch==' ') {
            a = Integer.parseInt(eqB.getText().toString());
            b = a * 10 + 4;
            eqB.setText(String.valueOf(b));
        }
        else {
            b=b*10+4;
            eqB.setText(eq+ch+String.valueOf(b));
        }
    }
    public void Five(View view) {
        if(b==0)
            eqB.setText("0");
        if(ch==' ') {
            a = Integer.parseInt(eqB.getText().toString());
            b = a * 10 + 5;
            eqB.setText(String.valueOf(b));
        }
        else {
            b=b*10+5;
            eqB.setText(eq+ch+String.valueOf(b));
        }
    }
    public void Six(View view) {
        if(b==0)
            eqB.setText("0");
        if(ch==' ') {
            a = Integer.parseInt(eqB.getText().toString());
            b = a * 10 + 6;
            eqB.setText(String.valueOf(b));
        }
        else {
            b=b*10+6;
            eqB.setText(eq+ch+String.valueOf(b));
        }
    }
    public void Seven(View view) {
        if(b==0)
            eqB.setText("0");
        if(ch==' ') {
            a = Integer.parseInt(eqB.getText().toString());
            b = a * 10 + 7;
            eqB.setText(String.valueOf(b));
        }
        else {
            b=b*10+7;
            eqB.setText(eq+ch+String.valueOf(b));
        }
    }
    public void Eight(View view) {
        if(b==0)
            eqB.setText("0");
        if(ch==' ') {
            a = Integer.parseInt(eqB.getText().toString());
            b = a * 10 + 8;
            eqB.setText(String.valueOf(b));
        }
        else {
            b=b*10+8;
            eqB.setText(eq+ch+String.valueOf(b));
        }
    }
    public void Nine(View view) {
        if(b==0)
            eqB.setText("0");
        if(ch==' ') {
            a = Integer.parseInt(eqB.getText().toString());
            b = a * 10 + 9;
            eqB.setText(String.valueOf(b));
        }
        else {
            b=b*10+9;
            eqB.setText(eq+ch+String.valueOf(b));
        }
    }
    public void Zero(View view) {
        if(b==0)
            eqB.setText("0");
        if(ch==' ') {
            a = Integer.parseInt(eqB.getText().toString());
            b = a * 10 ;
            eqB.setText(String.valueOf(b));
        }
        else {
            b=b*10;
            eqB.setText(eq+ch+String.valueOf(b));
        }
    }
    public void add(View view) {
        ch='+';
        eq=eqB.getText().toString();
        eqB.setText(eq+'+');
        b=0;
    }
    public void mul(View view) {
        ch='*';
        eq=eqB.getText().toString();
        eqB.setText(eq+'*');
        b=0;
    }
    public void div(View view) {
        ch='/';
        eq=eqB.getText().toString();
        eqB.setText(eq+'/');
        b=0;
    }
    public void sub(View view) {
        ch='-';
        eq=eqB.getText().toString();
        eqB.setText(eq+'-');
        b=0;
    }

    public void equal(View view) {
        if(ch=='+') {
            a=Integer.parseInt(eq);
            res=String.valueOf(a+b);
            resB.setText(res);
            a=b=0;
            ch=' ';
            res=" ";
            eq=" ";
        }
        else if(ch=='-') {
            a=Integer.parseInt(eq);
            res=String.valueOf(a-b);
            resB.setText(res);
            a=b=0;
            ch=' ';
            res=" ";
            eq=" ";
        }
        else if(ch=='*') {
            a=Integer.parseInt(eq);
            res=String.valueOf(a*b);
            resB.setText(res);
            a=b=0;
            ch=' ';
            res=" ";
            eq=" ";
        }
        else {
            a=Integer.parseInt(eq);
            res=String.valueOf(a/b);
            resB.setText(res);
            a=b=0;
            ch=' ';
            res=" ";
            eq=" ";
        }
    }
}
