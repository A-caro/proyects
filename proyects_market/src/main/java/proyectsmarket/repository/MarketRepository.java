package proyectsmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectsmarket.entity.Market;

public interface MarketRepository extends JpaRepository<Market, Long> {
}
