package com.rogermdev.gymcenter.domain.entities;

public class GymUser {

    private int id;
    private String nombre;
    private int edad;
    private String email;
    private GymPass gympass;
    
    
    Public GymUser (String nombre, int edad, String email, GymPass gympass){
        this.id = id++;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.gympass = gympass;
    }
}
