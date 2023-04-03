package com.example.androidviikko9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder>{

    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<User> users){
        this.context = context;
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getLastName().compareTo(u2.getLastName());
            }
        });
        this.users = new ArrayList<>(users);
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.student_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position){
        User user = users.get(position);
        holder.name.setText(user.getFirstName()+" "+user.getLastName());
        holder.email.setText(user.getEmail());
        holder.degreeProgram.setText(user.getDegreeProgram());

    }

    @Override
    public int getItemCount(){
        return users.size();
    }
}
