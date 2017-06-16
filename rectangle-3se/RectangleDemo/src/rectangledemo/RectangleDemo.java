package rectangledemo;
public class RectangleDemo {

    public static void main(String[] args) {
        //Class Instantiation
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(8.8);
        Rectangle r3 = new Rectangle(3.2,2.1);
        
        r1.displayArea();
        double area = r1.dispArea();
        System.out.println(area);
    }
}
