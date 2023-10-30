package me.dio.creditapplicationsystem.service

import me.dio.creditapplicationsystem.Customer
import me.dio.creditapplicationsystem.entity.Credit
import java.util.UUID


interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(id:Long): Customer
    fun delete(id:Long)
}