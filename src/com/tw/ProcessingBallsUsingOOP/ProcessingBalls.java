package com.tw.ProcessingBallsUsingOOP;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class ProcessingBalls extends PApplet {

    private int DIAMETER = 50;
    private final int WIDTH = 640;
    private final int HEIGHT = 480;
    private int NUMBER_OF_BALLS = 4;
    List<FourBalls> ball = new ArrayList<FourBalls>();

    public static void main(String[] args) {
        PApplet.main("com.tw.ProcessingBallsUsingOOP.ProcessingBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        FourBalls.diameter = DIAMETER;
        FourBalls.HEIGHT = HEIGHT;
        for (int i = 1; i <= NUMBER_OF_BALLS; i++)
            ball.add(new FourBalls(i));

    }

    @Override
    public void draw() {
        drawAndMoveBalls(ball.get(0));
        drawAndMoveBalls(ball.get(1));
        drawAndMoveBalls(ball.get(2));
        drawAndMoveBalls(ball.get(3));
    }

    private void drawAndMoveBalls(FourBalls b) {
        ellipse(b.getPositionX(), b.getPositionY(), FourBalls.diameter, FourBalls.diameter);

    }

}

