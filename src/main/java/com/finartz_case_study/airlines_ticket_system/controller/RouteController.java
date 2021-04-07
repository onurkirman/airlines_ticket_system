package com.finartz_case_study.airlines_ticket_system.controller;


import com.finartz_case_study.airlines_ticket_system.model.Route;
import com.finartz_case_study.airlines_ticket_system.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @GetMapping
    public List<Route> getRouteAll() {
        return routeService.getRouteAll();
    }

    @GetMapping("/id/{id}")
    public Route getRouteById(@PathVariable("id") Long id){
        return routeService.getRouteById(id);
    }

    @GetMapping("/code/{code}")
    public Route getRouteByCode(@PathVariable("code") String code) throws Exception{
        return routeService.getRouteByCode(code);
    }

    @PostMapping
    public Route newRoute(@RequestBody Route route){
        return routeService.newRoute(route);
    }

}
