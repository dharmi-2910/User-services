package com.example.userservice.Payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
    public String message;
    public boolean success;
    private HttpStatus status;
}
