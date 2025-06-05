package dev.langchain4j.example.aiservice;

import dev.langchain4j.agent.tool.Tool;
import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class AssistantTools {

    /**
     * This tool is available to {@link Assistant}
     */
    @Tool
    @Observed
    public String currentTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyymmdd-HHmmss");
        return LocalDateTime.now().format(formatter);
    }
}
