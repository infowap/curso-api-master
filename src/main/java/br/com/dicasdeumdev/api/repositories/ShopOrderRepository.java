package br.com.dicasdeumdev.api.repositories;

import br.com.dicasdeumdev.api.domain.ShopOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopOrderRepository extends JpaRepository<ShopOrder, Long> {
}
