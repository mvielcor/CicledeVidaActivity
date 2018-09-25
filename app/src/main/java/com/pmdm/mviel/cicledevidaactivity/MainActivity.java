package com.pmdm.mviel.cicledevidaactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/*Amb aquesta classe pretenem mostrar el funcionament del cicle de vida dels activities
* L'app mostrarà un missatge per cada estat en que es trobe en cada moment
* */


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "CicleDeVida";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        /*  S'executa quan el sistema crea una nova instància de l'Activity.
            En este moment, l'activity encara no és visible per a l'usuari
            Sol utilitzar-se per a:

            Unflar la UI de l'activity
            Referenciar els views com a objectes java
            Afegir dades als objectes view
            Consultar bases de dades
            etc.
        */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"OnCreate");
    }


    @Override protected void onStart() {
        /*  Es crida després d'onCreate().
            En aquest moment, l'activity és visible per a l'usuari, però l'usuari encara no pot
            interactuar ambl'activity.
            Podem escriure instruccions que afecten a l'UI.
            No sol utilitzar-se massa.
        */
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override protected void onResume() {
        /*S'executa abans que l'activity canvie d'estat i estiga disponible per a l'usuari
         És a dir, que l'usuari puga interactuar amb ella.
         Sol utilitzar-se per a carregar dades provinents de bases de dades, arrancar components com la càmera, GPS, etc.*/
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override protected void onPause() {
        /* L'activity va a canviar d'estat i va a pausar-se.
        Igual necessitem aturar alguna animació, o guardar l'estat de l'activity...
        En este moment, l'activitat encara és visible, pel que podriem modificar l'estat de la UI.
         */
        Log.d(TAG,"onPause");
        super.onPause();
    }

    @Override protected void onStop() {
        /*S'executa quan l'activity va a parar-se i deixarà d'estar visible.
        * En cas de manca de recursos, aquest mètode podria no arribar a invocar-se.
        */
        Log.d(TAG, "onStop");
        super.onStop();
    }

    @Override protected void onRestart() {
        /*Quan l'activity està en estat Detingut (STOP), i volem tornar-la a engegar, executarem aquest mètode.
         S'executa abans d'onStart() i després d'onStop().
         És molt útil quan volem diferenciar entre iniciar un Activity per primera vegada i quan volem re-iniciar el mateix activity.
        */
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override protected void onDestroy() {
        /*S'executa abans de destruir l'activity (estat Inexistent).
        L'utilitzarem per a alliberar recursos creats per l'activity (threads, mapes, etc
        */
        Log.d(TAG,"onDestroy");
        super.onDestroy();
    }

}
;