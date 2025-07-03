package AI_PlanAssistant.DTO;

import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
public class WorkTaskDTO {
    private String taskType;
    private String duration;
    private String deadline;
    private String priority;

    public WorkTaskDTO(String taskType, String duration, String deadline, String priority) {
        this.taskType = taskType;
        this.duration = duration;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String getTaskType() {
        return taskType;
    }

    public String getDuration() {
        return duration;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getPriority() {
        return priority;
    }
}
