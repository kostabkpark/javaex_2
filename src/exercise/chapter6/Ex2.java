package exercise.chapter6;

public class Ex2 {
  public static void main(String[] args) {
    Point p = new Point(3,5);
    System.out.println(p);

    MovablePoint mp = new MovablePoint(4,10,10,20);
    System.out.println(mp);
  }
}

class Point {
  private int x,y;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Point(" +
        "x=" + x +
        ", y=" + y +
        ')';
  }
}

class MovablePoint extends Point {
  private int xSpeed, ySpeed;

  public int getxSpeed() {
    return xSpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  @Override
  public String toString() {
    return super.toString() + ", MovablePoint(" +
        "xSpeed=" + xSpeed +
        ", ySpeed=" + ySpeed +
        ')';
  }
}