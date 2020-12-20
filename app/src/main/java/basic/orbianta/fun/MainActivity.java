package basic.orbianta.fun;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private native String calculate(float j1,float j2);
    private EditText e1,e2,output;

    private void get_ui_elements(){
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        output=findViewById(R.id.output);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        get_ui_elements();


    }

    public void calc_click(View v){
        InputMethodManager inputMethodManager = (InputMethodManager) this.getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);

        if(!(e1.getText().toString().isEmpty()||e1.getText().toString().equals("")||e2.getText().toString().isEmpty()||e2.getText().toString().equals(""))){
            String output_s = calculate(Float.parseFloat(String.valueOf(e1.getText())),Float.parseFloat(String.valueOf(e2.getText())));
            output.setText("You are "+output_s+".");
        }else{

            Toast.makeText(getApplicationContext(),"Please fill all the parts.",Toast.LENGTH_LONG).show();

        }

    }


}