package AI_PlanAssistant.openAI;

import org.springframework.stereotype.Component;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
@Component
public class OpenAiClient {
    private final String apiUrl = "";
    private final String apiKey = "";
    private final String openAiModel = "";

    public String askAi(String prompt){
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization", "Bearer " + apiKey);
            con.setRequestProperty("Content-Type", "application/json");

            String body = "{\"model\": \"" + openAiModel + "\"," +
                    " \"messages\": [{\"role\": \"user\"," +
                    " \"content\": \"" + prompt + "\"}]}";

            con.setDoOutput(true);

            try (OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream(),
                    StandardCharsets.UTF_8)){
                writer.write(body);
                writer.flush();
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()))){
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null){
                    response.append(line);
                }
                System.out.println(response);
                return response.toString();
            }

        } catch (IOException e){
            throw new RuntimeException("Error communicating with OpenAI API", e);
        }

    }
}
