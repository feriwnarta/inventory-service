package com.feriwinarta.inventory.service.impl;

import com.feriwinarta.inventory.entity.StockRaw;
import com.feriwinarta.inventory.model.CreateStockRawRequest;
import com.feriwinarta.inventory.model.CreateStockRawResponse;
import com.feriwinarta.inventory.repository.StockRawRepository;
import com.feriwinarta.inventory.service.StockRawService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockRawServiceImpl implements StockRawService {
    private final StockRawRepository stockRawRepository;

    @Transactional
    @Override
    public CreateStockRawResponse create(CreateStockRawRequest request) {
        StockRaw stockRaw = StockRaw.builder()
                .ingredientId(request.getIngredientId())
                .branchId(request.getBranchId())
                .avgCost(request.getAvgCost())
                .lastCost(request.getLastCost())
                .minimumCost(request.getMinimumCost())
                .incomingQty(request.getIncomingQty())
                .incomingValue(request.getIncomingValue())
                .inventoryValue(request.getInventoryValue())
                .priceDiff(request.getPriceDiff())
                .qtyOnHand(request.getQtyOnHand())
                .build();


        StockRaw stockRawSaved = stockRawRepository.save(stockRaw);

        return CreateStockRawResponse.builder()
                .id(stockRawSaved.getId())
                .ingredientId(stockRawSaved.getIngredientId())
                .qtyOnHand(stockRawSaved.getQtyOnHand())
                .build();
    }
}
