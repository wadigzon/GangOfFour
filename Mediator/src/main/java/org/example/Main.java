package org.example;
/*
17. **Mediator Pattern:** Defines an object that centralizes communication between objects in a system. It makes the
system more modular and promotes loose coupling between objects.
* */
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new ChatUser(mediator, "User1");
        User user2 = new ChatUser(mediator, "User2");
        User user3 = new ChatUser(mediator, "User3");

        ((ChatMediatorImpl)mediator).addUser(user1);
        ((ChatMediatorImpl)mediator).addUser(user2);
        ((ChatMediatorImpl)mediator).addUser(user3);

        user1.sendMessage("Hello, everyone!");
    }
}