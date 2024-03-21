public class RectangleSkeleton {
    int length;
    int width;


    //value constructor
    public RectangleSkeleton(int l, int w) {
        length = l;
        width = w;
    }

    //default constructor
    public RectangleSkeleton() {
        length = 0;
        width = 0;
    }

    //getters (accessors)
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    //setters 
    public void setLength(int l) {
        length = l;
    }

    public void setWidth(int w) {
        width = w;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public boolean isSquare() {
        return length == width;
    }

    public void display() {
        System.out.println("Rectangle: Length = " + length + ", Width = " + width);
    }

    public String toString() {
        String out = "";

        for (int i=0; i<length; i++) {
            for (int j=0; j<width; j++) {
                out += "*";
            }
            out += "\n";
        }

        return out;
    }

    public static int maxRectSize() {
        return 10000;
    }

    public static void main(String[] args) {
        //RectangleSkeleton rect = new RectangleSkeleton();
        //rect.display();

        /*
        RectangleSkeleton rect2 = new RectangleSkeleton(2, 3);
        rect2.display();
        System.out.println(rect2.getLength());
        rect2.setLength(4);
        System.out.println(rect2.getLength());

        System.out.println(rect2);*/

        RectangleSkeleton.maxRectSize();

    }
}
