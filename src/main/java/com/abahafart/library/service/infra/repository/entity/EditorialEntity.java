package com.abahafart.library.service.infra.repository.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tbl_editorial")
public class EditorialEntity {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private StatusEntity status;

    @Column(name = "name_editorial")
    private String nameEditorial;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public String getNameEditorial() {
        return nameEditorial;
    }

    public void setNameEditorial(String nameEditorial) {
        this.nameEditorial = nameEditorial;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
