package kz.group.reactAndSpring.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OtpCodeRequestDto {
    @NotEmpty(message = "Otp cannot be empty or null")
    private String otpCode;
}