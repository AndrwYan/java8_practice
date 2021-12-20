package com.andrew.chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class TestStreamApi {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","上海！");
        Trader jack = new Trader("JACK","上海！");
        Trader alan = new Trader("alan","北京");
        Trader brian = new Trader("Brian","成都");

        List<Transaction> transactionList = Arrays.asList(
                new Transaction(brian, 2001, 800),
                new Transaction(alan, 2011, 302),
                new Transaction(brian, 2011, 300),
                new Transaction(jack, 2021, 1200),
                new Transaction(brian, 2041, 11600),
                new Transaction(alan, 2071, 50),
                new Transaction(raoul, 2061, 70)
        );
        //question1: 找出2011年的所有交易并按交易额排序
//        List<Transaction> list = transactionList.stream()
//                .filter(a -> "2011".equals(a.getYear()))
//                .sorted(Comparator.comparing(Transaction::getValue))
//                .collect(Collectors.toList());
//        System.out.println(list);

        //question2: 交易员都在哪些不同的城市工作过
//        List<String> list5 = transactionList.stream()
//                .map(transaction -> transaction.getTrader().getCity())
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(list5);

        //可以将question2的distinct()去掉，该用toSet()，将流转化为集合
        Set<String> list3 = transactionList.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(toSet());
        System.out.println(list3);

    }
}
