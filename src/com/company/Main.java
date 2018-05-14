package com.company;


public class Main {

    public static void main(String[] args) {

        Lista<Articulo> misArticulos = new Lista<>();
        Articulo currArt;

        for(int ix = 0; ix < 10; ix++)
        {
            currArt = new Articulo();
            currArt.setClave(ix + 20);
            currArt.setDescripcion("Articulo " + ix);
            currArt.setCaducidad("2018-05-" + ix + 5);
            currArt.setPrice(5.3 + ix);

            misArticulos.insert(new Node<>(currArt));
        }


        misArticulos.search(2 );
        misArticulos.print();
        misArticulos.remove();
        System.out.println("*********************");

        misArticulos.print();
    }
}
