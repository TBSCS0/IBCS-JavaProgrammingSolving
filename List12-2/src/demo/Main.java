package demo;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CSMCoin[] csmcoins = new CSMCoin[10];
        Date date = new Date();
        CSMCoin csmCoin = new CSMCoin(
                "t0001",
                "u0001",
                "u0002",
                10.65,
                5,
                date
        );
        csmcoins[0] = csmCoin;
    }
}
