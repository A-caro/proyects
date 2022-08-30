package proyectsmarket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectsmarket.entity.Market;
import proyectsmarket.repository.MarketRepository;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService{

    @Autowired
    MarketRepository marketRepository;

    @Override
    public List<Market> getAll() {
        return marketRepository.findAll();
    }

    @Override
    public Market createMarket(Market market) {
        return marketRepository.save(market);
    }

    @Override
    public Market updateMarket(Market market) throws Exception {
        Market oldMarket = marketRepository.findById(market.getId())
                .orElseThrow(
                        () -> new Exception("No existe una tienda con " + market.getId())
                );
        oldMarket.setId(oldMarket.getId());
        oldMarket.setName(oldMarket.getName());
        oldMarket.setProducto(oldMarket.getProducto());
        return marketRepository.save(oldMarket);
    }

    @Override
    public void deleteMarket(Long id) {

    }
}
