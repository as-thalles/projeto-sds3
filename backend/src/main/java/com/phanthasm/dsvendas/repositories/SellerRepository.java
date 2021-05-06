package com.phanthasm.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phanthasm.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
