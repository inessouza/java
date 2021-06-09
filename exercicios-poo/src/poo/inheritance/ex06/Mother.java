package poo.inheritance.ex06;

public class Mother {
    
    private String eyes;
    private String nose;
    private String mouth;
    private String hair;
    
    // Método construtor padrão = atributos vazios
    // Default constructor method = empty attributes
    
    public Mother() {
        
    }
    
    // Método construtor com atributos inicializados
    // Constructor method with attributes initialized
    
    public Mother(String eyes, String nose, String mouth, String hair) {
        this.eyes = eyes;
        this.nose = nose;
        this.mouth = mouth;
        this.hair = hair;
    }
    
    // Métodos comuns
    // Common methods
    
    public void speak() {
        System.out.println("Mother is talking");
    }
    
    public String walk() {
        return "mother is walking";
    }
    
    // Métodos de acesso
    // Access methods
    
    public String getOlhos() {
        return eyes;
    }
    public void setOlhos(String eyes) {
        this.eyes = eyes;
    }
    public String getNariz() {
        return nose;
    }
    public void setNariz(String nose) {
        this.nose = nose;
    }
    public String getBoca() {
        return mouth;
    }
    public void setBoca(String mouth) {
        this.mouth = mouth;
    }
    public String getCabelo() {
        return hair;
    }
    public void setCabelo(String hair) {
        this.hair = hair;
    }
    
    // O retorno do método será sobrescrito
    // Method return will be overwritten
    
    @Override
    public String toString() {
        return "\n -- Attributes --\n eyes: "+eyes+"\n nose: "+this.nose+"\n mouth"+getBoca()+"\n hair:"+this.getCabelo()+"\n";
    }
}