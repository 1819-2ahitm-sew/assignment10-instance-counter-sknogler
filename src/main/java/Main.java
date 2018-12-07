public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Hans", "Werner");
        Person p2 = new Person("Günther", "Bartl");
        Person p3 = new Person("Meril", "berlin");

        System.out.print(Person.instances);
    }
}
