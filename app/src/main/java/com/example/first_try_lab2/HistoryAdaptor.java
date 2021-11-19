package com.example.first_try_lab2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;


    public class HistoryAdaptor extends RecyclerView.Adapter<HistoryAdaptor.viewHolder> {
        Context context;
        ArrayList<HistoryModel> allHistory;
   int position =0;

        public interface OnItemClickListener{
            void onItemClick( HistoryModel selectedHistoryItem);
        }

        public HistoryAdaptor.OnItemClickListener listener;
        LayoutInflater inflater;


        public static class viewHolder extends RecyclerView.ViewHolder{
            TextView purHistory;

            public viewHolder(@NonNull View itemView) {
                super(itemView);
                purHistory = (TextView)itemView.findViewById(R.id.purHistory);
            }
        }


        HistoryAdaptor(Context c, ArrayList<HistoryModel> listOfHistory,OnItemClickListener listener){
            context = c;
            allHistory = listOfHistory;
            this.listener = listener;
        }
        @NonNull
        @Override
        public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.list_of_purchases,parent,false);
            return new HistoryAdaptor.viewHolder(view);
        }
        @Override
        public void onBindViewHolder(@NonNull HistoryAdaptor.viewHolder holder, int position) {


            holder.purHistory.setText(allHistory.get(position).name);


            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(allHistory.get(position));
                }
//            } {
//                @Override
//                public void onItemClick(View view) {
//
//                }
            });
        }
        @Override
        public int getItemCount() {
            return allHistory.size();// 30
        }
    }



