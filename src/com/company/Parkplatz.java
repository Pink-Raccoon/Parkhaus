package com.company;

import com.company.Fahrzeug;
import java.lang.Exception;


public class Parkplatz {
    private int parkplatzNummer;
    private Fahrzeug parkplatzBelegung = null;



    public Parkplatz(int parkplatzNummer)  {
       this.parkplatzNummer = parkplatzNummer;
    }


    public void setParkplatz(Fahrzeug fahrzeug) throws NichtParkierbarException {
        if (parkplatzBelegung != null) {

            throw new NichtParkierbarException("Parkplatz bereits belegt");
        }
        parkplatzBelegung = fahrzeug;

    }





}
