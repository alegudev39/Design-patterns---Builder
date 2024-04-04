//Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(Person.builder("Luca","Rossi"));
        Person person2 = new Person(Person.builder("Gigi","Verdi"));
        person2.setFirstName("Gigino");
        person2.setAddress("Piazza Martiri");


        System.out.println("person1" + person1);
        System.out.println("person2" + person2);


    }
}