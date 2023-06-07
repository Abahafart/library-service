package com.abahafart.library.service.infra.repository;

import com.abahafart.library.service.infra.repository.entity.StatusEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface StatusRepository extends ReactiveCrudRepository<StatusEntity, UUID> {

    @Query("SELECT CT.ID, CT.DESCRIPTION, CT.TYPE, CT.CREATED_DATE FROM library.cat_status CT WHERE CT.ID = ?")
    Mono<StatusEntity> findById(UUID id);
}
