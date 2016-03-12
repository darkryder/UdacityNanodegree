package me.darkryder.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        attachListener(R.id.button_spotify, R.string.appname_spotify);
        attachListener(R.id.button_scores, R.string.appname_scores);
        attachListener(R.id.button_library, R.string.appname_library);
        attachListener(R.id.button_build, R.string.appname_build);
        attachListener(R.id.button_xyz, R.string.appname_xyz);
        attachListener(R.id.button_own, R.string.appname_own);
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
    
    private void attachListener(int viewId, int nameId){
        final String name_ = getString(nameId);
        Button button = (Button)findViewById(viewId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This button will launch my " + name_ + "!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
