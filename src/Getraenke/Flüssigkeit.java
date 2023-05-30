package Getraenke;

public class Flüssigkeit {
    private String name;
    private double merge;
    private double alkoholProzent;

    public Flüssigkeit(String name, double merge, double alkoholProzent) {
        this.name = name;
        this.merge = merge;
        this.alkoholProzent = alkoholProzent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMerge() {
        return merge;
    }

    public void setMerge(double merge) {
        this.merge = merge;
    }

    public double getAlkoholProzent() {
        return alkoholProzent;
    }

    public void setAlkoholProzent(double alkoholProzent) {
        this.alkoholProzent = alkoholProzent;
    }
}
