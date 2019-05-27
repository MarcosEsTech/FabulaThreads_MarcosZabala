package com.company;

public class Main {

    static int carreraLongitud =70;

    public static void main(String[] args) {
        Tortuga tortuga = new Tortuga("Tortuga");
        Liebre liebre = new Liebre("Liebre");

        System.out.println("Comienza la carrera");

        tortuga.start();
        liebre.start();

        while(liebre.isAlive() && tortuga.isAlive()){
        }

        tortuga.stop();
        liebre.stop();
    }
}
