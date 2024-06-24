package com.raman.designpatterns.structural.flyweight.robot.solution;

import com.raman.designpatterns.structural.flyweight.robot.issue.Sprites;

public class RoboticDog implements Robot {
    private String type;
    private Sprites body;

    public RoboticDog(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x, int y) {

    }
}
