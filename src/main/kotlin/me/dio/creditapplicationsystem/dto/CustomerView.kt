package me.dio.creditapplicationsystem.dto

import me.dio.creditapplicationsystem.Customer
import java.math.BigDecimal

data class CustomerView (
    val firstName: String,
    val lastName: String,
    val cpf: String,
    val income: BigDecimal,
    val email: String,
    val password: String,
    val zipCode: String,
    val street: String
) {
    constructor(customer: Customer): this(
        firstName = customer.firstName,
        cpf = customer.cpf,
        income = customer.income,
        email = customer.email,
        zipCode = customer.address.zipCode,
        street = customer.address.street


    )
}
