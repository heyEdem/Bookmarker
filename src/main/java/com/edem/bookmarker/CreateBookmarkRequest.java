package com.edem.bookmarker;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookmarkRequest {
    @NotEmpty(message = "Title cannot be empty")
    private String title;
    @NotEmpty(message = "Url cannot be empty")
    private String url;
}
