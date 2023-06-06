package com.abahafart.library.service.infra.repository.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tbl_author_book")
public class AuthorBookEntity {

    @Id
    private UUID id;

    @Column(name = "id_book")
    private UUID book;

    @Column(name = "id_author")
    private UUID author;

    @Column(name = "id_status")
    private UUID status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getBook() {
        return book;
    }

    public void setBook(UUID book) {
        this.book = book;
    }

    public UUID getAuthor() {
        return author;
    }

    public void setAuthor(UUID author) {
        this.author = author;
    }

    public UUID getStatus() {
        return status;
    }

    public void setStatus(UUID status) {
        this.status = status;
    }
}
