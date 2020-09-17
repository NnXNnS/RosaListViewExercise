package com.bcaf.ivan.listviewexercise.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bcaf.ivan.listviewexercise.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    public TextView txt_name;
    public TextView txt_email;
    public TextView txt_phoneNumber;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_name = itemView.findViewById(R.id.txt_name);
        txt_email = itemView.findViewById(R.id.txt_email);
        txt_phoneNumber = itemView.findViewById(R.id.txt_phoneNumber);
    }
}
