package com.example.repaso;

import java.util.ArrayList;

public class Calculadora {
    // SUMA

    public double sumar(ArrayList<Double> array) {

        double total =0;
        for (double numero:array
             ) {
            total+=numero;
        }
        return total;


    }

    public double restar(ArrayList<Double> arrayNumeros) {


        double primerValor= arrayNumeros.get(0);
        for (int i=1;i<arrayNumeros.size();i++){
            primerValor-=arrayNumeros.get(i);
        }

        return primerValor;


    }
    public double multiplicar(ArrayList<Double> arrayNumeros) {


        double primerValor= arrayNumeros.get(0);
        for (int i=1;i<arrayNumeros.size();i++){
            primerValor*=arrayNumeros.get(i);
        }

        return primerValor;


    }
    public double dividir(ArrayList<Double> arrayNumeros) {


        double primerValor= arrayNumeros.get(0);
        if(primerValor==0){
            return 0;
        }
        else {
            for (int i = 1; i < arrayNumeros.size(); i++) {
                primerValor /= arrayNumeros.get(i);
            }

            return primerValor;

        }
    }
}

