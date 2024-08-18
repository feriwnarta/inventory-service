package com.feriwinarta.inventory.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class CreateStockRawResponse {
    private String id;
    private String ingredientId;
    private BigDecimal qtyOnHand;
}
