package com.studentschedulleapp.androidclient.data.api.retrofit
import com.studentschedulleapp.androidclient.data.api.API
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object GatewayRetrofitClient {
    private var retrofit: Retrofit? = null

    fun getInstance(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(API.GATEWAY_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
}