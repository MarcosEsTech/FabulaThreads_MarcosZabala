package com.company;

import static com.company.Main.carreraLongitud;

public class Liebre extends Thread{

    private String nombre;
    private int carrera;
    private int avance;

    public Liebre(String nombre){
        super(nombre);
        this.nombre=nombre;
        carrera=0;
    }

    @Override
    public void run(){
        Animal animal = new Animal(nombre);
        try{
            while(carrera<carreraLongitud){
                Thread.sleep(1000);
                avance=CalcularAvance(animal.rng());
                carrera=animal.avanceCarrera(avance);
            }
            animal.CarreraFin();
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    private int CalcularAvance(int rng) {
        int advance = 0;
        switch (rng){
            case 1:
                advance = -12;
                break;
            case 2:
            case 3:
                advance = -2;
                break;
            case 4:
            case 5:
                advance = 0;
                break;
            case 6:
            case 7:
                advance = 9;
                break;
            case 8:
            case 9:
            case 10:
                advance = 1;
                break;
        }
        return advance;
    }
}
