import java.util.ArrayList;

public class GradeDistribution {
    private ArrayList<Point> points;

    public GradeDistribution() {
        this.points = new ArrayList<Point>();
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public void printAverage() {
        double sum = 0;
        for (Point point : points) {
            sum += point.getPoint();
        }
        System.out.println("Point average (all): " + sum/points.size()*1.0);
    }

    public void printAverageOfPassing() {
        double sumOfPassing = 0;
        int numberOfPassing = 0;
        for (Point point : points) {
            if (point.isPassing()) {
                sumOfPassing += point.getPoint();
                numberOfPassing++;
            }
        }

        if (numberOfPassing > 0) {
            double averageOfPassing = 1.0 * sumOfPassing / numberOfPassing;
            double passPercentage = 100.0 * numberOfPassing / points.size();
            System.out.println("Points average (passing): " + averageOfPassing);
            System.out.println("Pass percentage: " + passPercentage);
        } else {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        }
    }


    public void printGradeDistribution() {
        System.out.print("5: ");
        for (Point point : points) {
            if (point.getPoint() >= 90){
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("4: ");
        for (Point point : points) {
            if (point.getPoint() < 90 && point.getPoint() >= 80){
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("3: ");
        for (Point point : points) {
            if (point.getPoint() < 80 && point.getPoint() >= 70){
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("2: ");
        for (Point point : points) {
            if (point.getPoint() < 70 && point.getPoint() >= 60){
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("1: ");
        for (Point point : points) {
            if (point.getPoint() < 60 && point.getPoint() >= 50){
                System.out.print("*");
            }
        }
        System.out.println();

        System.out.print("0: ");
        for (Point point : points) {
            if (point.getPoint() < 50){
                System.out.print("*");
            }
        }
        System.out.println();

    }


}
