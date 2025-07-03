package AI_PlanAssistant.service;

import AI_PlanAssistant.DTO.WorkTasksDTO;
import AI_PlanAssistant.mapper.Mapper;
import AI_PlanAssistant.model.WorkTask;
import AI_PlanAssistant.model.WorkTasks;
import AI_PlanAssistant.openAI.OpenAiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkTasksService {
    private final OpenAiClient openAiClient;

    @Autowired
    public WorkTasksService(OpenAiClient openAiClient) {
        this.openAiClient = openAiClient;
    }

    public String processWorkTasks(WorkTasksDTO workTasksDTO) { //TODO
        WorkTasks workTasks = Mapper.toModel(workTasksDTO);
        return "hej";
        //return openAiClient.askAi(makePrompt(workTasks));
    }

    private String makePrompt(WorkTasks workTasks){ //TODO
        StringBuilder sb = new StringBuilder();
        sb.append("Här är min lista över arbetsuppgifter. jag vill att du hjälper mig att planera min dag");
        for (WorkTask task: workTasks.getTasks()){
            sb.append("-Type: ").append(task.getTaskType().getDisplayName())
                    .append(", minuter: ").append(task.getDuration().getDisplayName())
                    .append(", deadline: ").append(task.getDeadline().toString())
                    .append(", prioritet: ").append(task.getPriority().getDisplayName());
        }
        sb.append("skapa en optimal planering för dessa uppgifter");
        return sb.toString();
    }
}
