package exercise;

public class Segment {

    private Point beginPoint;
    private Point endPoint;
    public Segment(Point start, Point end) {
        this.beginPoint = start;
        this.endPoint = end;
    }
    public Point getBeginPoint() {
        return beginPoint;
    }
    public Point getEndPoint() {
        return endPoint;
    }
    public Point getMidPoint() {
        int midX = (beginPoint.getX() + endPoint.getX()) / 2;
        int midY = (beginPoint.getY() + endPoint.getY()) / 2;
        return new Point(midX, midY);
    }
}
