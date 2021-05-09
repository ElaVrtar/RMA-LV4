package com.example.rma_lv4.data.api

class ApiHelper(private  val apiService: ApiService) {

    fun getUsers()= apiService.getUsers()
}