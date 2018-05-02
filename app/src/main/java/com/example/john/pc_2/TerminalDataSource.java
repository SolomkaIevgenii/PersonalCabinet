package com.example.john.pc_2;

import java.util.ArrayList;
import java.util.List;

public class TerminalDataSource {


    interface ResultCallBack{
        void onResult(List<Terminals> terminals);
    }

    void load(ResultCallBack resultCallBack){

        List<Terminals> terminals = new ArrayList<>();

        terminals.add(new Terminals(221, "On work", "Kiev, Main str. 145, Grocery store", 8, 450));
        terminals.add(new Terminals(156, "On work", "Odessa, Main str. 145, Grocery store", 15, 450));
        terminals.add(new Terminals(6235, "Turned off", "Kharkov, Main str. 145, Grocery store", 0, 0));
        terminals.add(new Terminals(345, "On work", "Lvov, Main str. 145, Grocery store", 20, 1652));
        terminals.add(new Terminals(68, "Status error", "Chernigov, Main str. 145, Grocery store", 5, 120));
        terminals.add(new Terminals(3234, "On work", "Vinnica, Main str. 145, Grocery store", 32, 3285));

        resultCallBack.onResult(terminals);
    }
}
