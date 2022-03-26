package classFolder.session19;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

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

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public double distance(Point point) {

        return Math.sqrt(
              (double)  (point.x - this.x) * (point.x - this.x) +  (point.y - this.y) * (point.y - this.y));
    }

    
}
