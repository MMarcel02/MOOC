public class Point {
    private int point; 

    public Point(int value) {
        this.point = value;
    }

    public int getPoint() {
        return point;
    }

    public boolean isPassing() {
        return point>=50;
    }

}
