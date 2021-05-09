package com.example.rma_lv4.data.repository

import com.example.rma_lv4.data.api.ApiHelper
import com.example.rma_lv4.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
         return apiHelper.getUsers()
    }
}