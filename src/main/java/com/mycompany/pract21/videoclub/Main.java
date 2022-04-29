package com.mycompany.pract21.videoclub;

import com.mycompany.pract21.videoclub.objects.Categoria;
import com.mycompany.pract21.videoclub.objects.Pelicula;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        Pelicula spiderman = new Pelicula();

        Categoria categoria = new Categoria();
        categoria.setNombre("Accion");

        Categoria otraCategoria = new Categoria();
        otraCategoria.setNombre("Ciencia Ficcion");

        spiderman.setNombre ("lejos de casa");
        spiderman.setAnioEstreno(1994);
        spiderman.setCategoria(categoria);

        System.out.println(spiderman);
        System.out.println("Programa terminado!");

    }

}