public class Main {
    public static void main(String[] args) {

        Owner aljoscha = new Owner("Aljoscha Zöller", (short) 20, "10559 Berlin");

        Animal susie = new Animal("1", "Susie", "Cat", (short) 12, aljoscha);
        Animal benjamin = new Animal("2", "Benjamin Blümchen", "Elephant", (short) 34, null);
        Animal alfred = new Animal("3", "Alfred Jodokus Quack", "Duck", (short) 15, null);
        Animal struppi = new Animal("4", "Struppi", "Dog", (short) 1, aljoscha);

        System.out.println(susie.equals(benjamin));
        System.out.println(susie.equals(susie));

        System.out.println(susie);


    }
}
