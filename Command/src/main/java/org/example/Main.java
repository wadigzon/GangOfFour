package org.example;
/*
14. **Command Pattern:** Encapsulates a request as an object, thereby allowing for parameterization of clients with
different requests, queuing of requests, and logging of the parameters.
* */
public class Main {
    public static void main(String[] args) {
        // Create instances
        Light light = new Light(); // receives the action
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Set up invoker
        RemoteControl remote = new RemoteControl();

        // Press the button to turn on the light
        remote.setCommand(lightOn);
        remote.pressButton();

        // Press the button to turn off the light
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}