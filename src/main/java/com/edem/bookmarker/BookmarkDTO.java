package com.edem.bookmarker;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Setter
@Getter
public class BookmarkDTO {
    private List<Bookmark> data;
    private int totalElements;
    private int totalPages;
    private int currentPage;
    private boolean isFirst;
    private boolean isLast;
    private boolean hasPrevious;
    private boolean hasNext;

    public BookmarkDTO(Page<Bookmark> bookmarkPage){
        this.setData(bookmarkPage.getContent());
        this.setTotalElements(bookmarkPage.getNumberOfElements());
        this.setTotalPages(bookmarkPage.getTotalPages());
        this.setCurrentPage(bookmarkPage.getNumber());
        this.setFirst(bookmarkPage.isFirst());
        this.setLast(bookmarkPage.isLast());
        this.setHasNext(bookmarkPage.hasNext());
        this.setHasPrevious(bookmarkPage.hasPrevious());
    }
}