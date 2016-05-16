package ness.tomerbu.edu.toolbarsactualdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initFab();
    }

    private void initFab() {
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(fab, "Ok to Save", Snackbar.LENGTH_INDEFINITE)
                        .setAction("OK", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "Saved!", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });
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

      switch (id){
          case R.id.action_settings:
              Toast t = Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT);
              t.setGravity(Gravity.CENTER, 0, 0);
              t.show();
              return true;
          case R.id.action_dial:
              Toast.makeText(MainActivity.this, "Dial", Toast.LENGTH_SHORT).show();
              return true;
          case R.id.action_web:
              Toast.makeText(MainActivity.this, "Web", Toast.LENGTH_SHORT).show();
              return true;
      }

        return false;
    }
}
