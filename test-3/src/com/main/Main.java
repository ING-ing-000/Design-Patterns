package com.main;

public class Main {
    public static void main(String args[]) {

        AbstractSource source = new TextSource();  
        AbstractTransforme XMLt = new XMLTransforme(); 

        source.change();
        XMLt.change();

    }
}
