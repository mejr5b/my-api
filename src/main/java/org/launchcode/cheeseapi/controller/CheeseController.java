package org.launchcode.cheeseapi.controller;
import org.launchcode.cheeseapi.model.Cheese;
import org.launchcode.cheeseapi.service.CheeseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cheese")
public class CheeseController
{
    private CheeseService cheeseService;

    public CheeseController(CheeseService cheeseService)
    {
        this.cheeseService = cheeseService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cheese> getAll()
    {
        return cheeseService.getAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.OK)
    public Cheese addNew(@RequestBody Cheese cheese)
    {
        return cheeseService.addCheese(cheese);
    }
}

