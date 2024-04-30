package untitled.src.day5;

public class Exercise7_22 {

  static double sumArea(Shape[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i].calcArea();
    }
    return sum;
  }
  public static void main(String[] args) {
    Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
    System.out.println("면적의 합:"+sumArea(arr));
  }
}

abstract class Shape {
  Point p;

  Shape() {
    this(new Point(0,0));
  }

  Shape(Point p) {
    this.p = p;
  }

  abstract double calcArea();

  Point getPosition() {
    return p;
  }

  void setPosition(Point p) {
    this.p = p;
  }
}

class Circle extends Shape {
  double r;

  Circle(double r) {
    this(r, new Point(0,0));
  }

  Circle(double r, Point p) {
    super(p);
    this.r = r;
  }

  @Override
  double calcArea() {
    return r*r*3.14;
  }
}

class Rectangle extends Shape {
  double width;
  double height;

  Rectangle() {
    this(5, 5);
  }

  Rectangle(double width, double height) {
    super(new Point(0,0));
    this.width = width;
    this.height = height;
  }

  @Override
  double calcArea() {
    return (width * height);
  }
}

class Point {
  int x;
  int y;

  Point() {
    this(0,0);
  }

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "["+x+", "+y+"]";
  }
}