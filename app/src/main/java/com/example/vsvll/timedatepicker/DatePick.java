package com.example.vsvll.timedatepicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DatePick extends AppCompatActivity {

    DatePicker datePicker;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_picker);

        datePicker = findViewById(R.id.DatePick);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.TimePick);
        Calendar calendar = Calendar.getInstance();

        datePicker.init(calendar.get(calendar.YEAR), calendar.get(calendar.MONTH), calendar.get(calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                textView.setText("Date: "+dayOfMonth+"/"+monthOfYear+"/"+year);

            }
        });

    }

    public void TimePicker(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}