package Structural.Adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adapter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Computer computer = new AdapterClass(new Printer());
        computer.wantToPrint("hello");
    }
}
