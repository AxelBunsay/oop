public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Axel", "Brgy. 5, Balayan", "BSIT", 3);
        
        // Print Student details
        System.out.println("\nSTUDENT");
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());
        System.out.println(student1.toString());
        
        // Create a Staff object
        System.out.println("\n\nSTAFF");
        Staff staff1 = new Staff("Althea", "Brgy. 5, Balayan", "BSU Balayan", 2500.75);
        System.out.println("Staff Name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff School: " + staff1.getSchool());
        System.out.println("Staff Salary: " + staff1.getSalary() + "php");
        System.out.println(staff1.toString());
    }
}