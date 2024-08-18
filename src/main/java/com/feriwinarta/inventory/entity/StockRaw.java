package com.feriwinarta.inventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.envers.Audited;

import java.math.BigDecimal;

@Entity
@Audited
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "stock_raws")
@EqualsAndHashCode(callSuper = false)
public class StockRaw extends BaseEntity {
    @Column(unique = true, nullable = false)
    private String ingredientId;
    @Column(nullable = false)
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