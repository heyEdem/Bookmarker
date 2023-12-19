package com.edem.bookmarker;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "bookmarks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bookmark {
    @Id
    @SequenceGenerator(name = " ", sequenceName = "bm_id_sec")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bm_id_sec_gen")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String url;



    private Instant createdAt;
}
