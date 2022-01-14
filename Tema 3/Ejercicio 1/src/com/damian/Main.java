package com.damian;
import Clases.Cuenta;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Maria");
        Cuenta cuenta2 = new Cuenta("Jose",500);

        cuenta2.retirar(80);
        cuenta2.ingresar(60);

    }
}
