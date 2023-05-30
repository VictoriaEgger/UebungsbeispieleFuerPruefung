package EventKalender;

public class Main {
    public static void main(String[] args) {
        Event e = new Event("Hallo","Pferd",100.00);
        Event e2 = new Event("Servus", "Esel", 50.00);
        Event e3 = new Event("Moin", "Giraffe", 30.00);
        Event e4 = new Event("MoinMittel", "Giraffe", 40.00);
        Event e5 = new Event("MoinTeuer", "Giraffe", 41.00);

        Eventkalender eventkalender = new Eventkalender();
        eventkalender.addEvent(e);
        eventkalender.addEvent(e2);
        eventkalender.addEvent(e3);
        eventkalender.addEvent(e4);
        eventkalender.addEvent(e5);


        System.out.println(eventkalender.getByTitle("Moin"));
        System.out.println(eventkalender.getMostExpensiveByOrt("Giraffe"));
        System.out.println(eventkalender.getAvgPreisByOrt("Giraffe"));

        System.out.println(eventkalender.getCountEventsByOrt());
        System.out.println(eventkalender.getSumPriceEventsByOrt());
    }
}
