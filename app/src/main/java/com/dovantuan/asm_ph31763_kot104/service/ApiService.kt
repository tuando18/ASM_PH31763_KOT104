package com.dovantuan.asm_ph31763_kot104.service

import com.dovantuan.asm_ph31763_kot104.request.LoginRequest
import com.dovantuan.asm_ph31763_kot104.request.RegisterRequest
import com.dovantuan.asm_ph31763_kot104.response.CategoryResponse
import com.dovantuan.asm_ph31763_kot104.response.ProductResponse
import com.dovantuan.asm_ph31763_kot104.response.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query


interface ApiService {
    @POST("register")
    suspend fun register(@Body registerReq: RegisterRequest): Response?

    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): Response?

    @GET("categories")
    suspend fun getCategories(): List<CategoryResponse>

    @GET("products")
    suspend fun getProducts(@Query("cateID") cateID: String?): List<ProductResponse>
//
    @GET("get-product-by-id/{productID}")
    suspend fun getProductByID(@Path("productID") productID: String?): ProductResponse?



}