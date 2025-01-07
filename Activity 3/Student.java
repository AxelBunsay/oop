public class Student {
    private String name;
    private String address;
    private String program;
    private int year;

    // Constructor
    public Student(String name, String address, String program, int year) {
        this.name = name;
        this.address = address;
        this.program = program;
        this.year = year;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }
}