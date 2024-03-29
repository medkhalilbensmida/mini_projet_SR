import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TaskServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("TaskList", new TaskListImpl());
            System.out.println("Serveur de tâches prêt");
        } catch (Exception e) {
            System.err.println("Exception du serveur :" + e.toString());
        }
    }
}