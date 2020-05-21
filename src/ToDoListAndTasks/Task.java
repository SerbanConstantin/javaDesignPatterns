package ToDoListAndTasks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    private List<Task> subtask = new ArrayList<>();
    private String description;
    private String titlu;
    private boolean isFinished;
    private Date finishDate;


    public Task(List<Task> subtask, String description, String titlu) {
        this.subtask = subtask;
        this.description = description;
        this.titlu = titlu;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public List<Task> getSubtask() {
        return subtask;
    }

    public void setSubtask(List<Task> subtask) {
        this.subtask = subtask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
}
