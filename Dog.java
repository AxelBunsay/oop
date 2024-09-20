import java.util.ArrayList;

public class Dog {
    public static void main(String[] args) {
        private String name;
        private boolean isMale;
        private int age;
        public ListofPuppies[] = ("Chico", "Sumo", "Junno");
    }

    public void setName(String name){
    }

    public Dog(String name, boolean isMale, int age) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
        this.puppies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public void showName() {
        System.out.println("The dog's name is: " + name);
    }

    public void showPuppies() {
        System.out.println("The dog's puppies are:");
        for (String puppy : puppies) {
            System.out.println(puppy);
        }
    }

    public void bark() {
        System.out.println("WOFF!, WOFF!");
    }
}