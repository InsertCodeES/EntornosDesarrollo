package com.damian;

import Clases.Libro;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("skere123","Las Leyendas de Spursito", "Yo", 69);
        Libro libro2 = new Libro("nose432","Egoland","Melendi",420);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        if (libro1.getPaginas()>libro2.getPaginas()) {
            System.out.println("El libro con más páginas es" + libro1.getTitulo());
        }
        else {
            System.out.println("El libro con más páginas es " + libro2.getTitulo());
        }
    }
}
