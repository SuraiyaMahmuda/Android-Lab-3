package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private VariousCourse expert = new VariousCourse();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickSeekMenu(View view) {
        TextView info =(TextView)  findViewById(R.id.text);
        Spinner dis = (Spinner) findViewById(R.id.spinner);
        String type=String.valueOf(dis.getSelectedItem());
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(SecondActivity.EXTRA_MESSAGE, type);
        startActivity(intent);

    }
}