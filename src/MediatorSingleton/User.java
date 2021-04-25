package MediatorSingleton;

public abstract class User {
    protected MessageMediator mediator;
    protected String name;

    public abstract String getName();

    public User(MessageMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    public abstract void send(String message);

    public abstract void setMediator(MessageMediator mediator);

    public abstract void receive(String message);

}
