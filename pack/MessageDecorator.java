package pack;

/**
 * The MessageDecorator class is an abstract class that implements
 * the Message interface. It serves as a base class for message decorators
 * that can modify or extend the functionality of the message.
 */
public abstract class MessageDecorator implements Message {
    protected Message message;

    /**
     * Constructor that accepts a Message object to be decorated.
     *
     * @param message the message to be decorated.
     */
    public MessageDecorator(Message message) {
        this.message = message;
    }

    /**
     * Retrieves the content of the decorated message.
     *
     * @return the content of the decorated message.
     */
    @Override
    public String getContent() {
        return message.getContent();
    }
}
