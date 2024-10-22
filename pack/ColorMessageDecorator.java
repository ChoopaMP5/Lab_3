package pack;

/**
 * The ColorMessageDecorator class is a concrete decorator that adds
 * color functionality to a message.
 */
public class ColorMessageDecorator extends MessageDecorator {
    private String color;

    /**
     * Constructor that accepts a Message object and a color to decorate the message.
     *
     * @param message the message to be decorated.
     * @param color the color to apply to the message.
     */
    public ColorMessageDecorator(Message message, String color) {
        super(message);
        this.color = color;
    }

    /**
     * Retrieves the content of the decorated message, including the color information.
     *
     * @return the content of the message with color information.
     */
    @Override
    public String getContent() {
        return super.getContent() + ", color: " + color;
    }
}
