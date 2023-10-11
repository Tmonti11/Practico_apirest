package com.desarrollo.apirest.servicios;

import com.desarrollo.apirest.entidades.Autor;
<<<<<<< HEAD
=======
import com.desarrollo.apirest.entidades.Persona;
>>>>>>> ffb96d0 (parcial)
import com.desarrollo.apirest.repositorios.BaseRepository;
import com.desarrollo.apirest.repositorios.AutorRepository;
import com.desarrollo.apirest.servicios.AutorServicio;
import com.desarrollo.apirest.servicios.BaseServicioImpl;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicioImpl
        extends BaseServicioImpl<Autor, Long>
        implements AutorServicio{
    @Autowired
    private AutorRepository AutorRepository;
=======
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServicioImpl extends BaseServicioImpl<Autor, Long> implements AutorServicio{
    @Autowired
    private AutorRepository autorRepository;
>>>>>>> ffb96d0 (parcial)

    public AutorServicioImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
<<<<<<< HEAD
=======

    @Override
    public List<Autor> search(String filtro) throws Exception {
        try {
            List<Autor> autores = autorRepository.search(filtro);
            return autores;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Autor> search(String filtro, Pageable pageable) throws Exception {
        try {
            return autorRepository.search(filtro, pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
>>>>>>> ffb96d0 (parcial)
}