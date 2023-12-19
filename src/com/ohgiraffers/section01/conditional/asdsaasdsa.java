package com.ohgiraffers.section01.conditional;

import javax.swing.*;
import java.awt.*;

public class asdsaasdsa extends JFrame {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    public asdsaasdsa() {
        setTitle("Sierpinski Triangle");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawSierpinskiTriangle(g, 4, new Point(WIDTH / 2, 50), new Point(50, HEIGHT - 50), new Point(WIDTH - 50, HEIGHT - 50));
    }

    private void drawTriangle(Graphics g, Point p1, Point p2, Point p3, Color color) {
        int[] xPoints = {p1.x, p2.x, p3.x};
        int[] yPoints = {p1.y, p2.y, p3.y};

        g.setColor(color);
        g.fillPolygon(xPoints, yPoints, 3);
    }

    private Point calculateMidpoint(Point p1, Point p2) {
        return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
    }

    private void drawSierpinskiTriangle(Graphics g, int depth, Point p1, Point p2, Point p3) {
        if (depth == 0) {
            drawTriangle(g, p1, p2, p3, getRandomColor());
        } else {
            Point mid1 = calculateMidpoint(p1, p2);
            Point mid2 = calculateMidpoint(p2, p3);
            Point mid3 = calculateMidpoint(p3, p1);

            drawSierpinskiTriangle(g, depth - 1, p1, mid1, mid3);
            drawSierpinskiTriangle(g, depth - 1, mid1, p2, mid2);
            drawSierpinskiTriangle(g, depth - 1, mid3, mid2, p3);
        }
    }

    private Color getRandomColor() {
        float r = (float) Math.random();
        float g = (float) Math.random();
        float b = (float) Math.random();
        return new Color(r, g, b);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new asdsaasdsa());
    }
}