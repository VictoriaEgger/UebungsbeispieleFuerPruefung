package Getraenke;

public class SimplesGetraenk extends Getraenk{

    protected Flüssigkeit bestandteil;

    public SimplesGetraenk(String name, Flüssigkeit bestandteil) {
        super(name);
        this.bestandteil = bestandteil;
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
