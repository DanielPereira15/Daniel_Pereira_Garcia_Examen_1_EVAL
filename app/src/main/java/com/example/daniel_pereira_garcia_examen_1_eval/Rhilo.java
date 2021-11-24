package com.example.daniel_pereira_garcia_examen_1_eval;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Rhilo implements Runnable{
    MainActivity actividadPrincipal;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;
    ImageView iv6;
    int cont=0;
    int numRandom;

    public Rhilo(MainActivity ap){
        this.actividadPrincipal=ap;
        iv1=actividadPrincipal.findViewById(R.id.iv1);
        iv2=actividadPrincipal.findViewById(R.id.iv2);
        iv3=actividadPrincipal.findViewById(R.id.iv3);
        iv4=actividadPrincipal.findViewById(R.id.iv4);
        iv5=actividadPrincipal.findViewById(R.id.iv5);
        iv6=actividadPrincipal.findViewById(R.id.iv6);
        int[] imagenes ={R.drawable.ic_vacio,R.drawable.ic_mitad,R.drawable.ic_luna,R.drawable.ic_android_black_24dp};



    }

    @Override
    public void run() {
        int[] imagenes = {R.drawable.ic_vacio, R.drawable.ic_mitad, R.drawable.ic_luna, R.drawable.ic_android_black_24dp};
        int[] imagenesFinales = new int[6];
        int[] numeros = new int[3];
        for (int j=0;j<numeros.length;j++){
            numeros[j]=0;
        }
        Random r = new Random();

                        for (int i = 0; i < 6; i++) {

                            numRandom=r.nextInt(3);
                                imagenesFinales[i] = imagenes[numRandom];
                            }

            while (cont < 4) {
                actividadPrincipal.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {


                        if (cont % 2 == 0) {
                            iv1.setImageResource(imagenes[3]);
                            iv2.setImageResource(imagenes[3]);
                            iv3.setImageResource(imagenes[3]);
                            iv4.setImageResource(imagenes[3]);
                            iv5.setImageResource(imagenes[3]);
                            iv6.setImageResource(imagenes[3]);

                        } else {

                            iv1.setImageResource(imagenesFinales[0]);
                            iv2.setImageResource(imagenesFinales[1]);
                            iv3.setImageResource(imagenesFinales[2]);
                            iv4.setImageResource(imagenesFinales[3]);
                            iv5.setImageResource(imagenesFinales[4]);
                            iv6.setImageResource(imagenesFinales[5]);

                        }
                    }
                });
                cont++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public boolean esCorrecto(int[] array,int numero){
            boolean cierto=false;
            for (int i=0;i<array.length;i++){
                if (array[i]<2){
                    cierto=true;
                }else{
                    cierto=false;
                }
            }
            return cierto;
        }
    }
