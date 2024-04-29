import com.aljoschazoeller.java.bankservice.Account;
import com.aljoschazoeller.java.bankservice.Client;
import com.aljoschazoeller.java.zoo.Animal;
import com.aljoschazoeller.java.zoo.Owner;
import com.aljoschazoeller.java.zoo.Species;

public class Main {
    public static void main(String[] args) {

        Owner aljoscha = new Owner("Aljoscha Zöller", (short) 20, "10559 Berlin");
        Owner katharina = new Owner("Katharina", (short) 23, "Berlin");
        Owner heinz = new Owner("Heinz", (short) 81, "Erlensee");

        Species cat = new Species("Cat", 100);
        Species elephant = new Species("Elephant", 50000);
        Species duck = new Species("Duck", 400);
        Species dog = new Species("Dog", 1500);

        Animal susie = new Animal("1", "Susie", cat, (short) 12, aljoscha);
        Animal benjamin = new Animal("2", "Benjamin Blümchen", elephant, (short) 34, null);
        Animal alfred = new Animal("3", "Alfred Jodokus Quack", duck, (short) 15, null);
        Animal struppi = new Animal("4", "Struppi", dog, (short) 1, aljoscha);
        Animal wolfi = new Animal("5", "Wolfi", dog, (short) 10, katharina);
        Animal richard = new Animal("6", "Richard", dog, (short) 7, heinz);

        System.out.println(susie.equals(benjamin));
        System.out.println(susie.equals(susie));

        System.out.println(susie);

        System.out.println("------------------------------");

        Client aljoscha = new Client("Aljoscha", "Zöller", 2365987263597L);
        Client kaethe = new Client("Käthe", "Kollwitz", 227365276L);

        Account aljoschaMain = new Account();


    }
}
