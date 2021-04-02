package ali.riccardo.applicazione_matematica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class logaritmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logaritmi);
    }

    public void onButtonClick (View v){
        EditText textA = (EditText)findViewById(R.id.textA);
        EditText textB = (EditText)findViewById(R.id.textB);
        TextView textRis = (TextView)findViewById(R.id.textRis);

        double a = Double.parseDouble(textA.getText() .toString());
        double b = Double.parseDouble(textB.getText() .toString());

        if (a>0 && b>0 && a!=1) {
        double ris = Math.log(b) / Math.log(a);
        textRis.setText("X = " + Double.toString(ris));}

        else if (a<=0 || a==1 || b<0) {
            textRis.setText("Errore, CE: (a>0, a!=1; b>0)");}
    }
}
