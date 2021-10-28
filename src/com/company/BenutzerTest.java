package com.company;
import Sport.Sport;
import Sport.Fussball;
import Sport.Benutzer;
import Sport.Basketball;
import Sport.Hindernislauf;
import Sport.Hochsprung;
import Sport.Leichtathletik;
import Sport.Mannschaftssport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BenutzerTest {

    private Benutzer TestBenutzer;
    private Sport Fussball;
    private Sport Basketball;
    private Sport Hindernislauf;
    private Sport Hochsprung;
    private List<Sport> sporte;

    @BeforeEach
    public void setup(){
        Fussball = new Fussball();
        Basketball = new Basketball();
        Hindernislauf = new Hindernislauf();
        Hochsprung = new Hochsprung();
        sporte = new ArrayList<>();
        sporte.add(Fussball);
        sporte.add(Basketball);
        sporte.add(Hindernislauf);
        sporte.add(Hochsprung);
        TestBenutzer = new Benutzer("Andrei", "Popa", sporte);
    }

    @Test
    public void kalkuliereZeit(){
        assertEquals(TestBenutzer.kalkuliereZeit(), 170);
    }

    @Test
    public void testKalkuliereZeit(){
        assertEquals(TestBenutzer.kalkuliereZeit(Fussball), 65);
        assertEquals(TestBenutzer.kalkuliereZeit(Basketball), 55);
        assertEquals(TestBenutzer.kalkuliereZeit(Hindernislauf), 30);
        assertEquals(TestBenutzer.kalkuliereZeit(Hochsprung), 20);

    }
    
    @Test
    public void testKalkuliereDurschnittszeit(){
        assertEquals(TestBenutzer.kalkuliereDurschnittszeit(), 42.5);
    }

    public void testAll(){
        setup();
        kalkuliereZeit();
        testKalkuliereZeit();
        testKalkuliereDurschnittszeit();
        System.out.println("All Tests Passed");
    }
}
