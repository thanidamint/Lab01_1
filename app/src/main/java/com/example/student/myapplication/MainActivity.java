package com.example.student.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //This method is called once when the activity starts
        super.onCreate(savedInstanceState);
        //To load the UI layout from res/layout/activity_main.xml
        setContentView(R.layout.activity_main);
    }

       int counter = 0;

    public void increase(View v) {
        TextView tv;
        tv = (TextView)findViewById(R.id.counterView);
        //The variable tv is referring to the TextView widget in the layout.
        //String s = tv.getText().toString();
        //int i = (i();
        counter++;
        tv.setText(Integer.toString(counter));

    }

    public void buttonClicked(View v) {
        TextView tv;
        tv = (TextView)findViewById(R.id.textView);
        //The variable tv is referring to the TextView widget in the layout.
        tv.setText("The Button is clicked!");
    }

    public void decrease(View v) {
        TextView tv;
        tv = (TextView)findViewById(R.id.counterView);
        //The variable tv is referring to the TextView widget in the layout.
        //int i = tv.getText();
        counter--;
        tv.setText(Integer.toString(counter));

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
