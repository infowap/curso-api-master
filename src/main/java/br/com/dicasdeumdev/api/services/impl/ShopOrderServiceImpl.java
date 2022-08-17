package br.com.dicasdeumdev.api.services.impl;

import br.com.dicasdeumdev.api.domain.ShopOrder;
import br.com.dicasdeumdev.api.domain.dto.ShopOrderDto;
import br.com.dicasdeumdev.api.repositories.ShopOrderRepository;
import br.com.dicasdeumdev.api.services.ShopOrderService;
import br.com.dicasdeumdev.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Service
public class ShopOrderServiceImpl implements ShopOrderService {

    public static final String ID = "/{id}";
    @Autowired
    private ShopOrderRepository shopOrderRepository;

    @Autowired
    private ShopOrderService shopOrderService;

    @Override
    public List<ShopOrder> findAll(){
        return shopOrderRepository.findAll();
    }

    @Override
    public ShopOrder findById(Long id){
        Optional<ShopOrder> obj = shopOrderRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("ShopOrde não encontrado"));
    }

    @Override
    public ShopOrder create(ShopOrderDto obj) {
        return null;
    }

    @Override
    public ShopOrder update(ShopOrderDto obj) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }



}
