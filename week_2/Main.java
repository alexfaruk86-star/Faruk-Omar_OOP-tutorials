public class Main {

    public static void main(String[] args) {

        // Create Student object
        Student s1 = new Student("John", 20, 3.5);

        // Display information
        s1.displayInfo();

        // Call other methods
        s1.study();

        s1.takeExam();
    }
}
