package me.dio.creditapplicationsystem.dto

import me.dio.creditapplicationsystem.Customer
import me.dio.creditapplicationsystem.entity.Address
import java.math.BigDecimal

class CustomerDto(
    val firstName: String,
    val lastName: String,
    val cpf: String,
    val income: BigDecimal,
    val email: String,
    val password: String,
    val zipCode: String,
    val street: String
) {


    fun toEntity(): Customer = Customer(
        firstName = this.firstName,
        lastName = this.lastName,
        cpf = this.cpf,
        email = this.email,
        password = this.password,
        address = Address()
            (zipCode = this.zipCode,
            street = this.street)
        return customer
    )
}

