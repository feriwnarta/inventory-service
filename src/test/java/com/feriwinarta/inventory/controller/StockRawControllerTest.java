package com.feriwinarta.inventory.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.feriwinarta.inventory.model.CreateStockRawRequest;
import com.feriwinarta.inventory.repository.StockRawRepository;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import lombok.SneakyThrows;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StockRawControllerTest extends BaseTestContainerPostgres {
    @Autowired
    private StockRawRepository repository;

    @Autowired
    private ObjectMapper mapper;

    @Override
    @BeforeEach
    void setUp() {
        super.setUp();
        repository.deleteAll();
    }

    @Test
    @SneakyThrows
    void givenStockRawData_whenSaved_thenSuccesfullySaved() {
        CreateStockRawRequest request = CreateStockRawRequest.builder()
                .branchId("1")
                .ingredientId("1")
                .avgCost(BigDecimal.ZERO)
                .incomingQty(BigDecimal.ZERO)
                .incomingValue(BigDecimal.ZERO)
                .lastCost(BigDecimal.ZERO)
                .qtyOnHand(BigDecimal.ZERO)
                .minimumCost(BigDecimal.ZERO)
                .inventoryValue(BigDecimal.ZERO)
                .priceDiff(BigDecimal.ZERO)
                .minimumCost(BigDecimal.ZERO)
                .avgCost(BigDecimal.ZERO)
                .lastCost(BigDecimal.ZERO)
                .build();


        RestAssured.given()
                .request()
                .body(mapper.writeValueAsString(request))
                .contentType(ContentType.JSON)
                .post("/library/stock/raws")
                .then()
                .statusCode(201)
                .body("data.ingredientId", Matchers.equalTo("1"));
    }
}
