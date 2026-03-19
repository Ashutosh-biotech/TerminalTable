package com.ashutosh.terminal;

import java.util.ArrayList;
import java.util.List;

import com.ashutosh.terminal.table.TerminalTable;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

	TerminalTable tt = new TerminalTable();

	tt.setData(new ArrayList<>(List.of(new ArrayList<>(List.of("Hello", "world")))));
	tt.setHeader(new ArrayList<>(List.of("data")));
	tt.nullable = true;
	tt.setNullData("");
	tt.build();

    }
}
