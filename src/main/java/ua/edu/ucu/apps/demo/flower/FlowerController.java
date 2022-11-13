package ua.edu.ucu.apps.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/flower")
@RestController
public class FlowerController {
    @Autowired
    private FlowerService flowerService;
    @GetMapping(path = "/all")
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }
    @PostMapping(path = "/add")
    public void addFlower(@RequestBody Flower flower){
        flowerService.addFlower(flower);
    }

}