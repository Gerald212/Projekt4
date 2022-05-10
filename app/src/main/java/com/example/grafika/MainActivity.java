package com.example.grafika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    OpenGLView openGLView;

    private int windowHeight, windowWidth;
    //public static float r = 0.5f, g = 0.5f;
    public static int X, Y;

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
        X = (int)event.getX();
        Y = (int)event.getY();

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