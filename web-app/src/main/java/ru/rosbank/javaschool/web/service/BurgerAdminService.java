package ru.rosbank.javaschool.web.service;

import lombok.RequiredArgsConstructor;
import ru.rosbank.javaschool.web.repository.OrderPositionRepository;
import ru.rosbank.javaschool.web.repository.OrderRepository;
import ru.rosbank.javaschool.web.repository.ProductRepository;

@RequiredArgsConstructor
public class BurgerAdminService {
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private final OrderPositionRepository orderPositionRepository;


}
