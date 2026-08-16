public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ali", "P001");

        Person p2 = new Student("John", "S001");

        Person p3 = new Lecturer("Sarah", "L001");


        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
