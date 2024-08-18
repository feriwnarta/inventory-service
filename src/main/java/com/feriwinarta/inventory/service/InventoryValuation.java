package com.feriwinarta.inventory.service;

import com.feriwinarta.inventory.entity.StockRaw;

import java.math.BigDecimal;

public interface InventoryValuation {
    StockRaw calculateInitialAvgCost(BigDecimal initialStock, BigDecimal initialAvgCost, BigDecimal initialLastCost);

    BigDecimal calculateAvgPrice(BigDecimal inventoryValue, BigDecimal oldQty, BigDecimal oldAvgCost, BigDecimal incomingQty, BigDecimal incomingPrice, Boolean isReduce);
}
