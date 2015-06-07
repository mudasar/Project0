package uk.appinvent.project0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
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

    public void onButtonClick(View view){

        String appName = "";

        switch (view.getId()){
            case R.id.xyz_reader_main_button:
                    appName = "XYZ Reader";

                break;
            case R.id.scores_main_button:
                    appName = "Scores";
                break;
            case R.id.spotifystreamer_main_button:
                    appName = "Spotify Streamer";
                break;
            case R.id.library_main_button:
                    appName = "Library";
                break;
            case R.id.bib_main_button:
                    appName = "Build It Bigger";
                break;
            case R.id.real_main_button:
                    appName = "The Real Capstone";
                break;
        }
       String message = String.format( "This button will launch my %s app!", appName);
        Context appContext = getApplicationContext();

        Toast toast = Toast.makeText(appContext, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0,0);
        toast.show();

    }

    public static class PlaceholderFragment extends Fragment{

        public PlaceholderFragment(){

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
