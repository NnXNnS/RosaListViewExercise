package com.bcaf.ivan.listviewexercise;

import com.bcaf.ivan.listviewexercise.Entity.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ContactService {
    @GET ("contacts/")
    public Call<Response> getContact();
}
