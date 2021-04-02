package ali.riccardo.applicazione_matematica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonEquazioniSecondoGrado(View v){
        Intent intent = new Intent(this, EquazioniSecondoGrado.class);
        startActivity(intent);
    }

    public void buttonGoniometria(View v1){
        Intent intent = new Intent(this, Goniometria.class);
        startActivity(intent);
    }

    public void buttonSistemiLineari(View v2){
        Intent intent = new Intent(this, SistemiLineari.class);
        startActivity(intent);
    }

    public void buttonLogaritmi (View v3){
        Intent intent = new Intent (this, logaritmi.class);
        startActivity(intent);
    }


}
