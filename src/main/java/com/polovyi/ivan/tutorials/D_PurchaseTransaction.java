package com.polovyi.ivan.tutorials;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class D_PurchaseTransaction implements Comparable<D_PurchaseTransaction> {

    private String id;
    private String paymentType;
    private BigDecimal amount;
    private LocalDate createdAt;
    private int cashBack;

    @Override
    public int compareTo(D_PurchaseTransaction object) {
        if (this.getCashBack() != object.getCashBack())
            return Integer.compare(this.getCashBack(), object.getCashBack());

        if (!this.getCreatedAt().equals(object.getCreatedAt()))
            return this.getCreatedAt().compareTo(object.getCreatedAt());

        if (!this.getAmount().equals(object.getAmount()))
            return this.getAmount().compareTo(object.getAmount());

            return this.getPaymentType().compareTo(object.getPaymentType());
    }
}
