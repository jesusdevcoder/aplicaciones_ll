package com.proyecto1.proyecto.controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto1.proyecto.models.Producto;

@RestController
public class ControladorProducto {

    private List<Producto> productos = new ArrayList<>(
            Arrays.asList(new Producto(1, "Roscon", 3.4, 10)));

    // Obtener todos los productos (Método GET)
    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return productos;
    }

    // Agregar un nuevo producto (Método POST)
    @PostMapping("/producto")
    public Producto agregarProducto(@RequestBody Producto producto) {
        productos.add(producto);
        return producto;
    }

    // Actualizar un producto existente (Método PUT)
    @PutMapping("/producto")
    public Producto actualizarProducto(@RequestBody Producto productoActualizado) {
        for (Producto p : productos) {
            if (p.getIdPro() == productoActualizado.getIdPro()) {
                p.setNombre(productoActualizado.getNombre());
                p.setValor(productoActualizado.getValor());
                p.setCantidad(productoActualizado.getCantidad());
                return p;
            }
        }
        return null;
    }

    // Eliminar un producto (Método DELETE)
    @DeleteMapping("/producto/{IdPro}")
    public Producto eliminarProducto(@PathVariable Integer IdPro) {
        for (Producto p : productos) {
            if (p.getIdPro() == IdPro) {
                productos.remove(p);
                return p;

            }
        }
        return null;
    }
}
