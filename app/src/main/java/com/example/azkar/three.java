package com.example.azkar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class three extends AppCompatActivity {

    TextView Data;
    int size=20 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);
        int data = getIntent().getIntExtra("data1", 0);

        Data = findViewById(R.id.data);

        if (data == 0) {
            Data.setText(getResources().getString(R.string.No1));

        }
        if (data == 1) {
            Data.setText(getResources().getString(R.string.No2));

        }
        if (data == 2) {
            Data.setText(getResources().getString(R.string.No3));
        }
        if (data == 3) {
            Data.setText(getResources().getString(R.string.No4));
        }
        if (data == 4) {
            Data.setText(getResources().getString(R.string.No5));
        }
        if (data == 5) {
            Data.setText(getResources().getString(R.string.NO6));
        }
        if (data == 6) {
            Data.setText(getResources().getString(R.string.NO7));

        }
        if (data == 7) {
            Data.setText(getResources().getString(R.string.No8));

        }
        if (data == 8) {
            Data.setText(getResources().getString(R.string.No9));

        }
        if (data == 9) {
            Data.setText(getResources().getString(R.string.No10));

        }
        if (data == 10) {
            Data.setText(getResources().getString(R.string.No11));

        }
        if (data == 11) {
            Data.setText(getResources().getString(R.string.No12));

        }
        if (data == 12) {
            Data.setText(getResources().getString(R.string.No13));

        }
        if (data == 13) {
            Data.setText(getResources().getString(R.string.No14));

        }
        if (data == 14) {
            Data.setText(getResources().getString(R.string.No15));

        }
        if (data == 15) {
            Data.setText(getResources().getString(R.string.No16));

        }
        if (data == 16) {
            Data.setText(getResources().getString(R.string.No17));

        }
        if (data == 17) {
            Data.setText(getResources().getString(R.string.No18));

        }
        if (data == 18) {
            Data.setText(getResources().getString(R.string.No19));

        }
        if (data == 19) {
            Data.setText(getResources().getString(R.string.No20));


        }
        if (data == 20) {
            Data.setText(getResources().getString(R.string.No21));

        }
        if (data == 21) {
            Data.setText(getResources().getString(R.string.No22));

        }

        if (data == 22) {
            Data.setText(getResources().getString(R.string.No23));

        }

        if (data == 23) {

            Data.setText(getResources().getString(R.string.No24) + "" + getResources().getString(R.string.No25) + "" + getResources().getString(R.string.No26));
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.item1:

                Intent goone = new Intent(getApplicationContext(), one.class);
                startActivity(goone);
                finish();
                break;
            case R.id.item2:
                onBackPressed();
                break;
            case R.id.plas:

            this.Data.setTextSize(0,this.Data.getTextSize()+1);
                break;
            case R.id.mainase:

                this.Data.setTextSize(0,this.Data.getTextSize()-1);

                break;

            case R.id.finsha:
                finishAffinity();
                break;


        }
        return super.onOptionsItemSelected(item);

    }
}