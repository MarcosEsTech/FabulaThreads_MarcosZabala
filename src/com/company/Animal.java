package com.company;

import static com.company.Main.carreraLongitud;

public class Animal{
    private int carrera;
    private String name;

    public Animal(String nombre){
        this.name=nombre;
        carrera=0;

    }

    public int rng() {
        int rng = (int) Math.floor(Math.random() * 10) + 1;
        return rng;
    }

    public int avanceCarrera(int advance){

        if(this.carrera + advance < 1) {
            this.carrera = 1;
        }else if(this.carrera + advance > carreraLongitud){
            this.carrera = carreraLongitud;
        }else{
            this.carrera += advance;
        }
        System.out.println(name + ": " + this.carrera);
        return carrera;
    }

    public boolean CarreraFin(){
        System.out.println(name +" termino la carrera.");
        System.out.println(name + " gano la carrera.");
        return true;
    }
}
