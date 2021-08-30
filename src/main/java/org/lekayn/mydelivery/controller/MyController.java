package org.lekayn.mydelivery.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import org.lekayn.mydelivery.model.Cafe;
import org.lekayn.mydelivery.model.Menu;
import org.lekayn.mydelivery.model.Orders;
import org.lekayn.mydelivery.service.ICafeService;
import org.lekayn.mydelivery.service.IMenuService;
import org.lekayn.mydelivery.service.IOrderDishesService;
import org.lekayn.mydelivery.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    private ICafeService cafeService;
    private IMenuService menuService;
    private IOrdersService ordersService;
    private IOrderDishesService orderDishesService;

    @Autowired
    public MyController(ICafeService cafeService, IMenuService menuService,
                        IOrdersService ordersService, IOrderDishesService orderDishesService) {
        this.cafeService = cafeService;
        this.menuService = menuService;
        this.ordersService = ordersService;
        this.orderDishesService = orderDishesService;
    }

    /**
     * Получить список ресторанов для заказа еды
     */
    @GetMapping(value = "/")
    public List<Cafe> getListCafe() {

        return cafeService.findAll();

    }

    /**
     * Получить меню ресторана
     */
    @GetMapping(value = "/cafe/{cafe_id}")
    public Optional<Menu> getMenu(@PathVariable(name = "cafe_id") Long cafe_id) {

        return menuService.findMenuByCafeId(cafe_id);
    }

    /**
     * Оформить заказ еды
     */
    @PostMapping(path = "/cafe/{cafe_id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> newOrder(@Valid @RequestBody String request) throws JsonProcessingException {
        Gson gson = new Gson();

        Orders order = gson.fromJson(request, Orders.class);

        if (ordersService.save(order)) {
            if (orderDishesService.saveALl(order.getOrderDishes())) {
                return new ResponseEntity<>(HttpStatus.CREATED);
            } else return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        } else return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

}
