package Getraenke;

public abstract class Getraenk implements Brennbar {
    protected String name;

    public Getraenk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public int getAnzahlZutaten();
    abstract public boolean beinhaltetAlkohol();
    abstract public double mergeInML();

    @Override
    public String toString() {
        return "Getraenk{" +
                "name='" + name + '\'' +
                "Anzahl Zutaten: " + getAnzahlZutaten() +
                "Hat Alkohol: " + beinhaltetAlkohol()+
                "Brennbar: " + brennt() +
                '}';
    }

    public abstract boolean neinhaltetAlkohol();

    public abstract double mergeInMI();


}
