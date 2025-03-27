package com.azhar.saga.commons.event;

import java.util.Date;
import java.util.UUID;

import com.azhar.saga.commons.dto.OrderRequestDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class OrderEvent implements Event {

    private UUID eventId=UUID.randomUUID();
    private Date eventDate=new Date();
    private OrderRequestDto orderRequestDto;
    private OrderStatus orderStatus;

    @Override
    public Date getDate() {
        return eventDate;
    }
    @Override
    public UUID getEventId() {
        return eventId;
    }
    public OrderEvent(OrderRequestDto orderRequestDto, OrderStatus orderStatus) {
        this.orderRequestDto = orderRequestDto;
        this.orderStatus = orderStatus;
    }

}
