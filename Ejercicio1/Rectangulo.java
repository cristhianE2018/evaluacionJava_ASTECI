package Ejercicio1;

public class Rectangulo implements Forma{
    
    public double base;
    public double altura;
    public double area;
    public Rectangulo(){ }
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return this.base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }


    @Override
    public void calcularArea(){
        this.area = this.base * this.altura;
        System.out.println("El area del rectangulo es: " + this.area);
    }

    public void calcularArea(double base, double altura){
        this.area = base * altura;
        System.out.println("El area del rectangulo es: " + this.area);
    }
}
