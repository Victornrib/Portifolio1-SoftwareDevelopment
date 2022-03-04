package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    void testReturnCenterPolygon() {

        Point a = new Point(0,0);
        Point b = new Point(2,4);
        Point c = new Point(4,0);

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(a); points.add(b); points.add(c);

        Polygon poly = new Polygon(points);
        Point expectedCentroid = new Point(2,2);

        assertEquals(expectedCentroid.x, poly.returnCenter().x);
        assertEquals(expectedCentroid.y, poly.returnCenter().y);
    }

}