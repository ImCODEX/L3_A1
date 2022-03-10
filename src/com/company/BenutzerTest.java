package com.company;
import Sport.Sport;
import Sport.Fussball;
import Sport.Benutzer;
import Sport.Basketball;
import Sport.Hindernislauf;
import Sport.Hochsprung;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BenutzerTest {

    private Benutzer testBenutzer;
    private Sport fussball;
    private Sport basketball;
    private Sport hindernislauf;
    private Sport hochsprung;
    private List<Sport> sporte;

    @BeforeEach
    public void setup(){
        fussball = new Fussball();
        basketball = new Basketball();
        hindernislauf = new Hindernislauf();
        hochsprung = new Hochsprung();
        sporte = new ArrayList<>();
        sporte.add(fussball);
        sporte.add(basketball);
        sporte.add(hindernislauf);
        sporte.add(hochsprung);
        testBenutzer = new Benutzer("Andrei", "Popa", sporte);
    }

    @Test
    public void kalkuliereZeit(){
        assertEquals(testBenutzer.kalkuliereZeit(), 170);
    }

    @Test
    public void testKalkuliereZeit(){
        assertEquals(testBenutzer.kalkuliereZeit(fussball), 65);
        assertEquals(testBenutzer.kalkuliereZeit(basketball), 55);
        assertEquals(testBenutzer.kalkuliereZeit(hindernislauf), 30);
        assertEquals(testBenutzer.kalkuliereZeit(hochsprung), 20);

    }
    
    @Test
    public void testKalkuliereDurschnittszeit(){
        assertEquals(testBenutzer.kalkuliereDurschnittszeit(), 42.5);
    }

    public void testAll(){
        setup();
        kalkuliereZeit();
        testKalkuliereZeit();
        testKalkuliereDurschnittszeit();
        System.out.println("All Tests Passed");
    }
}
