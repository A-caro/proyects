package proyectsmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyectsmarket.entity.Market;
import proyectsmarket.service.MarketServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/market")
public class MarketController {

    @Autowired
    MarketServiceImpl marketService;

    @GetMapping("/list")
    public ResponseEntity<List<Market>> getAll(){
        return ResponseEntity.ok(marketService.getAll());
    }

}
