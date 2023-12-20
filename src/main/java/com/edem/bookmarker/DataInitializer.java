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
        bookmarkRepository.save(new Bookmark(null, "twitter","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "snapchat","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "google","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "facebook","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "telegram","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "gmail","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "instagram","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "pinterest","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "fabian","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "steven","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "slightly","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "dan","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "harvey","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "mike","http://twitter.com", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "randell","http://twitter.com", Instant.now()));
    }
}
