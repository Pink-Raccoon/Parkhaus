package com.company;

public class Parkhaus {
    private static final int PARKPLATZMENGE = 50;

    Parkhaus (){

        for (int i = 1; i<=PARKPLATZMENGE; i++ ) {
            Parkplatz parkplatz = new Parkplatz(i);
            //TODO: list? or something for parknr.
        }
    }
}
