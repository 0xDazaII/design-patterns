package MediatorSingleton;

public class ChatUser extends User {
    public ChatUser(MessageMediator mediator, String name) {
        super(mediator, name);
        mediator.addUser(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void send(String message) {
        if (mediator != null) {
            System.out.println(this.name + " sends:" + message);
            mediator.sendMessage(message, this);
        }
        else
            System.out.println(this.name + " is no longer in the chat room!");
    }

    @Override
    public void setMediator(MessageMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " received:" + message);

    }

}
