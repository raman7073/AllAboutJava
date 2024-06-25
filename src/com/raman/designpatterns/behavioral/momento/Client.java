package com.raman.designpatterns.behavioral.momento;

import com.raman.designpatterns.behavioral.momento.caretaker.ConfigurationCareTaker;
import com.raman.designpatterns.behavioral.momento.memento.ConfigurationMemento;
import com.raman.designpatterns.behavioral.momento.originator.ConfigurationOriginator;

public class Client {
    /*
      Provides an ability to revert the object to a previous state i.e.
      UNDO capability.
      It has object's history.
      It does not expose the object internal implementation.
      It is also known as snapshot design pattern.

      Originator:
       -> It represents the object, for which state need to be saved and restored.
       -> Expose methods to save and restore its state using Memento Object.
      Memento:
       -> It represents an Object which holds the state of the Originator.
      Caretaker:
      -> Manages list of States (.i.e list of Memento)

     */

    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        //initiate state of the originator
        ConfigurationOriginator originator = new ConfigurationOriginator(5, 19);
        // save it
        ConfigurationMemento snapshot1 = originator.createMemento();
        //add it to history
        careTaker.addMemento(snapshot1);

        // originator changing to new state
        originator.setHeight(6);
        originator.setWeight(29);

        //save it
        ConfigurationMemento snapshot2 = originator.createMemento();

        //  add it to history
        careTaker.addMemento(snapshot2);


        // originator changing to new state
        originator.setHeight(7);
        originator.setWeight(39);

        //undo
        ConfigurationMemento restoredObj = careTaker.undo();
        originator.restoreMemento(restoredObj);

        System.out.println("height: " + originator.height + " weight: " + originator.weight);
    }
}
