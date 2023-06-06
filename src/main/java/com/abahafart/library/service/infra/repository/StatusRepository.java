package com.abahafart.library.service.infra.repository;

import com.abahafart.library.service.infra.repository.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatusRepository extends JpaRepository<StatusEntity, UUID> {
}
