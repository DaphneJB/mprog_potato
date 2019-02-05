package com.example.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        //String check = checkbox.getText().toString();
        int number = checkbox.getId();
        ImageView image = (ImageView) findViewById(number);
        if(image.getVisibility() == View.INVISIBLE){
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }
    }

}
