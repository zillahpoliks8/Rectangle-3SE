package rectangledemo;
public class Rectangle {
    //Attributes *
    double length;
    double width;
    //Constructors *
    Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
        System.out.println("First Constructor Loaded");
    }
    Rectangle(double length){
        this.length = length;
        this.width = 0.0;
        System.out.println("Second Constructor Loaded");
    }
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        System.out.println("Third Constructor Loaded");
    }
    //Methods
    //getter of length
    double getLength(){
        return this.length;
    }
    //getter of width
    double getWidth(){
        return this.width;
    }
    //setter of length
    void setLength(double length){
        this.length = length;
    }
    //setter of width
    //procedural method displayArea
    void displayArea(){
        double area = this.length * this.width;
        System.out.println(area);
    }
    //functional method displayArea
    double dispArea(){
        double area = this.length * this.width;
        return area;
    }
    //setter of length
    
}
