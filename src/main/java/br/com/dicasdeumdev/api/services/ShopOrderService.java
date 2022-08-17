package br.com.dicasdeumdev.api.services;

import br.com.dicasdeumdev.api.domain.ShopOrder;
import br.com.dicasdeumdev.api.domain.dto.ShopOrderDto;

import java.util.List;

public interface ShopOrderService {

    ShopOrder findById (Long id);
    List<ShopOrder> findAll();
    ShopOrder create (ShopOrderDto obj);
    ShopOrder update (ShopOrderDto obj);
    void delete (Long id);
}
