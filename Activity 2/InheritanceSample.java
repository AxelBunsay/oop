public class InheritanceSample {
    public static void main(String[] args) {
        
        Student student = new Student("Axel", "Balayan", "BSIT", "Second Year");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());

        Staff staff = new Staff("Althea", "Concepcion", "Criminology", 30000.0);
        System.out.println("\nStaff Name: " + staff.getName());
        System.out.println("Staff Address: " + staff.getAddress());
        System.out.println("Staff School: " + staff.getSchool());
        System.out.println("Staff Salary: " + staff.getSalary());
    }
}