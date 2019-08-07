package www.limo.com.skybilldemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    public ArrayAdapter<CharSequence> spinnnerAdapter;

    public Spinner spinner;
    public Button submitButton;
    public EditText phoneNumberField;
    public TextView warning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        submitButton=findViewById(R.id.submit);
        phoneNumberField=findViewById(R.id.phoneNumberInput);
        warning=findViewById(R.id.warning);


        spinner=findViewById(R.id.countrySpinner);
         spinnnerAdapter = ArrayAdapter.createFromResource(this, R.array.countries,
                android.R.layout.simple_spinner_dropdown_item
        );

         spinnnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

         spinner.setAdapter(spinnnerAdapter);

         submitButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(phoneNumberField.getText().toString().equals("")){
                     warning.setText("Enter Phone Number");
                     warning.setBackgroundColor(Color.WHITE);
                 }else{
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                 }
             }
         });

    }
}
