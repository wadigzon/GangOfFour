package org.example;

/*
3.Abstract Factory Pattern:
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 */

public class Main {
    public static void main(String[] args) {
        // Using the Windows factory to create Windows components
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        windowsButton.paint();

        // Using the MacOS factory to create MacOS components
        GUIFactory macosFactory = new MacOSFactory();
        Button macosButton = macosFactory.createButton();
        macosButton.paint();
    }
}