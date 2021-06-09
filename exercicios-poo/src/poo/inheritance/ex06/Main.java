package poo.inheritance.ex06;

public class Main {
    public static void main(String[] args) {
        
        Mother mother = new Mother("Brown","Medium","Medium","Dark Brown");
        System.out.println(mother.toString());
        
        mother.speak();
        System.out.println(mother.walk());
        
        Child child = new Child("Blue","Big","Small","Blonde");
        System.out.println(child.toString());
        
        child.speak();
        System.out.println(child.walk());
        System.out.println(child.toDance());
    }
}