package poo.inheritance.ex06;

public class Child extends Mother {
    
    // Método construtor padrão = atributos vazios
    // Default constructor method = empty attributes
    
    public Child() {
        
    }

    // Método Construtor com atributos inicializados
    // Constructor method with attributes initialized
    
    public Child(String eyes, String nose, String mouth, String hair) {
        super(eyes, nose, mouth, hair);
    }
    
    // Sobrescrevendo os métodos comuns
    // Overriding common methods
    
    @Override
    public void speak() {
        System.out.println("\nChild is talking");
    }
    
    @Override
    public String walk() {
        return "\nChild is walking";
    }
    
    // Método exclusivo da filha
    // Daughter's exclusive method
    
    public String toDance() {
        return "Child is dancing";
    }
}