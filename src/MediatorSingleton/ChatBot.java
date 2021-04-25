package MediatorSingleton;

public class ChatBot {

    private static ChatBot instance;
    //protected Chat chatUser;

    private ChatBot() {
    }

    public static ChatBot getInstance() {

        if(instance == null)
        {
            instance = new ChatBot();
        }
        return instance;
    }

    public void addBot() {
        {
            System.out.println("Chat bot has been added!");

        }
    }
    public boolean messageControl(String message, User user, Chat chat){
        if(message.equals("cat")){
            chat.removeUser(user);
            System.out.println(user.getName() + " has been kicked out of the chat room! ");
            return true;
        }
        return false;
    }

}
