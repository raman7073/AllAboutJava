package com.raman.designpatterns.structural.flyweight.robot.issue;

public class Robot {
    int coordinateX;
    int coordinateY;

    String type;
    Sprites body;// small 2d bitmap graphic element
    // heavy object
    public Robot(int coordinateX, int coordinateY, String type, Sprites body) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
        this.body = body;
    }
    // getters and setters
}
