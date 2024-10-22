package pack;

/**
 * The FontSizeMessageDecorator class is a concrete decorator that adds
 * font size functionality to a message.
 */
public class FontSizeMessageDecorator extends MessageDecorator {
    private int fontSize;

    /**
     * Constructor that accepts a Message object and a font size to decorate the message.
     *
     * @param message the message to be decorated.
     * @param fontSize the font size to apply to the message.
     */
    public FontSizeMessageDecorator(Message message, int fontSize) {
        super(message);
        this.fontSize = fontSize;
    }

    /**
     * Retrieves the content of the decorated message, including the font size.
     *
     * @return the content of the message with font size information.
     */
    @Override
    public String getContent() {
        return super.getContent() + ", font size: " + fontSize + "px";
    }
}
