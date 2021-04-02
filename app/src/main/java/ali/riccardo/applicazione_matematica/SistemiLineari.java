package ali.riccardo.applicazione_matematica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SistemiLineari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistemi_lineari);
    }

    public void onButtonClick (View v){
        EditText Texta = (EditText)findViewById(R.id.Texta);
        EditText Textb = (EditText)findViewById(R.id.Textb);
        EditText Textc = (EditText)findViewById(R.id.Textc);
        EditText Texta1 = (EditText)findViewById(R.id.Texta1);
        EditText Textb1 = (EditText)findViewById(R.id.Textb1);
        EditText Textc1 = (EditText)findViewById(R.id.Textc1);
        TextView textSoluzioni = (TextView)findViewById(R.id.textSoluzioni);
        Button buttonCalcola = (Button)findViewById(R.id.buttonCalcola);

        double a = Double.parseDouble(Texta.getText() .toString());
        double b = Double.parseDouble(Textb.getText() .toString());
        double c = Double.parseDouble(Textc.getText() .toString());
        double a1 = Double.parseDouble(Texta1.getText() .toString());
        double b1 = Double.parseDouble(Textb1.getText() .toString());
        double c1 = Double.parseDouble(Textc1.getText() .toString());
        double d = 0;
        double dx = 0;
        double dy = 0;
        double x = 0;
        double y = 0;

        d = a * b1 - b * a1;
        dx = c * b1 - b * c1;
        dy = a * c1 - a1 * c;

        if (d != 0){
            x = dx / d;
            y = dy / d;
            textSoluzioni.setText("x=" + Double.toString(x) + " y=" + Double.toString(y));
        }
        else if (dx == 0 && dy == 0){
            textSoluzioni.setText("Sistema indeterminato, infinite soluzioni");
        }
        else if (d == 0){
            textSoluzioni.setText("Sistema impossibile, nessuna soluzione");
        }



    }
}
