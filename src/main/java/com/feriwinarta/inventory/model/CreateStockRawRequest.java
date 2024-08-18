package com.feriwinarta.inventory.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class CreateStockRawRequest {
    @NotBlank
    @NotEmpty
    private String ingredientId;
    @NotBlank
    @NotEmpty
    private String branchId;
    private BigDecimal incomingQty;
    private BigDecimal incomingValue;
    private BigDecimal priceDiff;
    private BigDecimal inventoryValue;
    private BigDecimal qtyOnHand;
    private BigDecimal avgCost;
    private BigDecimal lastCost;
    private BigDecimal minimumCost;
}
