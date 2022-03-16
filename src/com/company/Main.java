package com.company;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Main {

    public static void main(String[] args) {
        Colección col1=new Colección(15,"Aventuras");
        Libro l1=new Libro (245,"Cervantes","0042BC","Don Quijote de la Mancha");
        Libro l2=new Libro();

        col1.nuevoLibro(l1);
        col1.nuevoLibro(l2);
        System.out.println(col1.anterior(l2));
        System.out.println(col1.eliminarLibro(l2));
    }
}
