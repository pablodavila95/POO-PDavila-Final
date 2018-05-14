package com.company;

public class Lista<T> {
    private Node<T> first = null;


    public void insert(Node<T> node) {
        node.setNext(first);
        first = node;
    }


    public String search(int s) {
        Node<Articulo> n;
        n = (Node<Articulo>) first;
        while (n != null) {
            if (n.getValue().getClave() == s)
                System.out.println(n.getValue().toString());
            n = n.getNext();
        }
        return "No se encontro un articulo";
    }

    public void remove(){
        if(first.getNext()!=null)
            first = first.getNext();
        else first = null;
    }


    private void printList(Node<T> node) {
        System.out.println(node.getValue().toString());
        if(node.getNext()!=null) printList(node.getNext());
    }

    public void print(){
        printList(first);
    }

}
