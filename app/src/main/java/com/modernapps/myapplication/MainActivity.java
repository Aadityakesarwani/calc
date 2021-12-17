package com.modernapps.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Reader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    TextView userinput;
    TextView outputresult;
    String inputs = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewInint();
    }

    private void textViewInint() {
        userinput = (TextView)findViewById(R.id.input);
        outputresult =(TextView)findViewById(R.id.result);
    }

    private void setInputs(String givenVal )
    {
        inputs = inputs + givenVal ;
        userinput.setText(inputs);
    }

    public void clearOnClick(View view){
        userinput.setText("");
        inputs = "";
        outputresult.setText("");
    }

    public void equaltoOnClick(View view) {

        Double result = null;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

        try{
            result = (double)engine.eval("=" +inputs);

        }catch(ScriptException e)
        {
            Toast.makeText(this,"invalid input" ,Toast.LENGTH_SHORT).show();
        }

        if(result != null)
        {
            outputresult.setText(String.valueOf(result.doubleValue()));
        }
    }

    private boolean isNumeric(char c)
    {
        if((c<='9' || c >= '0' )|| c=='.')

            return true;

            return false;
    }

    public void backOnClick(View view) {
    }

    public void percentOnClick(View view) {
        setInputs("%");
    }

    public void dividOnClick(View view) {
        setInputs("/");
    }

    public void sevenOnClick(View view) {
        setInputs("7");
    }

    public void eightOnClick(View view) {
        setInputs("8");
    }


    public void nineOnClick(View view) {
        setInputs("9");
    }

    public void multiplyOnClick(View view) {
        setInputs("*");
    }

    public void fourOnClick(View view) {
        setInputs("4");
    }

    public void fiveOnClick(View view) {
        setInputs("5");
    }

    public void sixOnClick(View view) {
        setInputs("6");
    }

    public void minusOnClick(View view) {
        setInputs("-");
    }

    public void oneOnClick(View view) {
        setInputs("1");
    }

    public void twoOnClick(View view) {
        setInputs("2");
    }

    public void threeOnClick(View view) {
        setInputs("3");
    }

    public void plusOnClick(View view) {
        setInputs("+");
    }

    public void dotOnClick(View view) {
        setInputs(".");
    }

    public void zeroOnClick(View view) {
        setInputs("0");
    }

}