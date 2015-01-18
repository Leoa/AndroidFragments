package com.leobee.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class MyFragment extends Fragment {

    @Override
    public void onAttach(Activity activity ){
        super.onAttach(activity);
        Log.i("Method", "Fragment onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_my_fragment);
        Log.i("Method", "Fragment onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        Log.i("Method", "Fragment onCreateView");
        return inflater.inflate(R.layout.activity_my_fragment,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Log.i("Method", "Fragment onActivityCreate");
    }

    @Override
     public void onStart(){
        super.onStart();
        Log.i("Method", "Fragment onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i("Method", "Fragment onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i("Method", "Fragment onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i("Method", "Fragment onSaveInstanceState");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.i("Method", "Fragment onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("Method", "Fragment onDestroy");
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.i("Method", "Fragment onDestroyView");
    }

    @Override
    public void onDetach(){
        super.onDetach();
        Log.i("Method", "Fragment onDetach");
    }
}
