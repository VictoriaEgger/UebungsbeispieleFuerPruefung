package Getraenke;

import java.util.ArrayList;

public class Cocktail extends Getraenk{

    protected ArrayList<Flüssigkeit> bestandteile = new ArrayList<>();

    public Cocktail(String name) {
        super(name);
    }

    @Override
    public boolean brennt() {
        return false;
    }

    @Override
    public int getAnzahlZutaten() {
        return 0;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        return false;
    }

    @Override
    public double mergeInML() {
        return 0;
    }

    @Override
    public boolean neinhaltetAlkohol() {
        return false;
    }

    @Override
    public double mergeInMI() {
        return 0;
    }
}
