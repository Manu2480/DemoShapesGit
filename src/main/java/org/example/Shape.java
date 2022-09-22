package org.example;
/*
es una clase abstracta por tener un metodo abstracto
 */
public abstract class Shape {

    /*
    private int age = 0;//atributo privado
    //mutador
    public void setAge(int newAge){//recibe nuevo dato
        if(newAge > 0 ) {//verifica si el nuevo dato es positivo
            age = newAge;//si, si lo asigna
        }
    }
    //accesor
    public int getAge(){//retorna y no se le pasa nada por parametro
        return age;
    }

     */

    //se recomienda poner todos los atributos arriba
    private int x = 0;
    private int y = 0;

    //metodos setters and getters
    public int getX() {

        return x;
    }

    public void setX(int newX) {

        this.x = newX;
    }

    public int getY() {

        return y;
    }

    public void setY(int newY) {

        this.y = newY;
    }

    /*
    metodos abstractos, pueden tener entradas, y salidas, pero van sin llaves ya que no
    se define que tienen por dentro
     */
    public abstract double getArea();

    public abstract double getPerimetro();
}
