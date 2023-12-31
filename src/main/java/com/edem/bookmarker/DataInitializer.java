package com.edem.bookmarker;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
//        bookmarkRepository.save(new Bookmark(null, "twitter","https://twitter.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "snapchat","https://snapchat.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "google","https://google.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "facebook","https://facebook.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "telegram","https://telegram.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "gmail","https://gmail.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "instagram","https://instagram.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "pinterest","https://pinterest.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "fabian","https://fabian.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "steven","https://steven.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "slightly","https://slightly.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "dan","https://dan.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "harvey","https://harvey.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "mike","https://nike.com", Instant.now()));
//        bookmarkRepository.save(new Bookmark(null, "randell","https://randell.com", Instant.now()));
    }
}
