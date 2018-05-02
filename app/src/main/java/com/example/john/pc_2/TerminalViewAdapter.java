package com.example.john.pc_2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TerminalViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Terminals> terminalsList;

    public TerminalViewAdapter(List<Terminals> terminalsList) {
        this.terminalsList = terminalsList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(viewType, parent, false);

        return null;//new TerminalViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }



    public class TerminalViewHolder{

    private TextView namberTerminal, statusTerminal, addressTerminal, bills, cash;

    public TerminalViewHolder(View itemView) {
        namberTerminal = itemView.findViewById(R.id.numberTextView);
        statusTerminal = itemView.findViewById(R.id.statusTextView);
        addressTerminal = itemView.findViewById(R.id.addressTextView);
        bills = itemView.findViewById(R.id.billsTextView);
        cash = itemView.findViewById(R.id.cashTextView);
    }
    public void setData(Terminals terminals, int position){
        namberTerminal. setText("№ "+String.valueOf(terminals.getNamberTerminal()));
        statusTerminal. setText(String.valueOf(terminals.getStatusTerminal()));
        addressTerminal. setText(String.valueOf(terminals.getAddressTerminal()));
        bills. setText("Купюр: "+String.valueOf(terminals.getBills())+" шт.");
        cash. setText("Наличными: "+String.valueOf(terminals.getCash())+" грн.");
    }
}
}
