package com.raman.designpatterns.behavioral.strategy.with;
/* context class
     This removes duplicate code.
     Now let say any new drive strategy came, then we can
     easily implement that strategy without breaking the existing one.
 */
public class Vehicle {
    private DriveStrategy driveStrategy;
    //for default strategy
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    // we can set strategy at run time
    public void setDriveStrategy(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void  drive(){
        this.driveStrategy.drive();
    }
}
