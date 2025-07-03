package AI_PlanAssistant.model;


import java.time.LocalDate;

public class WorkTask {
    private TaskType taskType;
    private Duration duration;
    private LocalDate deadline;
    private Priority priority;

    public WorkTask(TaskType taskType, Duration duration, LocalDate deadline, Priority priority) {
        this.taskType = taskType;
        this.duration = duration;
        this.deadline = deadline;
        this.priority = priority;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public Duration getDuration() {
        return duration;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public Priority getPriority() {
        return priority;
    }
}
