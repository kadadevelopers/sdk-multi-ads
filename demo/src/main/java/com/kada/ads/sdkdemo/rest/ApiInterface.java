package com.kada.ads.sdkdemo.rest;

import com.kada.ads.sdkdemo.callback.CallbackConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ApiInterface {

    String CACHE = "Cache-Control: max-age=0";
    String AGENT = "Data-Agent: Kada";

    @Headers({CACHE, AGENT})
    @GET
    Call<CallbackConfig> getJsonUrl(
            @Url String url
    );

    @Headers({CACHE, AGENT})
    @GET("uc?export=download")
    Call<CallbackConfig> getDriveJsonFileId(
            @Query("id") String id
    );

}