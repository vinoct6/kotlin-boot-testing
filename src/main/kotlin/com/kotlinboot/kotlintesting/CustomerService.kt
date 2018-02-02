package com.kotlinboot.kotlintesting

interface CustomerService {
    fun getCustomer(id: Int): Customer?
    fun getAllCustomers(): List<Customer>
}