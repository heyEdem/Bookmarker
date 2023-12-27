package com.edem.bookmarker.api;

import com.edem.bookmarker.Bookmark;
import com.edem.bookmarker.BookmarkRepository;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
//@TestPropertySource(properties = {
//        "spring.datasource.url=jdbc:tc:postgresql:14-alpine:///postgres"
//})
class BookmarkControllerTest {
    @Autowired
    private MockMvc mvc;
    private List<Bookmark> bookmarks;


    @Autowired
    private BookmarkRepository repository;
    @BeforeEach
    void setUp(){
        repository.deleteAllInBatch();

        bookmarks = new ArrayList<>();
        bookmarks.add(new Bookmark(null, "twitter","https://twitter.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "snapchat","https://snapchat.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "google","https://google.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "facebook","https://facebook.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "telegram","https://telegram.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "gmail","https://gmail.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "instagram","https://instagram.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "pinterest","https://pinterest.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "fabian","https://fabian.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "steven","https://steven.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "slightly","https://slightly.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "dan","https://dan.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "harvey","https://harvey.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "mike","https://nike.com", Instant.now()));
        bookmarks.add(new Bookmark(null, "randell","https://randell.com", Instant.now()));
        repository.saveAll(bookmarks);
    }

    @ParameterizedTest
    @CsvSource({
            "1,15,2,1,true,false,true,false",
            "2,15,2,2,false,true,false,true"
    })
    void shouldGetBookmarks(int pageNo, int totalElements, int totalPages, int currentPage,
                               boolean isFirst, boolean isLast,
                               boolean hasNext, boolean hasPrevious) throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/bookmarks?page="+pageNo))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.totalElements", CoreMatchers.equalTo(totalElements)))
                .andExpect(jsonPath("$.totalPages",CoreMatchers.equalTo(totalPages)))
                .andExpect(jsonPath("$.currentPage",CoreMatchers.equalTo(currentPage)))
                .andExpect(jsonPath("$.isFirst", CoreMatchers.equalTo(isFirst)))
                .andExpect(jsonPath("$.isLast",CoreMatchers.equalTo(isLast)))
                .andExpect(jsonPath("$.hasNext",CoreMatchers.equalTo(hasNext)))
                .andExpect(jsonPath("$.hasPrevious",CoreMatchers.equalTo(hasPrevious)));

    }

}