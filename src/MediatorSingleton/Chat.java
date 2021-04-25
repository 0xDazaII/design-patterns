package MediatorSingleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

    private List<User> users;
    private ChatBot bot;

    public Chat() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
        user.setMediator(null);
    }

    private void addBot() {
        bot = ChatBot.getInstance();
    }

    @Override
    public void sendMessage(String message, User user) {
        if (bot != null) {
            boolean hasCatMessage = bot.messageControl(message, user, this);
            if (hasCatMessage) {
                sendMessage(user.getName() + " has been removed", null);
                return;
            }
        }

        if (message.equals("addBot")) {
            //System.out.println("Chat bot has been added!");
            addBot();
        }

        for (User chatUser : this.users) {
            if (user != chatUser) {
                chatUser.receive(message);
            }
        }


    }
}
