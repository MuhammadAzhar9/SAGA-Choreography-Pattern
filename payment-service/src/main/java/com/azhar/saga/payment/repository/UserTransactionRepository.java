package com.azhar.saga.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azhar.saga.payment.entity.UserTransaction;

public interface UserTransactionRepository extends JpaRepository<UserTransaction, Integer> {

}
