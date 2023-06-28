package gr.aueb.cf.ch11;

/**
 * Immutable 3d Point.
 */
public class Point3d {
    private final Point point;
    private final int z;

    public Point3d(){
        point = new Point();
        z = 0;
    }

    public Point3d(Point point, int z){
        this.point = new Point(point.getX(), point.getY());
    }

    public Point getPoint() {
        return new Point(this.point.getX(), this.point.getY());
    }

    public int getZ() {
        return z;
    }
}
