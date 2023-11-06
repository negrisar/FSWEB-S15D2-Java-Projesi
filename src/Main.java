import SetChallenge.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        TaskData taskData = new TaskData();

        Task gorev = new Task("Proje 1", "Tasarımı olustur.", "ann", Priority.HIGH, Status.ASSIGNED);
        Task gorev1 = new Task("Proje 1a", "Tasarımı çiz..", "ann", Priority.HIGH, Status.ASSIGNED);
        Task gorev2 = new Task("Proje 1", "Kodları yaz.", "bob", Priority.MED, Status.IN_PROGRESS);
        Task gorev3 = new Task("Proje 1", "Test kodlarını yaz.", "carol", Priority.LOW, Status.IN_PROGRESS);

        taskData.getTasks("ann").add(gorev);
        taskData.getTasks("ann").add(gorev1);
        taskData.getTasks("bob").add(gorev2);
        taskData.getTasks("carol").add(gorev3);

        Set<Task> annTasks = taskData.getTasks("ann");
        for (Task task: annTasks) {
            System.out.println("Ann Görevleri: " + task.getDescription());
        }

        Set<Task> allTasks = taskData.getTasks("all");
        for (Task task : allTasks) {
            System.out.println("Kim Yapıyor: " + task.getAssignee() + " - Açıklama: " + task.getDescription());
        }
    }
}