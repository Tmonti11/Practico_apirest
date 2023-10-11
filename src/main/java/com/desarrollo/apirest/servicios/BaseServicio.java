package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.BaseEntidad;
<<<<<<< HEAD
=======
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
>>>>>>> ffb96d0 (parcial)

import java.io.Serializable;
import java.util.List;

public interface BaseServicio <E extends BaseEntidad, ID extends Serializable> {
    public List<E> getAll() throws Exception;
<<<<<<< HEAD
=======
    public Page<E> getAll(Pageable pageable) throws Exception;
>>>>>>> ffb96d0 (parcial)
    public E getById(ID id) throws Exception;
    public E save (E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws  Exception;

}
