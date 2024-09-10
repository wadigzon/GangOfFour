package org.example;

public class ChatUser extends User{
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }
    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sending message: " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
