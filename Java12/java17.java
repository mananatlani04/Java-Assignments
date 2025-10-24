/*7. Network Connection
Simulating a server connection failure due to network issues.
What exception will occur? -> Simulated IOException
How would you handle it? -> Use try-catch to retry or show error message
*/

class Network {
    private String serverName;
    private boolean simulateFailure;

    public Network(String serverName, boolean simulateFailure) {
        this.serverName = serverName;
        this.simulateFailure = simulateFailure;
    }

    public void connectToServer() {
        try // Simulated IOException
        {
            if (simulateFailure == true) {
                throw new Exception("Network unreachable");
            }
            System.out.println("Connected to server: " + serverName);
        }
        catch(Exception e)
        {
            System.out.println("---------------------------------------------------------");
            System.out.println("Connection failed | Check network or server name");
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

class Testmain {
    public static void main(String[] args) {
        Network obj1 = new Network("MyServer", true);  // Simulate failure
        Network obj2 = new Network("BackupServer", false); // Simulate success

        obj1.connectToServer();
        System.out.println("-------------------------------------");
        obj2.connectToServer();
    }
}