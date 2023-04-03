package com.example.androidviikko9;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder{
    TextView name, email, degreeProgram;

    public UserViewHolder(@NonNull View itemView){
        super(itemView);
        name = itemView.findViewById(R.id.StudentName);
        email = itemView.findViewById(R.id.StudentEmail);
        degreeProgram = itemView.findViewById(R.id.ProgramDegree);
    }

}
