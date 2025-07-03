package AI_PlanAssistant.model;



import java.util.ArrayList;
import java.util.List;

public class WorkTasks {
    private List<WorkTask> tasks;

    public WorkTasks() {
        this.tasks = new ArrayList<>();
    }

    public WorkTasks(List<WorkTask> tasks) {
        this.tasks = tasks;
    }

    public List<WorkTask> getTasks() {
        return tasks;
    }
}
