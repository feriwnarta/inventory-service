package com.feriwinarta.inventory.repository;

import com.feriwinarta.inventory.entity.StockRaw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRawRepository extends JpaRepository<StockRaw, String> {
}
