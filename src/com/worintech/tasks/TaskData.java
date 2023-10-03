package com.worintech.tasks;

import java.util.HashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> tasks = new HashSet<>();

    public Set<Task> getTasks(String person) {
        Set<Task> personTasks = new HashSet<>();
        for (Task task : tasks) {
            if (person.equals("all") || task.getAssignee().contains(person)) {
                personTasks.add(task);
            }
        }
        return personTasks;
    }

    public Set<Task> getUnassignedTasks() {
        Set<Task> unassignedTasks = new HashSet<>();
        for (Task task : tasks) {
            if (task.getAssignee().isEmpty()) {
                unassignedTasks.add(task);
            }
        }
        return unassignedTasks;
    }

    public Set<Task> getMultipleTasks() {
        Set<Task> multipleTaks = new HashSet<>();
        for (Task task : tasks) {
            if (task.getAssignee().size() > 1) {
                multipleTaks.add(task);
            }
        }
        return multipleTaks;
    }

    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2) {
        Set<Task> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public Set<Task> getIntersect(Set<Task> set1, Set <Task> set2){
        Set<Task> intertect = new HashSet<>(set1);
        intertect.retainAll(set2);
        return intertect;
    }

    public Set<Task> getDifference(Set <Task> set1, Set <Task> set2){
        Set <Task> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }


}
