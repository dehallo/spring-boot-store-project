package com.codewithmosh.store.carts;

import lombok.Data;

@Data
public class AddItemToCartRequest {
    private Long productId;
    private Integer quantity;
    private String productName;
}
