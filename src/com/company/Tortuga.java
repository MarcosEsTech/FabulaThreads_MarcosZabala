package com.company;

import static com.company.Main.carreraLongitud;

public class Tortuga extends Thread{

    private String nombre;
    private int carrera;
    private int avance;

    public Tortuga(String nombre){
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
            case 2:
                advance = -6;
                break;
            case 3:
            case 4:
            case 5:
                advance = 1;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                advance = 3;
                break;
        }
        return advance;
    }
}
