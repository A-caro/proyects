package proyectsmarket.service;

import proyectsmarket.entity.Market;

import java.util.List;

public interface MarketService {

    List<Market> getAll();

    Market createMarket(Market market);

    Market updateMarket(Market market) throws Exception;

    void deleteMarket(Long id);
}
