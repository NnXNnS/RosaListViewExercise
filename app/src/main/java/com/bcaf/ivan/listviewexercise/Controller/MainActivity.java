package com.bcaf.ivan.listviewexercise.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.bcaf.ivan.listviewexercise.Adapter.ContactRVAdapter;
import com.bcaf.ivan.listviewexercise.Entity.Response;
import com.bcaf.ivan.listviewexercise.R;
import com.bcaf.ivan.listviewexercise.Util.ContactUtil;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_contact;
    ContactUtil util;
    ContactRVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_contact = findViewById(R.id.rv_contact);
        rv_contact.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        rv_contact.setLayoutManager(manager);

        util = new ContactUtil();

        util.getContact().getContact().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Response responses = response.body();

                if (responses != null) {
                    adapter = new ContactRVAdapter(responses.getContacts());
                    adapter.notifyDataSetChanged();
                    rv_contact.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}