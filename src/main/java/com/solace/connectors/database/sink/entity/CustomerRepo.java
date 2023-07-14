package com.solace.connectors.database.sink.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, BigDecimal> {

}