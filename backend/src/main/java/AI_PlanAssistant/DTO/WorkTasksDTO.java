package AI_PlanAssistant.DTO;

import java.util.ArrayList;
import java.util.List;

public class WorkTasksDTO {
    private List<WorkTaskDTO> tasks;


    public WorkTasksDTO() {
        this.tasks = new ArrayList<>();
    }

    public WorkTasksDTO(List<WorkTaskDTO> tasks) {
        this.tasks = tasks;
    }

    public List<WorkTaskDTO> getTasks() {
        return tasks;
    }

}
