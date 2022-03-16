package com.company;

import java.io.Serializable;

public class Colección implements Serializable {
    private int libros;
    private int cuantos;
    private String género;
    private Libro coll[];
    public Colección(int libros,String género){
        this.libros=libros;
        this.cuantos=0;
        this.género=género;
        this.coll=new Libro[libros];
    }
    public Colección(){
        this.libros=0;
        this.cuantos=0;
        this.género=null;
        this.coll=new Libro[0];
    }
    int getLibros() {
        return libros;
    }

    void setLibros(int libros) {
        this.libros = libros;
    }

    String getGénero() {
        return género;
    }

    void setGénero(String género) {
        this.género = género;
    }


    boolean nuevoLibro(Libro l){
        int i;
        for(i=0;i<this.cuantos;i++){
            if(this.coll[i]==null){
                this.coll[i]=l.CopiaLibro();
                return true;
            }
        }
        if(this.coll[this.cuantos]==null){
            this.coll[this.cuantos]=l.CopiaLibro();
            this.cuantos++;
            return true;
        }
        return false;
    }
    Libro anterior(Libro l){
        int i;
        for(i=0;i<this.libros;i++){
            if(this.coll[i].equals(l)){
                i--;
                return this.coll[i];
            }
        }
        return null;
    }
    public boolean eliminarLibro(Libro l){
        int i;
        for(i=0;i<this.libros;i++){
            if(this.coll[i].equals(l)){
                this.coll[i]=null;
                return true;
            }
        }
        return false;
    }
}

