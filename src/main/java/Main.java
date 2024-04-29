public class Main {
    public static void main(String[] args) {
        Animal susie = new Animal("1", "Susie", "Cat", (short) 12);
        Animal benjamin = new Animal("2", "Benjamin Blümchen", "Elephant", (short) 34);
        Animal alfred = new Animal("3", "Alfred Jodokus Quack", "Duck", (short) 15);

        System.out.println(susie.equals(benjamin));
        System.out.println(susie.equals(susie));

        System.out.println(susie);


    }
}
