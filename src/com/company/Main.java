package com.company;


import Sport.Sport;
import Sport.Fussball;
import Sport.Benutzer;
import Sport.Basketball;
import Sport.Hindernislauf;
import Sport.Hochsprung;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        //Teste  fur die Funktionalitat
        Sport s1 = new Fussball();
        Sport s2 = new Basketball();
        Sport s3 = new Hindernislauf();
        Sport s4 = new Hochsprung();
        List<Sport> sportList = new ArrayList<>();
        sportList.add(s1);
        sportList.add(s2);
        sportList.add(s3);
        sportList.add(s4);
        Benutzer Andrei = new Benutzer("Andrei", "Popa", sportList);
        System.out.println(Andrei.kalkuliereZeit());
        System.out.println(Andrei.kalkuliereZeit(s2));
        System.out.println(Andrei.kalkuriereDurschnittszeit());
    }
}
