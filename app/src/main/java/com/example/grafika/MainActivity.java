package com.example.grafika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    OpenGLView openGLView;

    private int windowHeight, windowWidth;
    //public static float r = 0.5f, g = 0.5f;
    public static float X, Y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openGLView = findViewById(R.id.fullScreenView);
        //setContentView(openGLView);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        windowHeight = displayMetrics.heightPixels;
        windowWidth = displayMetrics.widthPixels;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        X = event.getX();
        Y = event.getY();

//        float temp = windowHeight - ((windowHeight/5)*2);
        float temp = windowWidth - ((windowWidth/5)*2);

        X = X / temp;


        Log.i("tag", "kliknieto");

        String stateString, cordsString;
        Resources res = getResources();



//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                stateString = res.getString(R.string.display_state, "Down");
//                stateTextView.setText(stateString);
//                return true;
//            case MotionEvent.ACTION_MOVE:
//                stateString = res.getString(R.string.display_state, "Move");
//                stateTextView.setText(stateString);
//                return true;
//            case MotionEvent.ACTION_UP:
//                stateString = res.getString(R.string.display_state, "Up");
//                stateTextView.setText(stateString);
//                return true;
//        }
        return false;
    }
}