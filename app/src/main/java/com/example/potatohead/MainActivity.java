package com.example.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final int KOLOM = 0;
    private int [][] arr = {{R.id.arms, R.id.checkArms}, {R.id.mustache, R.id.checkMustache}, {R.id.ears, R.id.checkEars},
            {R.id.mouth, R.id.checkMouth}, {R.id.eyebrows, R.id.checkEyebrows}, {R.id.shoes, R.id.checkShoes},
            {R.id.glasses, R.id.checkGlasses}, {R.id.nose, R.id.checkNose}, {R.id.hat, R.id.checkHat},
            {R.id.eyes, R.id.checkEyes}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        int check = checkbox.getId();
        ImageView image = (ImageView) findViewById(arr[findID(check)][KOLOM]);
        if(image.getVisibility() == View.INVISIBLE){
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }
    }

    //find the image ID linked to the clicked checkbox
    public int findID(int id)
    {
        int row = 0;
        for (int i =0; i < arr.length ; i++ ){
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == id) {
                    row = i;
                    break;
                }
            }
        }
        return row;
    }

}
