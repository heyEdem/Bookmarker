package com.edem.bookmarker;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class BookmarkDTO {
    private Long id;

    private String title;

    private String url;

    private Instant createdAt;

    public BookmarkDTO(Long id, String title, String url, Instant createdAt) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.createdAt = createdAt;
    }
}
