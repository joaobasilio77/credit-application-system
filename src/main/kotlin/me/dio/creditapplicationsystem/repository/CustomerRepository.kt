package me.dio.creditapplicationsystem.repository

import me.dio.creditapplicationsystem.Customer
import me.dio.creditapplicationsystem.entity.Credit
import org.hibernate.validator.constraints.UUID

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface CustomerRepository:JpaRepository<Customer, Long> {


    }
