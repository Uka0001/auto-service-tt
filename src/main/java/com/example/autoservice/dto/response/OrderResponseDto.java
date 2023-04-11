package com.example.autoservice.dto.response;

import com.example.autoservice.model.Car;
import com.example.autoservice.model.Good;
import com.example.autoservice.model.Master;
import com.example.autoservice.model.OrderStatus;
import com.example.autoservice.model.Service;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderResponseDto {
    private Long id;
    private Long carId;
    private Long masterId;
    private String description;
    private LocalDate dateOfAdoption;
    private List<Long> serviceIdList;
    private List<Long> goodsIdList;
    private OrderStatus status;
    private BigDecimal totalCost;
    private LocalDate completionDate;
}
