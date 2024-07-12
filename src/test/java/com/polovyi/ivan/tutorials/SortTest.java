package com.polovyi.ivan.tutorials;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class SortTest {

    @Test
    public void testSortByCashBack_A() {
        A_PurchaseTransaction transaction1 = new A_PurchaseTransaction("#1", "VISA", BigDecimal.TEN, LocalDate.now(), 2);
        A_PurchaseTransaction transaction2 = new A_PurchaseTransaction("#2", "MASTER", BigDecimal.TWO, LocalDate.now(), 3);
        A_PurchaseTransaction transaction3 = new A_PurchaseTransaction("#3", "AMEX", BigDecimal.ONE, LocalDate.now(), 1);
        List<A_PurchaseTransaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        System.out.println("Transactions BEFORE sort = " + transactions);
        Collections.sort(transactions);
        System.out.println("Transactions AFTER sort = " + transactions);
        List<String> idsList = transactions.stream()
                .map(A_PurchaseTransaction::getId)
                .collect(Collectors.toUnmodifiableList());
        assertEquals(List.of("#3", "#1", "#2"), idsList);
    }

    @Test
    public void testSortByCashBack_A_Arrays_Sort() {
        A_PurchaseTransaction transaction1 = new A_PurchaseTransaction("#1", "VISA", BigDecimal.TEN, LocalDate.now(), 2);
        A_PurchaseTransaction transaction2 = new A_PurchaseTransaction("#2", "MASTER", BigDecimal.TWO, LocalDate.now(), 3);
        A_PurchaseTransaction transaction3 = new A_PurchaseTransaction("#3", "AMEX", BigDecimal.ONE, LocalDate.now(), 1);
        A_PurchaseTransaction[] transactions = {transaction1, transaction2, transaction3};
        System.out.println("Transactions BEFORE sort = " + Arrays.toString(transactions));
        Arrays.sort(transactions);
        System.out.println("Transactions AFTER sort = " + transactions);
        List<String> idsList = Arrays.stream(transactions).toList().stream()
                .map(A_PurchaseTransaction::getId)
                .collect(Collectors.toUnmodifiableList());
        assertEquals(List.of("#3", "#1", "#2"), idsList);
    }

    @Test
    public void testSortByCashBack_A_Stream() {
        A_PurchaseTransaction transaction1 = new A_PurchaseTransaction("#1", "VISA", BigDecimal.TEN, LocalDate.now(), 2);
        A_PurchaseTransaction transaction2 = new A_PurchaseTransaction("#2", "MASTER", BigDecimal.TWO, LocalDate.now(), 3);
        A_PurchaseTransaction transaction3 = new A_PurchaseTransaction("#3", "AMEX", BigDecimal.ONE, LocalDate.now(), 1);
        List<A_PurchaseTransaction> sortedList = Stream.of(transaction1, transaction2, transaction3)
                .sorted()
                .collect(Collectors.toUnmodifiableList());
        System.out.println("Transactions AFTER sort = " + sortedList);
        List<String> idsList = sortedList.stream()
                .map(A_PurchaseTransaction::getId)
                .collect(Collectors.toUnmodifiableList());
        assertEquals(List.of("#3", "#1", "#2"), idsList);
    }

    @Test
    public void testSortByCashBack_A_TreeSet() {
        A_PurchaseTransaction transaction1 = new A_PurchaseTransaction("#1", "VISA", BigDecimal.TEN, LocalDate.now(), 2);
        A_PurchaseTransaction transaction2 = new A_PurchaseTransaction("#2", "MASTER", BigDecimal.TWO, LocalDate.now(), 3);
        A_PurchaseTransaction transaction3 = new A_PurchaseTransaction("#3", "AMEX", BigDecimal.ONE, LocalDate.now(), 1);
        Set<A_PurchaseTransaction> transactions = new TreeSet<>(Set.of(transaction1, transaction2, transaction3));
        System.out.println("Transactions = " + transactions);
        List<String> idsList = transactions.stream()
                .map(A_PurchaseTransaction::getId)
                .collect(Collectors.toUnmodifiableList());
        assertEquals(List.of("#3", "#1", "#2"), idsList);
    }

    @Test
    public void testSortByCashBack_B() {
        B_PurchaseTransaction transaction1 = new B_PurchaseTransaction("#1", "VISA", BigDecimal.TEN, LocalDate.now(), 2);
        B_PurchaseTransaction transaction2 = new B_PurchaseTransaction("#2", "MASTER", BigDecimal.TWO, LocalDate.now(), 3);
        B_PurchaseTransaction transaction3 = new B_PurchaseTransaction("#3", "AMEX", BigDecimal.ONE, LocalDate.now(), 1);
        List<B_PurchaseTransaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        System.out.println("Transactions BEFORE sort = " + transactions);
        Collections.sort(transactions);
        System.out.println("Transactions AFTER sort = " + transactions);
        List<String> idsList = transactions.stream()
                .map(B_PurchaseTransaction::getId)
                .collect(Collectors.toUnmodifiableList());
        assertEquals(List.of("#3", "#1", "#2"), idsList);
    }

    @Test
    public void testSortByCashBack_C() {
        C_PurchaseTransaction transaction1 = new C_PurchaseTransaction("#1", "VISA", BigDecimal.TEN, LocalDate.now(), 2);
        C_PurchaseTransaction transaction2 = new C_PurchaseTransaction("#2", "MASTER", BigDecimal.TWO, LocalDate.now(), 3);
        C_PurchaseTransaction transaction3 = new C_PurchaseTransaction("#3", "AMEX", BigDecimal.ONE, LocalDate.now(), 1);
        List<C_PurchaseTransaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        System.out.println("Transactions BEFORE sort = " + transactions);
        Collections.sort(transactions);
        System.out.println("Transactions AFTER sort = " + transactions);
        List<String> idsList = transactions.stream()
                .map(C_PurchaseTransaction::getId)
                .collect(Collectors.toUnmodifiableList());
        assertEquals(List.of("#2", "#1", "#3"), idsList);
    }

    @Test
    public void testSortByCashBack_D_equal_cashback() {
        D_PurchaseTransaction transaction1 = new D_PurchaseTransaction("#1", "VISA", BigDecimal.TEN, LocalDate.now().minus(1,
                ChronoUnit.DAYS), 1);
        D_PurchaseTransaction transaction2 = new D_PurchaseTransaction("#2", "MASTER", BigDecimal.TWO, LocalDate.now().minus(10,
                ChronoUnit.DAYS), 1);
        D_PurchaseTransaction transaction3 = new D_PurchaseTransaction("#3", "AMEX", BigDecimal.ONE, LocalDate.now().minus(5,
                ChronoUnit.DAYS), 1);
        List<D_PurchaseTransaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        System.out.println("Transactions BEFORE sort = " + transactions);
        Collections.sort(transactions);
        System.out.println("Transactions AFTER sort = " + transactions);
        List<String> idsList = transactions.stream()
                .map(D_PurchaseTransaction::getId)
                .collect(Collectors.toUnmodifiableList());
        assertEquals(List.of("#2", "#3", "#1"), idsList);
    }

    @Test
    public void testSortByCashBack_D_equal_cashback_and_created_at() {
        D_PurchaseTransaction transaction1 = new D_PurchaseTransaction("#1", "VISA", BigDecimal.TEN, LocalDate.now(), 1);
        D_PurchaseTransaction transaction2 = new D_PurchaseTransaction("#2", "MASTER", BigDecimal.TWO, LocalDate.now(), 1);
        D_PurchaseTransaction transaction3 = new D_PurchaseTransaction("#3", "AMEX", BigDecimal.ONE, LocalDate.now(), 1);
        List<D_PurchaseTransaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        System.out.println("Transactions BEFORE sort = " + transactions);
        Collections.sort(transactions);
        System.out.println("Transactions AFTER sort = " + transactions);
        List<String> idsList = transactions.stream()
                .map(D_PurchaseTransaction::getId)
                .collect(Collectors.toUnmodifiableList());
        assertEquals(List.of("#3", "#2", "#1"), idsList);
    }

    @Test
    public void testSortByCashBack_D_equal_cashback_and_created_at_and_amount() {
        D_PurchaseTransaction transaction1 = new D_PurchaseTransaction("#1", "VISA", BigDecimal.ONE, LocalDate.now(), 1);
        D_PurchaseTransaction transaction2 = new D_PurchaseTransaction("#2", "MASTER", BigDecimal.ONE, LocalDate.now(), 1);
        D_PurchaseTransaction transaction3 = new D_PurchaseTransaction("#3", "AMEX", BigDecimal.ONE, LocalDate.now(), 1);
        List<D_PurchaseTransaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        System.out.println("Transactions BEFORE sort = " + transactions);
        Collections.sort(transactions);
        System.out.println("Transactions AFTER sort = " + transactions);
        List<String> idsList = transactions.stream()
                .map(D_PurchaseTransaction::getId)
                .collect(Collectors.toUnmodifiableList());
        assertEquals(List.of("#3", "#2", "#1"), idsList);
    }

    @Test
    public void testSortByCashBack_E_Record() {
        E_PurchaseTransaction transaction1 = new E_PurchaseTransaction("#1", "VISA", BigDecimal.ONE, LocalDate.now(), 1);
        E_PurchaseTransaction transaction2 = new E_PurchaseTransaction("#2", "MASTER", BigDecimal.ONE, LocalDate.now(), 1);
        E_PurchaseTransaction transaction3 = new E_PurchaseTransaction("#3", "AMEX", BigDecimal.ONE, LocalDate.now(), 1);
        List<E_PurchaseTransaction> transactions = new ArrayList<>();
        transactions.add(transaction1);
        transactions.add(transaction2);
        transactions.add(transaction3);
        System.out.println("Transactions BEFORE sort = " + transactions);
        Collections.sort(transactions);
        System.out.println("Transactions AFTER sort = " + transactions);
        List<String> idsList = transactions.stream()
                .map(E_PurchaseTransaction::id)
                .collect(Collectors.toUnmodifiableList());
        assertEquals(List.of("#3", "#2", "#1"), idsList);
    }

}
