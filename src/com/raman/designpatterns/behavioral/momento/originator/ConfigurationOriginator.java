package com.raman.designpatterns.behavioral.momento.originator;

import com.raman.designpatterns.behavioral.momento.memento.ConfigurationMemento;

public class ConfigurationOriginator {
    public int height;
    public int weight;

    public ConfigurationOriginator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ConfigurationMemento createMemento() {
        return new ConfigurationMemento(this.height, this.weight);
    }

    public void restoreMemento(ConfigurationMemento mementoToBeRestored) {
        this.height = mementoToBeRestored.height;
        this.weight = mementoToBeRestored.weight;


    }
}
