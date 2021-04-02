package ali.riccardo.applicazione_matematica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Goniometria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goniometria);
    }


    public double round(double value){
        return Math.round(value*1000000)/1000000;
    }
    public void onButtonClick(View v){
        TextView textSin = (TextView)findViewById(R.id.textSin);
        TextView textCos = (TextView)findViewById(R.id.textCos);
        TextView textTan = (TextView)findViewById(R.id.textTan);
        TextView text3 = (TextView)findViewById(R.id.textView3);
        ToggleButton toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        EditText editText = (EditText)findViewById(R.id.editText);

        double angolo = Double.parseDouble(editText.getText() .toString());

        if (toggleButton.isChecked()){ //gradi
            textSin.setText("Sin(" + Double.toString(angolo) + ")=" + Double.toString(round(Math.sin(Math.toRadians(angolo)))));
            textCos.setText("Cos(" + Double.toString(angolo) + ")=" + Double.toString(round(Math.cos(Math.toRadians(angolo)))));
            textTan.setText("Tan(" + Double.toString(angolo) + ")=" + Double.toString(round(Math.tan(Math.toRadians(angolo)))));
            text3.setText(Double.toString(Math.sin(Math.toRadians(angolo))));
        }
        else{
            textSin.setText("Sin(" + Double.toString(angolo) + "π)=" + Double.toString(round(Math.sin(angolo*Math.PI))));
            textCos.setText("Cos(" + Double.toString(angolo) + "π)=" + Double.toString(round(Math.cos(angolo*Math.PI))));
            textTan.setText("Tan(" + Double.toString(angolo) + "π)=" + Double.toString(round(Math.tan(angolo*Math.PI))));
        }


    }
}
