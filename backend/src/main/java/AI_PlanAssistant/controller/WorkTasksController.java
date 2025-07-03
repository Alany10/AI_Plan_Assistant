package AI_PlanAssistant.controller;

import AI_PlanAssistant.DTO.WorkTaskDTO;
import AI_PlanAssistant.DTO.WorkTasksDTO;
import AI_PlanAssistant.service.WorkTasksService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planing")
@CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*")
public class WorkTasksController {
    private final WorkTasksService workTasksService;

    public WorkTasksController(WorkTasksService workTasksService) {
        this.workTasksService = workTasksService;
    }

    @PostMapping
    public ResponseEntity<String> submitWorkTasks(@RequestBody List<WorkTaskDTO> workTaskDTOList) {
        System.out.println(workTaskDTOList.getFirst().getTaskType());
        System.out.println(workTaskDTOList.getFirst().getPriority());
        System.out.println(workTaskDTOList.getFirst().getDuration());
        System.out.println(workTaskDTOList.getFirst().getDeadline());
        String result = workTasksService.processWorkTasks(new WorkTasksDTO(workTaskDTOList)); // du behöver uppdatera din service för lista
        return ResponseEntity.ok(result);
    }
}
