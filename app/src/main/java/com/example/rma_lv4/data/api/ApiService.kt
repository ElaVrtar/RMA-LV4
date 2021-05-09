package com.example.rma_lv4.data.api
import com.example.rma_lv4.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}