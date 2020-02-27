package org.launchcode.cheeseapi.service;
import org.launchcode.cheeseapi.model.Cheese;
import org.launchcode.cheeseapi.repository.CheeseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheeseService {

    private CheeseRepository cheeseRepository;


    public CheeseService(CheeseRepository cheeseRepository)
    {
        this.cheeseRepository = cheeseRepository;
    }

    public List<Cheese> getAll()
    {
        return cheeseRepository.findAll();
    }

    public Cheese addCheese(Cheese cheese)
    {
        return cheeseRepository.save(cheese);
    }
}
