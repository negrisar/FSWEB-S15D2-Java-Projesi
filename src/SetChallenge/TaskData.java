package SetChallenge;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

    public TaskData() {
        annsTasks = new HashSet<>();
        bobsTasks = new HashSet<>();
        carolsTasks = new HashSet<>();
    }


    public void addAnnTask(Task task) {
        annsTasks.add(task);
    }

    public void addBobTask(Task task) {
        bobsTasks.add(task);
    }

    public void addCarolTask(Task task) {
        carolsTasks.add(task);
    }


    public Set<Task> getTasks(String person) {
        if (person.equals("ann")) {
            return annsTasks;
        } else if (person.equals("bob")) {
            return bobsTasks;
        } else if (person.equals("carol")) {
            return carolsTasks;
        } else if (person.equals("all")) {
            Set<Task> allTasks = new HashSet<>();
            allTasks.addAll(annsTasks);
            allTasks.addAll(bobsTasks);
            allTasks.addAll(carolsTasks);
            return allTasks;
        } else {

            return null;
        }
    }

    public Set<Task> getUnion(Set<Task>... taskList) {
        Set<Task> totals = new HashSet<>();
        for ( Set<Task> tasks: taskList) {
            totals.addAll(tasks);
        }
        return totals;
    }

    public Set<Task> getIntersect(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public Set<Task> getDifference(Set<Task> set1, Set<Task> set2) {
        Set<Task> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }


}
