package Mobile.project.bzu.myapplication;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    TextView edtext = (TextView) findViewById(R.id.texthid);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity2);
        String ss =getIntent().getStringExtra("keyname");
        String ss1 =getIntent().getStringExtra("keyname2");
        String ss2 =getIntent().getStringExtra("keyname3");
        edtext.setText(ss);
        edtext.setText(ss1);
        edtext.setText(ss2);



    }
}
