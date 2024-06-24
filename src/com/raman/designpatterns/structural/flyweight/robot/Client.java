package com.raman.designpatterns.structural.flyweight.robot;

import com.raman.designpatterns.structural.flyweight.robot.solution.Robot;
import com.raman.designpatterns.structural.flyweight.robot.solution.RobotFactory;

public class Client {
    public static void main(String[] args) {
        Robot humanoid1 = RobotFactory.createRobot("HUMANOID");
        humanoid1.display(1, 2);

        Robot humanoid2 = RobotFactory.createRobot("HUMANOID");
        humanoid2.display(2, 3);

        Robot robotic_dog1 = RobotFactory.createRobot("ROBOTIC_DOG");
        robotic_dog1.display(4, 5);

        Robot robotic_dog2 = RobotFactory.createRobot("ROBOTIC_DOG");
        robotic_dog2.display(5, 6);
    }
}
/*
  Two important interview questions:

  - Design word processor/text editor
  - Design game

  It is one of structural design pattern.
  This Pattern helps to reduce the memory usage by sharing data among multiple Objects.

   when to use :
   -> When memory is limited.
   -> When objects shared data.
        * Intrinsic data : shared among objects and remain same once defined one value.
        * Extrinsic data : changes based on client input and differs from one object to another.
   -> Creation of object is expensive.

   How to solve:
    -> From Object, remove all the Extrinsic data and keep Intrinsic data (this object called flyweight object)
    -> This Flyweight Class can be immutable.
    -> Extrinsic Data can be passed to flyweight class in method parameter.
    -> Once the flyweight object is created , it is Cached and reused whenever required.

 */