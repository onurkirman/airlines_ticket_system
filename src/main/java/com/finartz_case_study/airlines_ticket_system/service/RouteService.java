package com.finartz_case_study.airlines_ticket_system.service;

import com.finartz_case_study.airlines_ticket_system.model.Route;
import com.finartz_case_study.airlines_ticket_system.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service(value = "routeService")
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public Route getRouteById(Long id) {
        return routeRepository.findById(id)
                                    .orElseThrow(() -> new RuntimeException("404"));
    }

    public Route newRoute(Route route) {
        return routeRepository.save(route);
    }

    public List<Route> getRouteAll() {
        return routeRepository.findAll();
    }

    public Route getRouteByCode(String code) throws Exception{
        List<Route> list = routeRepository.findAll().stream().collect(Collectors.toList());

        Long id = null;
        for (Route l : list){
            if (l.getCode().equalsIgnoreCase(code)){
                id = l.getId();
            }
        }

        return routeRepository.findById(id)
                .orElseThrow(() -> new Exception("Route Not Found!"));

    }
}
