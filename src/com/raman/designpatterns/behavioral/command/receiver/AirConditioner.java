package com.raman.designpatterns.behavioral.command.receiver;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAc() {
        isOn = true;
        System.out.println("Ac is on");
    }

    public void turnOffAc() {
        isOn = false;
        System.out.println("Ac is off");
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Temperature changed to:" + temp);
    }
}
