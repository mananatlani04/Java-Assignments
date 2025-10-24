/*10. Real-Time Logging
While writing logs to a file, the file system becomes read-only.
What exception will occur? -> IOException
How would you handle it? -> Backup logs to console or database
*/

import java.io.FileWriter;
import java.io.IOException;

class Logger {
    private String logMessage;

    public Logger(String logMessage) {
        this.logMessage = logMessage;
    }

    public void writeLog() {
        try
        {
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write(logMessage + "\n");
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("---------------------------------------------------------");
            System.out.println("File system is read-only | Logging redirected to console");
            System.out.println("LOG: " + logMessage);
            e.printStackTrace();
        }
    }
}

class Testmain {
    public static void main(String[] args) {
        Logger obj1 = new Logger("System started successfully.");
        Logger obj2 = new Logger("Error: Unable to access configuration file.");
        obj1.writeLog();
        obj2.writeLog();
    }
}