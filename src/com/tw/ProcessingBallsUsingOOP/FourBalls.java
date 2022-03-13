package com.tw.ProcessingBallsUsingOOP;

public class FourBalls {
    public static int diameter;
    private int positionX;
    private int positionY;
    private final int speed;
    public static int HEIGHT;


    public FourBalls(int speed) {
        this.speed = speed;
        this.positionX = 0;
        this.positionY = calculateVerticalPosition();
    }

    public int getPositionX() {
        this.positionX += this.speed;
        return this.positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    private int calculateVerticalPosition() {
        positionY = (HEIGHT) * speed / 5;
        return positionY;
    }

}
