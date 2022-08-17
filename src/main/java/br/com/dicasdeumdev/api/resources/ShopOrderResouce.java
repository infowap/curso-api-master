package br.com.dicasdeumdev.api.resources;

import br.com.dicasdeumdev.api.domain.dto.ShopOrderDto;
import br.com.dicasdeumdev.api.services.ShopOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/shop-order")
public class ShopOrderResouce {

    @Autowired
    private ShopOrderService shopOrderService;
    @Autowired
    private ModelMapper mapper;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ShopOrderDto> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(mapper.map(shopOrderService.findById(id),ShopOrderDto.class));
    };

    @GetMapping
    public ResponseEntity<List<ShopOrderDto>> findAll(){
        return ResponseEntity.ok().body(shopOrderService.findAll()
                .stream().map(x -> mapper.map(x, ShopOrderDto.class))
                .collect(Collectors.toList()));
    }
}
