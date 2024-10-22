package pack;

/**
 * The TextMessage class implements the Message interface
 * and represents a basic text message.
 */
public class TextMessage implements Message {
    private String content;

    /**
     * Constructor that accepts the content of the message.
     *
     * @param content the text of the message.
     */
    public TextMessage(String content) {
        this.content = content;
    }

    /**
     * Retrieves the content of the text message.
     *
     * @return the content of the message as a string.
     */
    @Override
    public String getContent() {
        return content;
    }
}
