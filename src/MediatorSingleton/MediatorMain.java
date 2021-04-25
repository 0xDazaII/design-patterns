package MediatorSingleton;

public class MediatorMain {
    public static void main(String[] args) {

        MessageMediator chat = new Chat();


        User user1 = new ChatUser(chat, "Djoni");
        User user2 = new ChatUser(chat, "Jojo");
        User user3 = new ChatUser(chat, "Leonardo");

        user2.send("Hi guys!");
        user1.send("addBot");
        user3.send("cat");
        user3.send("Test");

    }
}
