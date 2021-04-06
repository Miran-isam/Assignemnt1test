package Mobile.project.bzu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    EditText edi1 =findViewById(R.id.edit1);
    EditText edi2 =findViewById(R.id.edit2);
    EditText edi3 =findViewById(R.id.edit3);
   RadioGroup radiogroub=findViewById(R.id.groupbo);
   RadioButton radiobutton1;
   Spinner spinner1 = findViewById(R.id.spinner);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogroub=(RadioGroup)findViewById(R.id.groupbo);
        spineermothed();
     //   rediobutton();
   //   spinner1.setOnItemSelectedListener(this);


    }



        public void maleaction(View view) {
            int radiobuttonid = radiogroub.getCheckedRadioButtonId();
            radiobutton1 =(RadioButton) findViewById(radiobuttonid);
            Toast.makeText(getBaseContext(),radiobutton1.getText(),Toast.LENGTH_LONG).show();


    }

    private void spineermothed() {
        ArrayList<String> aray =new ArrayList<>();
        aray.add("Ramallah");
        aray.add("Nablus");
        aray.add("Jenin");
        aray.add("Al-Khalil");
        ArrayAdapter<String> arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,aray);
        spinner1.setAdapter(arrayadapter);
    }



    public void btactio(View view) {
        String s1 =edi1.getText().toString();
        String s2 =edi2.getText().toString();
        String s3 =edi3.getText().toString();
       // String s4 =spinner1.getText().toString();
        Intent intent =new Intent(this,MainActivity2.class);
        intent.putExtra("keyname",s1);
        intent.putExtra("keyname2",s2);
        intent.putExtra("keyname3",s3);
        startActivity(intent);
        InputMethodManager inp =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inp.hideSoftInputFromWindow(view.getWindowToken(),0);

    }


}