package com.example.demo.services;

import com.example.demo.domain.Cliente;
import com.example.demo.domain.Pedido;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.repositories.PedidoRepository;
import com.example.demo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado. Id "
                + id + ", Tipo: "+ Pedido.class.getName()));
    }
}
