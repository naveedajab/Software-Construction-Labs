/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author fa16-bse-081
 */
public class Circle {
    protected double radius=1.0;
    protected String colour="red";
    
    public Circle(){
        radius=1.0;
        colour="red";
        
    }
    public Circle(double r){
        radius=r;
}
    public double getRadius(){
        return radius;
    }
    public String getColour(){
     return colour;   
    }
    public double getArea(){
        return 2*3.14*radius;
}
    public void setRadius(double r){
        radius=r;
    }
    public void setColour(String c){
        colour=c;
    }
    public void display(){
        System.out.println("Colour:"+colour);
        System.out.println("Raduis:"+radius);
        System.out.println("Area:"+getArea());
    }
    public static void main(String args[]){
        Circle c=new Circle();
        c.setColour("blue");
        c.setRadius(3.0);
        c.display();
    }
}
