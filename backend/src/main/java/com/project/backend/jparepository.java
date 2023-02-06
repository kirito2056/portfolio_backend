package com.project.backend;

import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jparepository extends JpaRepository<Order, Long> {

}
