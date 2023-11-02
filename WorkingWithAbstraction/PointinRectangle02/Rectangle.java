package WorkingWithAbstraction.PointinRectangle02;

import WorkingWithAbstraction.PointinRectangle02.Point;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }


    public boolean Contains(Point point) {
        return point.getCoordinatesX() >= bottomLeft.getCoordinatesX() && point.getCoordinatesX() <= topRight.getCoordinatesX()
                && point.getCoordinatesY() >= bottomLeft.getCoordinatesY() && point.getCoordinatesY() <= topRight.getCoordinatesY();
    }
}
