package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {
    private final List<PedidoObserver> observers = new ArrayList<>();

    public void adicionarObserver(PedidoObserver observer) {
        observers.add(observer);
    }

    public void criarPedido(String cliente, double valor) {
        Pedido pedido = new Pedido(cliente, valor);
        System.out.println("Pedido criado para o cliente: " + cliente);
        for (PedidoObserver observer : observers) {
            observer.pedidoCriado(pedido);
        }
    }
}
