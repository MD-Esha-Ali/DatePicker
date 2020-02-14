package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Button showButton;
    private TextView textView;
    private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showButton=(Button) findViewById(R.id.ButtonId);
        textView=(TextView) findViewById(R.id.textViewId);
        datePicker=(DatePicker) findViewById(R.id.datePickerId);

        textView.setText(dflkdf());
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(dflkdf());
            }
        });
    }
    String dflkdf(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Current Date: ");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append(datePicker.getYear());
        return stringBuilder.toString();
    }
}
