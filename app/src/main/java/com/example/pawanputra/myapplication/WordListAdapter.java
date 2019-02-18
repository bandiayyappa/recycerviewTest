package com.example.pawanputra.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by user on 9/7/2016.
 */

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {
    private HashMap<String, String> wordList;
    private LayoutInflater mInflater;
    public WordListAdapter(Context context, HashMap<String, String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.wordList = wordList;
    }
    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View mItemView = mInflater.inflate(R.layout.individual_file, parent, false);
        return new WordViewHolder(mItemView, this);

    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {

        holder.wordItemView.setText(wordList.get("name"));
        holder.wordItemView2.setText(wordList.get("village"));
    }

    @Override
    public int getItemCount() {
        return 4;
    }


    class WordViewHolder extends RecyclerView.ViewHolder {
        public final TextView wordItemView;
        public final TextView wordItemView2;

        final WordListAdapter mAdapter;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = (TextView) itemView.findViewById(R.id.word);
            wordItemView2 = (TextView) itemView.findViewById(R.id.word2);
            this.mAdapter = adapter;
        }
    }
}