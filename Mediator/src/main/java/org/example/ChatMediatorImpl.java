package org.example;

import java.util.ArrayList;
import java.util.List;

// Concrete mediator
public class ChatMediatorImpl implements ChatMediator{
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }
    @Override
    public void sendMessage(User user, String message) {
        for (User u : users) {
            // Broadcasting the message to all users except the sender
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
    public void addUser(User user) {
        users.add(user);
    }
}
