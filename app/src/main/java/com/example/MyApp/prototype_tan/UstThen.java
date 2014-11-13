package com.example.MyApp.prototype_tan;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import com.example.MyApp.prototype_tan.R;

public class UstThen extends ActionBarActivity {

    public void sixty(View view) { Intent sixtyhehe=new Intent(this, sixty.class);
        startActivity(sixtyhehe); }
    public void seventy(View view) { Intent seventyhehe=new Intent(this, seventy.class);
        startActivity(seventyhehe); }
    public void eighty(View view) { Intent eightyhehe=new Intent(this, eighty.class);
        startActivity(eightyhehe); }
    public void ninety(View view) { Intent ninetyhehe=new Intent(this, ninety.class);
        startActivity(ninetyhehe); }
    public void thousand(View view) { Intent thousandhehe=new Intent(this, thousand.class);
        startActivity(thousandhehe); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ust_then);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
            Intent intent = getIntent();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ust_then, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_ust_then, container, false);
            return rootView;
        }
    }
}
