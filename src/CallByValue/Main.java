package CallByValue;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);

        doSomething(a);
        System.out.println(a);

        Person person = new Person("Pablo");
        System.out.println(person.getName());
        doSomething(person);
        System.out.println(person.getName());


    }

    public static void doSomething(int a) {
        a = 10;
        System.out.println("doSomething " + a);

    }

    public static void doSomething(Person p) {
        p.setName("NumeNou");
        System.out.println(p.getName());
    }

}
