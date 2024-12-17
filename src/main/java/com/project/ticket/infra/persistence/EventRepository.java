package com.project.ticket.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Long, EventEntity> {
}
