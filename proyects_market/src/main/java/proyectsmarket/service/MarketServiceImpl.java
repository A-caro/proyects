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
}
