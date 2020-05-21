package ToDoListAndTasks;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> task = new ArrayList<>();
    private String name;


    public ToDoList(List<Task> task, String name) {
        this.task = task;
        this.name = name;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
