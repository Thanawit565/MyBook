package com.example.mybook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.imageViewholder> {

    Context context;
    ArrayList<Book>imagesArraylist;

    public MyAdapter(Context context, ArrayList<Book> imagesArraylist) {
        this.context = context;
        this.imagesArraylist = imagesArraylist;
    }

    @NonNull
    @Override
    public imageViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.book_layout,parent,false);
        return new imageViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull imageViewholder holder, int position) {
        Book bookimage=imagesArraylist.get(position);
        holder.booktitle.setText(bookimage.getTitle());

        String url;
        url=bookimage.getImage();
        Picasso.get().load(url).into(holder.bookimage);

    }

    @Override
    public int getItemCount() {
        return imagesArraylist.size();
    }

    public class imageViewholder extends RecyclerView.ViewHolder{

    ImageView bookimage;
    TextView booktitle;
    public imageViewholder(@NonNull View itemView) {
        super(itemView);

        bookimage = itemView.findViewById(R.id.bookimage);
        booktitle = itemView.findViewById(R.id.booktitle);

    }
}
}
