package com.api.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TweetDto {
    @NotBlank
    private Long userId;
    @NotBlank
    @Size(max=280, message = "Tweet too long!")
    private String tweet;
}
