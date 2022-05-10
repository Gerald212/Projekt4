package com.example.grafika;

import android.opengl.EGLConfig;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;

import javax.microedition.khronos.opengles.GL10;

public class OpenGLRenderer implements GLSurfaceView.Renderer {

    @Override
    public void onSurfaceCreated(GL10 gl10, javax.microedition.khronos.egl.EGLConfig eglConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public void onSurfaceChanged(GL10 gl, int width, int height) {
        gl.glViewport(0, 0, width, height);

        // make adjustments for screen ratio
        float ratio = (float) width / height;
        gl.glMatrixMode(GL10.GL_PROJECTION);        // set matrix to projection mode
        gl.glLoadIdentity();                        // reset the matrix to its default state
        gl.glFrustumf(-ratio, ratio, -1, 1, 3, 7);  // apply the projection matrix
    }

    public void onDrawFrame(GL10 gl) {
        // Set GL_MODELVIEW transformation mode
        gl.glMatrixMode(GL10.GL_MODELVIEW);
        gl.glLoadIdentity();                      // reset the matrix to its default state

        // When using GL_MODELVIEW, you must set the camera view
        GLU.gluLookAt(gl, 0, 0, -5, 0f, 0f, 0f, 0f, 1.0f, 0.0f);
    }


}
