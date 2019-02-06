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
        if(savedInstanceState != null) {
            findViewById(R.id.arms).setVisibility(savedInstanceState.getInt("arms"));
            findViewById(R.id.ears).setVisibility(savedInstanceState.getInt("ears"));
            findViewById(R.id.eyes).setVisibility(savedInstanceState.getInt("eyes"));
            findViewById(R.id.eyebrows).setVisibility(savedInstanceState.getInt("eyebrows"));
            findViewById(R.id.mouth).setVisibility(savedInstanceState.getInt("mouth"));
            findViewById(R.id.hat).setVisibility(savedInstanceState.getInt("hat"));
            findViewById(R.id.shoes).setVisibility(savedInstanceState.getInt("shoes"));
            findViewById(R.id.nose).setVisibility(savedInstanceState.getInt("nose"));
            findViewById(R.id.mustache).setVisibility(savedInstanceState.getInt("mustache"));
            findViewById(R.id.glasses).setVisibility(savedInstanceState.getInt("glasses"));


        }
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

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("arms",findViewById(R.id.arms).getVisibility());
        outState.putInt("eyes",findViewById(R.id.eyes).getVisibility());
        outState.putInt("eyebrows",findViewById(R.id.eyebrows).getVisibility());
        outState.putInt("nose",findViewById(R.id.nose).getVisibility());
        outState.putInt("hat",findViewById(R.id.hat).getVisibility());
        outState.putInt("mouth",findViewById(R.id.mouth).getVisibility());
        outState.putInt("glasses",findViewById(R.id.glasses).getVisibility());
        outState.putInt("ears",findViewById(R.id.ears).getVisibility());
        outState.putInt("mustache",findViewById(R.id.mustache).getVisibility());
        outState.putInt("shoes",findViewById(R.id.shoes).getVisibility());
    }

}
