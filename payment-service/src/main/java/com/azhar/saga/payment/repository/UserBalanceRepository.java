package com.azhar.saga.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azhar.saga.payment.entity.UserBalance;

public interface UserBalanceRepository extends JpaRepository<UserBalance, Integer> {

}
