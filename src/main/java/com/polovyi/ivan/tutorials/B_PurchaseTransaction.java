package com.polovyi.ivan.tutorials;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class B_PurchaseTransaction implements Comparable<B_PurchaseTransaction> {

    private String id;
    private String paymentType;
    private BigDecimal amount;
    private LocalDate createdAt;
    private int cashBack;

    @Override
    public int compareTo(B_PurchaseTransaction object) {
        return Integer.compare(this.getCashBack(), object.getCashBack());
    }
}
