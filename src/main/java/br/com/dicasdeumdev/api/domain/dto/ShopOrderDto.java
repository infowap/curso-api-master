package br.com.dicasdeumdev.api.domain.dto;

import br.com.dicasdeumdev.api.domain.User;
import br.com.dicasdeumdev.api.enums.StatusShopOrder;

public class ShopOrderDto {

    private Long orderId;
    private StatusShopOrder status;
    private User user;
}
