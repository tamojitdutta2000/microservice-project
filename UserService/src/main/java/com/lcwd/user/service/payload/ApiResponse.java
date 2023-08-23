package com.lcwd.user.service.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter //Lombok
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder // we can follow the builder pattern to create object of this class
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;
}
