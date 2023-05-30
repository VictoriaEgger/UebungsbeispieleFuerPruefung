package EventKalender;

import java.util.ArrayList;
import java.util.HashMap;

public class Eventkalender {

    ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event e) {
        events.add(e);

    }

    public Event getByTitle(String title) {
        Event ergebnis = null;
        for (Event e : events) {

            String eventTitle = e.getTitle();
            if (eventTitle.equals(title)) {
                ergebnis = e;
            }
        }
        return ergebnis;
    }

    public ArrayList<Event> getEvents(double min, double max) {
        ArrayList<Event> ergebniss = new ArrayList<>();

        for (Event e : events) {
            if (e.getEintrittspreis() >= min && e.getEintrittspreis() <= max) {
                ergebniss.add(e);
            }
        }
        return ergebniss;
    }

    public Event getMostExpensiveByOrt(String ort) {
        Event ergebnis = null;
        double highestprice = 0;

        for (Event e : events) {
            if (e.getOrt().equals(ort)) {

                if (e.getEintrittspreis() > highestprice) {
                    ergebnis = e;
                    highestprice = e.getEintrittspreis();
                }
            }

        }
        return ergebnis;


    }

    public double getAvgPreisByOrt(String ort){
        double gesamtPreis = 0;
        double counter = 0;
        for (Event e : events){
            if (e.getOrt().equals(ort)){
                gesamtPreis = gesamtPreis + e.getEintrittspreis();
                counter++;
            }
        }
        return gesamtPreis / counter;
    }

    public HashMap<String, Integer> getCountEventsByOrt(){
        HashMap<String, Integer> ergebnis = new HashMap<>();

        for (Event e : events){
            String getOrt = e.getOrt();
            if(ergebnis.containsKey(getOrt)){
                ergebnis.put(getOrt, ergebnis.get(getOrt)+1);
            }
            else {
                ergebnis.put(getOrt, 1);

            }
        }
        return ergebnis;
    }

    public HashMap<String,Double> getSumPriceEventsByOrt(){
        HashMap<String, Double> ergebniss = new HashMap<>();

        for (Event e : events){
            String getOrt = e.getOrt();
            double getPrice = e.getEintrittspreis();
            if (ergebniss.containsKey(getOrt)){
                ergebniss.put(getOrt, ergebniss.get(getOrt)+getPrice);
            }
            else ergebniss.put(getOrt,getPrice);
        }
        return ergebniss;
    }
}
