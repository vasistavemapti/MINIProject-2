interface Interface {
    void getArea(int length, int breadth);
}

// implement the Polygon interface
class rectangle implements Interface {

    // implementation of abstract method
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

class Main {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.getArea(5, 6);
    }
}