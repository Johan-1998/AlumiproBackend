package com.alumipro.dao;

import com.alumipro.model.DetalleVenta;

import java.util.List;

public interface VentaDAO {

    /**
     * Registra una venta con sus detalles en una transacción.
     * Retorna el ID de la venta creada.
     */
    int registrarVenta(int clienteId, List<DetalleVenta> detalles);
}