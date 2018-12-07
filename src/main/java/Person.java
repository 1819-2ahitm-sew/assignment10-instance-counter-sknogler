public class Person {
    protected String vorname;
    protected String nachname;
    static int instances;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;

        instances++;
    }
}
