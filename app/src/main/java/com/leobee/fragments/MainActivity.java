package com.leobee.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Method", "Activity onCreate");

        Fragment myFragment = new MyFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.my_layout,myFragment,"MyFragment");
        transaction.commit();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.e("Method", "Activity onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.e("Method", "Activity onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.e("Method", "Activity onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.e("Method", "Activity onSaveInstanceState");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.e("Method", "Activity onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.e("Method", "Activity onDestroy");
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
