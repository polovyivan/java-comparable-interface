package com.polovyi.ivan.tutorials;

import java.math.BigDecimal;
import java.time.LocalDate;


public record E_PurchaseTransaction(String id,
                                    String paymentType,
                                    BigDecimal amount,
                                    LocalDate createdAt,
                                    int cashBack
) implements Comparable<E_PurchaseTransaction> {


    @Override
    public int compareTo(E_PurchaseTransaction object) {
        if (this.cashBack() != object.cashBack()) {
            return Integer.compare(this.cashBack(), object.cashBack());
        }

        if (!this.createdAt().equals(object.createdAt())) {
            return this.createdAt().compareTo(object.createdAt());
        }

        if (!this.amount().equals(object.amount())) {
            return this.amount().compareTo(object.amount());
        }

        return this.paymentType().compareTo(object.paymentType());
    }
}
