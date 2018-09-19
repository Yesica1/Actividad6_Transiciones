package com.example.dell.actividad6_transiciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    Scene mAScene;
    Scene mAnotherScene;
    ViewGroup mSceneRoot;
    Transition transitionMgr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSceneRoot = (ViewGroup) findViewById(R.id.scene_root);

        //Create the scenes
        mAScene = Scene.getSceneForLayout(mSceneRoot, R.layout.a_scene, this);
        mAnotherScene = Scene.getSceneForLayout(mSceneRoot, R.layout.another_scene, this);
        transitionMgr = TransitionInflater.from(this).inflateTransition(R.transition.fade_transition);

    }

    public void gotoScene2 (View view)
    {
        TransitionManager.go(mAScene, transitionMgr);
    }

    public void goToScene1 (View view)
    {
        TransitionManager.go(mAnotherScene,transitionMgr);
    }


}

