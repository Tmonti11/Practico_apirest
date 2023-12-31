package com.desarrollo.apirest.controladores;

import com.desarrollo.apirest.entidades.BaseEntidad;
<<<<<<< HEAD
=======
import org.springframework.data.domain.Pageable;
>>>>>>> ffb96d0 (parcial)
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseControlador <E extends BaseEntidad, ID extends Serializable> {
    public ResponseEntity<?> getAll();
<<<<<<< HEAD
=======
    public ResponseEntity<?> getAll(Pageable pageable);
>>>>>>> ffb96d0 (parcial)
    public ResponseEntity<?> getById(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@PathVariable ID id, @PathVariable E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
