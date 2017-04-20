package demoscrollview.android.myapplicationdev.com.demoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDone = (Button) findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // Get the EditText that user keys in name
                EditText etName = (EditText) findViewById(R.id.etname);
                // Get the EditText that user keys in age
                EditText etAge = (EditText) findViewById(R.id.etage);
                // Put the name and age into an array
                String[] info = {etName.getText().toString(),
                        etAge.getText().toString()};
                // Create an intent to start another activity called
                //  DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this,
                        DemoActivity2.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);
            }});

    }
}
