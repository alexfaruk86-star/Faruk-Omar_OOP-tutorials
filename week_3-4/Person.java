class Person {

    private String name;
    private String id;

    // Constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Method
    public void introduce() {
        System.out.println("I am a person.");
    }
}