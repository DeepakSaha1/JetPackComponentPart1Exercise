package com.example.jetpackcomponentpart1exercise;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.jetpackcomponentpart1exercise.databinding.RecyclerItemBinding;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
    private List<UserModel> userModels;
    private LayoutInflater layoutInflater;

    public UserAdapter(List<UserModel> models) {
        userModels = models;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        retrieving a standard LayoutInflater instance
        if(layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        RecyclerItemBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.recycler_item, viewGroup, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int pos) {
//        binding data to the view using data binding
        myViewHolder.binding.setUser(userModels.get(pos));
    }

    @Override
    public int getItemCount() {
        return userModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final RecyclerItemBinding binding;
        public MyViewHolder(final RecyclerItemBinding itemBinding) {
//            getRoot(): root View that this Binding is associated with
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }
    }
}
