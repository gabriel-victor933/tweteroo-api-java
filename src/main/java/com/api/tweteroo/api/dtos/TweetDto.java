package com.api.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TweetDto {
    @NotNull
    private Long userId;
    @NotBlank
    @Size(max=280, message = "Tweet too long!")
    private String tweet;
}
