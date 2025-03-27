package com.azhar.saga.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azhar.saga.order.entity.PurchaseOrder;

public interface OrderRepository extends JpaRepository<PurchaseOrder, Integer> {

}
