package csanti.barriento.lifecyclesb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

        TextView TVCreate, TVStart, TVRestart, TVResumen, TVPause, TVStop, TVDestroy;
        int ContadorCreate, ContadorStart, ContadorRestart, ContadorResume, ContadorPause, ContadorStop, ContadorDestroy;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            TVCreate = findViewById(R.id.TVCreate);
            ContadorCreate = ContadorCreate + 1;
            TVCreate.setText(""+ ContadorCreate);
        }
        protected void onStart(){
            super.onStart();
            TVStart = findViewById(R.id.TVStart);
            ContadorStart = ContadorStart + 1;
            TVStart.setText(""+ ContadorStart);
        }
        protected void onRestart(){
            super.onRestart();
            TVRestart = findViewById(R.id.TVRestart);
            ContadorRestart = ContadorRestart + 1;
            TVRestart.setText(""+ ContadorRestart);
        }
        protected void onResume(){
            super.onResume();
            TVResumen = findViewById(R.id.TVResume);
            ContadorResume = ContadorResume + 1;
            TVResumen.setText(""+ ContadorResume);
        }
        protected void onPause(){
            super.onPause();
            TVPause = findViewById(R.id.TVPause);
            ContadorPause = ContadorPause + 1;
            TVPause.setText(""+ ContadorPause);
        }
        protected void onStop(){
            super.onStop();
            TVStop = findViewById(R.id.TVStop);
            ContadorStop = ContadorStop + 1;
            TVStop.setText(""+ ContadorStop);
        }
        protected void onDestroy(){
            super.onDestroy();
            TVDestroy = findViewById(R.id.TVDestroy);
            ContadorDestroy = ContadorDestroy + 1;
            TVDestroy.setText(""+ ContadorDestroy);
            System.out.println("Destoy");
        }
    }
