package com.abahafart.library.service.infra.repository.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tbl_author_book")
public class AuthorBookEntity {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private BookEntity book;

    @ManyToOne
    @JoinColumn(name = "id_author")
    private AuthorEntity author;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private StatusEntity status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }
}
