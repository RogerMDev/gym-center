package com.rogermdev.gymcenter.domain.entities;

import java.util.Date;

public class GymPass {


    private final GymPassCategory categoria;
    private final double precio;
    private int id;

    public GymPass (GymPassCategory categoria, double precio) {
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
