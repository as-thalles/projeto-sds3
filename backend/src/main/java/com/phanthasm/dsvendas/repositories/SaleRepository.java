package com.phanthasm.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phanthasm.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
