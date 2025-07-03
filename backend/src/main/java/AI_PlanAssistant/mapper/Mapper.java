package AI_PlanAssistant.mapper;

import AI_PlanAssistant.DTO.WorkTaskDTO;
import AI_PlanAssistant.DTO.WorkTasksDTO;
import AI_PlanAssistant.model.*;

import java.time.LocalDate;
import java.util.List;

public class Mapper {

    public static WorkTaskDTO toDTO(WorkTask workTask){
        if (workTask == null) return null;

        return new WorkTaskDTO(
                workTask.getTaskType().getDisplayName(),
                workTask.getDuration().getDisplayName(),
                workTask.getDeadline().toString(),
                workTask.getPriority().getDisplayName()
        );
    }

    public static WorkTask toModel(WorkTaskDTO workTaskDTO){
        if (workTaskDTO == null) return null;

        return new WorkTask(
                TaskType.fromDisplayName(workTaskDTO.getTaskType()),
                Duration.fromDisplayName(workTaskDTO.getDuration()),
                LocalDate.parse(workTaskDTO.getDeadline()),
                Priority.fromDisplayName(workTaskDTO.getPriority())
        );
    }

    public static WorkTasksDTO toDTO(WorkTasks tasks){
        if (tasks == null) return null;

        List<WorkTaskDTO> taskDTOS = tasks.getTasks().stream()
                .map(Mapper::toDTO).toList();
        return new WorkTasksDTO(taskDTOS);
    }

    public static WorkTasks toModel(WorkTasksDTO taskDTOS){
        if (taskDTOS == null) return null;

        List<WorkTask> tasks = taskDTOS.getTasks().stream()
                .map(Mapper::toModel).toList();

        return new WorkTasks(tasks);
    }
}
