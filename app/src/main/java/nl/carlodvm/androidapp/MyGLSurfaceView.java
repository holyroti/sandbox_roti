package nl.carlodvm.androidapp;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLSurfaceView extends GLSurfaceView {
    private  final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context){
        super(context);
        setEGLContextClientVersion(2);
        mRenderer = new MyGLRenderer();

        setRenderer(mRenderer);
    }
}
