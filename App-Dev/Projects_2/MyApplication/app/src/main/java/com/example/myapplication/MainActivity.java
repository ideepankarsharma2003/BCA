package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn1(View s1)
    {
        TextView t1 = findViewById(R.id.textView13);
        TextView t2 = findViewById(R.id.textView14);
        TextView t3= findViewById(R.id.textView15);
        TextView t4= findViewById(R.id.textView);

        EditText e1 = findViewById(R.id.editTextTextPersonName2);
        EditText e2 = findViewById(R.id.editTextTextPersonName3);
        EditText e3 = findViewById(R.id.editTextTextPersonName4);
        EditText e4 = findViewById(R.id.editTextTextPersonName5);
        EditText e5 = findViewById(R.id.editTextTextPersonName6);

        String s = e1.getText().toString();
        String s5 = e2.getText().toString();
        String s2 = e3.getText().toString();
        String s3 = e4.getText().toString();
        String s4 = e5.getText().toString();

        int sub1 = Integer.parseInt(s);
        int sub2 = Integer.parseInt(s5);
        int sub3 = Integer.parseInt(s2);
        int sub4 = Integer.parseInt(s3);
        int sub5 = Integer.parseInt(s4);
        double total = sub1+sub2+sub3+sub4+sub5;


        double percentage = (sub1+sub2+sub3+sub4+sub5)*100/500;

        RadioButton r1 =(RadioButton) findViewById(R.id.radioButton3);
        RadioButton r2 =(RadioButton) findViewById(R.id.radioButton4);
        if (r1.isChecked())
        {
            t4.setText("class 10");

        }
        else if(r2.isChecked())
        {
            t4.setText("class 12");
        }

        CheckBox c = (CheckBox) findViewById(R.id.checkBox);
        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        if(c.isChecked()) {
            t1.setText("" + total);
        }

        if(c2.isChecked()) {
            t2.setText("" +percentage );
        }
        if(c3.isChecked()) {
            if (percentage>60)
            {
                t3.setText("first division");
            }
            else if (percentage>45)
            {
                t3.setText("second division");
            }
            else if (percentage>33)
            {
                t3.setText("third division");
            }
            else
            {
                t3.setText("Fail");
            }

            if (sub1<33)
            {
                t3.setText("fail");
            }
            if (sub2<33)
            {
                t3.setText("fail");
            }
            if (sub3<33)
            {
                t3.setText("fail");
            }
            if (sub4<33)
            {
                t3.setText("fail");
            }
            if (sub5<33)
            {
                t3.setText("fail");
            }
        }
        if(sub1>100)
        {
            Context c1 = getApplicationContext();
            CharSequence txt = "invalid marks";
            int dur = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(c1, txt, dur);
            toast.show();
            t3.setText("invalid marks");
            t2.setText("invalid marks");
            t1.setText("invalid marks");
        }

        if(sub2>100)
        {
            Context c1 = getApplicationContext();
            CharSequence txt = "invalid marks";
            int dur = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(c1, txt, dur);
            toast.show();
            t3.setText("invalid marks");
            t2.setText("invalid marks");
            t1.setText("invalid marks");
        }

        if(sub3>100)
        {
            Context c1 = getApplicationContext();
            CharSequence txt = "invalid marks";
            int dur = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(c1, txt, dur);
            toast.show();
            t3.setText("invalid marks");
            t2.setText("invalid marks");
            t1.setText("invalid marks");
        }

        if(sub4>100)
        {
            Context c1 = getApplicationContext();
            CharSequence txt = "invalid marks";
            int dur = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(c1, txt, dur);
            toast.show();
            t3.setText("invalid marks");
            t2.setText("invalid marks");
            t1.setText("invalid marks");
        }
        if(sub5>100)
        {
            Context c1 = getApplicationContext();
            CharSequence txt = "invalid marks";
            int dur = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(c1, txt, dur);
            toast.show();
            t3.setText("invalid marks");
            t2.setText("invalid marks");
            t1.setText("invalid marks");
        }
        Context context = getApplicationContext();
        CharSequence text = t3.getText().toString();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

}