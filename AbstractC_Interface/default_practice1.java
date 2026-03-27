package AbstractC_Interface;

// PRACTICE - DEFAULT METHOD ----------
interface Logger {
    void log(String message);

    default void logWithTimestamp(String message) {
        System.out.println("[LOG] " + message);
    }
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Printing to console! " + message);
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Writing to file: " + message);
    }

    @Override
    public void logWithTimestamp(String message) {
        System.out.println("[FILE - LOG] " + message);
    }

}
public class default_practice1 {
    public static void main(String[] main) {
        Logger l1 = new ConsoleLogger();
        Logger l2 = new FileLogger();

        l1.log("Hey, it is me, Vaibhav");
        l2.log("Hey, it is me, Vaibhav");

        l1.logWithTimestamp("Console log");
        l2.logWithTimestamp("File log");
    }
}
