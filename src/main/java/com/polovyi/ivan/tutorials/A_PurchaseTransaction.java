package com.polovyi.ivan.tutorials;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class A_PurchaseTransaction implements Comparable<A_PurchaseTransaction> {

    private String id;
    private String paymentType;
    private BigDecimal amount;
    private LocalDate createdAt;
    private int cashBack;

    @Override
    public int compareTo(A_PurchaseTransaction object) {
        int diff = this.getCashBack() - object.getCashBack();
        return diff == 0 ?
                0 :
                diff > 0 ?
                        1 :
                        -1;
    }
}
