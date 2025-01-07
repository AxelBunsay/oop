public class Staff {
    private String name;
    private String address;
    private String school;
    private double salary;

    // Constructor
    public Staff(String name, String address, String school, double salary) {
        this.name = name;
        this.address = address;
        this.school = school;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSchool() {
        return school;
    }

    public double getSalary() {
        return salary;
    }
}