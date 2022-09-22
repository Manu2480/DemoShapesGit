package org.example;

public class Square extends Shape {
    private int width = 0;


    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth) {
        if(newWidth>=0)
        this.width = newWidth;
    }

    public int getHeigth(){
        return getWidth();
    }


    public void setHeight(int newHeight){
        setWidth(newHeight);
    }

    // hacemos metodos para conseguir el area y el perimetro de cuadrado y de perimetro

    public double getArea(){
        return getWidth()*getHeigth();  // nos da por que ambos returnan la base
    }

    /* usamos mejor la formula de el rectangula ya que es equivalente y se nos adapta a las dos
    public int getPerimetro(){
        return 4*this.width;
    }
     */

    public double getPerimetro(){     // nos halla el perimetro sea del area o sea del perimetro
        return 2*(getWidth() + getHeigth());
    }
}
