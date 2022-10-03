
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle();

        System.out.println("Sending the value 10.0" + "to the setLength method.");

        box.setLength(10.0);
        box.setWidth(20.478);

        System.out.println("The Box Length is " + box.getLength());
        System.out.println("The Box Width is " + box.getWidth());
        System.out.println("Area is " + box.getArea());
    }
}

class Rectangle {

    // attribute
    private double length;
    private double width;

    // Method
    public void setLength(double len) {
        length = len;
    }

    public void setWidth(double w) {
        width = w;
    }

    // Method for Get length and Width
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}