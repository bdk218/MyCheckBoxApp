package com.example.bkronst.mycheckboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox check1, check2, check3;
    private Button button_sel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        addListenerToCheckBox();
    }

    public void addListenerToCheckBox(){
        check1 = (CheckBox) findViewById(R.id.checkBox_dog);
        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()) {
                            Toast.makeText(MainActivity.this,
                                    "Dog is selected", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }

    public void addListenerOnButton () {
        check1 = (CheckBox) findViewById(R.id.checkBox_dog);
        check2 = (CheckBox) findViewById(R.id.checkBox_cat);
        check3 = (CheckBox) findViewById(R.id.checkBox_cow);
        button_sel = (Button) findViewById(R.id.button);

        button_sel.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              StringBuffer result = new StringBuffer();
                                              result.append("Dog : ").append(check1.isChecked());
                                              result.append("\nCat : ").append(check1.isChecked());
                                              result.append("\nCow : ").append(check1.isChecked());

                                              Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
                                          }
                                      }
        );

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
