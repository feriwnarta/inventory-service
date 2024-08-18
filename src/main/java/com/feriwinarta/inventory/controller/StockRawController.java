package com.feriwinarta.inventory.controller;

import com.feriwinarta.inventory.model.CreateStockRawRequest;
import com.feriwinarta.inventory.model.CreateStockRawResponse;
import com.feriwinarta.inventory.model.WebResponse;
import com.feriwinarta.inventory.service.StockRawService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StockRawController {
    private final StockRawService stockRawService;

    @PostMapping(
            value = "stocks/raws",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.CREATED)
    WebResponse<CreateStockRawResponse> create(@Valid @RequestBody CreateStockRawRequest request) {
        return WebResponse.<CreateStockRawResponse>builder().data(stockRawService.create(request)).build();
    }
}
