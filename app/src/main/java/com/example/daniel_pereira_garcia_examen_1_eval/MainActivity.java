package com.example.daniel_pereira_garcia_examen_1_eval;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;
    ImageView iv6;

    ArrayList<ImageView> imagenes;
    ConstraintLayout cl;
    int cont=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1=findViewById(R.id.iv1);
        iv2=findViewById(R.id.iv2);
        iv3=findViewById(R.id.iv3);
        iv4=findViewById(R.id.iv4);
        iv5=findViewById(R.id.iv5);
        iv6=findViewById(R.id.iv6);
        int[] imagenes ={R.drawable.ic_android_black_24dp};
        iv1.setImageResource(imagenes[0]);
        iv2.setImageResource(imagenes[0]);
        iv3.setImageResource(imagenes[0]);
        iv4.setImageResource(imagenes[0]);
        iv5.setImageResource(imagenes[0]);
        iv6.setImageResource(imagenes[0]);
        int[] parejas ={R.drawable.ic_vacio,R.drawable.ic_mitad,R.drawable.ic_luna};




    }
            public void jugar(View v){
                Rhilo r= new Rhilo(this);
                Thread h= new Thread(r);

                h.start();
                    }




}
