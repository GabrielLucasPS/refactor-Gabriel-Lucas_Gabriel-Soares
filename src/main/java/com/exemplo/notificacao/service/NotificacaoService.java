package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificacaoService implements PedidoObserver {
    private final List<NotificacaoStrategy> estrategias;

    public NotificacaoService(List<NotificacaoStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    @Override
    public void pedidoCriado(Pedido pedido) {
        for (NotificacaoStrategy estrategia : estrategias) {
            estrategia.enviar(pedido);
        }
    }
}
