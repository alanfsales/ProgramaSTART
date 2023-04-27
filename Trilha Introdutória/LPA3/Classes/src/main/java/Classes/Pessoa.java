package Classes;

public class Pessoa {
    //Tributos
    private float peso;
    private float altura;
    
    //Métodos
    
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }
    public float calcularIMC(){
        float imc = getPeso() / (getAltura() * getAltura());
        return imc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
