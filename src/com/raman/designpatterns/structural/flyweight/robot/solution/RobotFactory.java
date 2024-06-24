package com.raman.designpatterns.structural.flyweight.robot.solution;

import com.raman.designpatterns.structural.flyweight.robot.issue.Sprites;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    private static Map<String, Robot> robotObjectCache = new HashMap<>();

    public static Robot createRobot(String type) {
        if (robotObjectCache.containsKey(type)) {
            return robotObjectCache.get(type);
        } else {
            if (type == "HUMANOID") {
                Sprites humanoidSprite = new Sprites();
                Robot humanObj = new HumanoidRobot(type, humanoidSprite);
                robotObjectCache.put(type, humanObj);
                return humanObj;
            } else if (type == "ROBOTIC_DOG") {
                Sprites roboticDogSprite = new Sprites();
                Robot robot = new RoboticDog(type, roboticDogSprite);
                robotObjectCache.put(type, robot);
                return robot;
            }
        }
        return null;
    }
}
