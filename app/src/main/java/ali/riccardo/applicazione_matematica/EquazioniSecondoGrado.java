package ali.riccardo.applicazione_matematica;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EquazioniSecondoGrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equazioni_secondo_grado);
    }




    public void onButtonClick(View v){
        EditText Texta = (EditText)findViewById(R.id.Texta);
        EditText Textb = (EditText)findViewById(R.id.Textb);
        EditText Textc = (EditText)findViewById(R.id.Textc);
        TextView textDelta = (TextView)findViewById(R.id.textDelta);
        TextView textRis = (TextView)findViewById(R.id.textRis);

        double a = Double.parseDouble(Texta.getText() .toString());
        double b = Double.parseDouble(Textb.getText() .toString());
        double c = Double.parseDouble(Textc.getText() .toString());
        double delta=0, x=0, x1=0;
        delta = b*b - 4*a*c;
        if (a==0){
            textDelta.setText("");
            textRis.setText("Errore: a=0");
        }
        if(delta>=0){
            x = (-b + Math.sqrt(delta))/(2*a);
            x1 = (-b - Math.sqrt(delta))/(2*a);
            textRis.setText("X=" + Double.toString(x) + "    X1=" + Double.toString(x1));
            textDelta.setText("Delta=" + Double.toString(delta));
        }
        if (delta<0){
            textRis.setText("Delta<0 Equazione impossibile");
            textDelta.setText("Delta=" + Double.toString(delta));
        }

    }
}
