package Getraenke;

public class LongDrink extends Getraenk{

    protected Flüssigkeit spirituose;
    protected Flüssigkeit filler;

    public LongDrink(String name, Flüssigkeit spirituose, Flüssigkeit filler) {
        super(name);
        this.spirituose = spirituose;
        this.filler = filler;
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
