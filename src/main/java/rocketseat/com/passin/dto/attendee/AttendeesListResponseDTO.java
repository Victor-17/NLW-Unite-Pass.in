package rocketseat.com.passin.dto.attendee;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public record AttendeesListResponseDTO(List<AttendeeDetails> attendees) {
}
