package com.feriwinarta.inventory.service;

import com.feriwinarta.inventory.model.CreateStockRawRequest;
import com.feriwinarta.inventory.model.CreateStockRawResponse;

public interface StockRawService {
    CreateStockRawResponse create(CreateStockRawRequest request);
}
