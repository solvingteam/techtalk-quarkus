package com.example.dto;

import io.quarkus.arc.All;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveUserDTO {

    private String username;
    private String password;

}
