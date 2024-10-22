import pack.*;

/**
 * The Main class contains the main method to demonstrate the usage
 * of message decorators to format text.
 */
public class Main {
    public static void main(String[] args) {
        // Create the initial message
        Message message = new TextMessage("Форматований текст");

        // Output the original message
        System.out.println(message.getContent());

        // Add color formatting and output the result
        message = new ColorMessageDecorator(message, "red");
        System.out.println(message.getContent());

        // Add font name formatting and output the result
        message = new FontNameMessageDecorator(message, "Times New Roman");
        System.out.println(message.getContent());

        // Add font size formatting and output the result
        message = new FontSizeMessageDecorator(message, 24);
        System.out.println(message.getContent());
    }
}
