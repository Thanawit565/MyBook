package com.example.mybook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
MyAdapter adapter;
ArrayList<Book>imagesArraylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);

        imagesArraylist=new ArrayList<>();
        String url="https://m.media-amazon.com/images/I/81fdQIY6ykL._AC_UF894,1000_QL80_.jpg";
        String url2="https://bci.kinokuniya.com/jsp/images/book-img/97807/97807624/9780762460991.JPG";
        String url3="https://www.asiabooks.com/media/catalog/product/cache/a5ac216be58c0cbce1cb04612ece96dc/9/7/9786160838257_1.jpg";
        String url4="https://m.media-amazon.com/images/I/61y1U-lPl5L._AC_UF894,1000_QL80_.jpg";
        String url5="https://bci.kinokuniya.com/jsp/images/book-img/97808/97808571/9780857197689.JPG";
        String url6="https://bci.kinokuniya.com/jsp/images/book-img/97811/97811185/9781118503256.JPG";
        imagesArraylist.add(new Book(url,"Secret book"));
        imagesArraylist.add(new Book(url2,"Rich Dad book"));
        imagesArraylist.add(new Book(url3,"Atomic Habits book"));
        imagesArraylist.add(new Book(url4,"Mindset book"));
        imagesArraylist.add(new Book(url5,"The Psychology of Money book"));
        imagesArraylist.add(new Book(url6,"The Warren Buffett Way book"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new MyAdapter(MainActivity.this,imagesArraylist);
        recyclerView.setAdapter(adapter);
    }
}