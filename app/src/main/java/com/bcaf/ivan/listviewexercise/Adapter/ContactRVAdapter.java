package com.bcaf.ivan.listviewexercise.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bcaf.ivan.listviewexercise.Entity.Contacts;
import com.bcaf.ivan.listviewexercise.R;
import com.bcaf.ivan.listviewexercise.ViewHolder.ContactViewHolder;

import java.util.List;

public class ContactRVAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    List<Contacts> contactsList;

    public ContactRVAdapter(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_contact, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.txt_name.setText(contactsList.get(position).getName());
        holder.txt_email.setText(contactsList.get(position).getEmail());
        holder.txt_phoneNumber.setText(contactsList.get(position).getPhone().getMobile());
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }
}
