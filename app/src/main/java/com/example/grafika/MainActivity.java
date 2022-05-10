package com.example.grafika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    OpenGLView openGLView;

    private int windowHeight, windowWidth;
    public static float r = 0.5f, g = 0.5f;

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

//    @Override
//    public boolean onTouchEvent(MotionEvent event)
//    {
//        int x = (int)event.getX();
//        int y = (int)event.getY();
//
//        String stateString, cordsString;
//        Resources res = getResources();
//
//        //cordsString = res.getString(R.string.display_cords, x, y);
//        //cordsTextView.setText(cordsString);
//
//        r = (float) x/windowWidth;
//        g = (float) y/windowHeight;
//
////        switch (event.getAction()) {
////            case MotionEvent.ACTION_DOWN:
////                stateString = res.getString(R.string.display_state, "Down");
////                stateTextView.setText(stateString);
////                return true;
////            case MotionEvent.ACTION_MOVE:
////                stateString = res.getString(R.string.display_state, "Move");
////                stateTextView.setText(stateString);
////                return true;
////            case MotionEvent.ACTION_UP:
////                stateString = res.getString(R.string.display_state, "Up");
////                stateTextView.setText(stateString);
////                return true;
////        }
//        return false;
//    }
}