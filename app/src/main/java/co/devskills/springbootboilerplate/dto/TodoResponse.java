package co.devskills.springbootboilerplate.dto;
import java.time.LocalDateTime;
import lombok.Builder;

@Builder
public record TodoResponse(
        Long id,
        String name,
        String description,
        ActionStatus status,
        LocalDateTime createdAt
) {}