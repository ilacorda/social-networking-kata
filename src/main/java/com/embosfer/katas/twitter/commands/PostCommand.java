package com.embosfer.katas.twitter.commands;

import com.embosfer.katas.twitter.domain.Message;
import com.embosfer.katas.twitter.domain.User;
import com.embosfer.katas.twitter.out.MessageOutputter;

public class PostCommand implements UserCommand {
    private final User user;
    private final Message message;
    private final MessageOutputter messageOutputter;

    public PostCommand(User user, Message message, MessageOutputter messageOutputter) {
        this.user = user;
        this.message = message;
        this.messageOutputter = messageOutputter;
    }

    @Override
    public void execute() {
        messageOutputter.printOut(String.format("%s -> %s", user.name, message));
    }

    @Override
    public User user() {
        return user;
    }

    public Message message() {
        return message;
    }
}
