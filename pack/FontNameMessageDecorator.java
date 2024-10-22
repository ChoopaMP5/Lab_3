package pack;

/**
 * The FontNameMessageDecorator class is a concrete decorator that adds
 * font name functionality to a message.
 */
public class FontNameMessageDecorator extends MessageDecorator {
    private String fontName;

    /**
     * Constructor that accepts a Message object and a font name to decorate the message.
     *
     * @param message the message to be decorated.
     * @param fontName the font name to apply to the message.
     */
    public FontNameMessageDecorator(Message message, String fontName) {
        super(message);
        this.fontName = fontName;
    }

    /**
     * Retrieves the content of the decorated message, including the font name.
     *
     * @return the content of the message with font name information.
     */
    @Override
    public String getContent() {
        return super.getContent() + ", font: " + fontName;
    }
}
