package br.com.dicasdeumdev.api.domain;

import br.com.dicasdeumdev.api.enums.StatusShopOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusShopOrder status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
