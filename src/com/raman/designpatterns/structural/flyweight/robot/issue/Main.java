package com.raman.designpatterns.structural.flyweight.robot.issue;

public class Main {

    public static void main(String[] args) {
        int x = 0, y = 0;
        for (int i = 0; i < 500000; i++) {
            Sprites humanoidSprite = new Sprites();
            Robot humanRobot = new Robot(x + i, y + i, "HUMANOID", humanoidSprite);
        }

        for (int i = 0; i < 500000; i++) {
            Sprites roboticDogSprite = new Sprites();
            Robot dogRobot = new Robot(x + i, y + i, "ROBOTIC_DOGS", roboticDogSprite);
        }
    }
}
// huge memory consumption , and if you have limited memory ,
// this is a huge problem.