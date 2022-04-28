package ilp.edu.sisgaedu.servicis.impl;

import ilp.edu.sisgaedu.entity.Escuela;
import ilp.edu.sisgaedu.servicis.IEscuelaDao;
import ilp.edu.sisgaedu.servicis.IEscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscuelaServiceImpl implements IEscuelaService {
    @Autowired
    private IEscuelaDao escuelaDao;

    @Override
    public List<Escuela> listarEscuelas() {
        return this.escuelaDao.findAll();
    }

    @Override
    public Escuela obtenerEscuelPorCodigo(String codigo) {
        return this.escuelaDao.obtenerEscuelaPorParam(codigo);
    }

    @Override
    public Escuela buscarEscuelaByIdAndDenominacion(Long idescuela, String denominacion) {
        Escuela escuela = this.escuelaDao.findByIdescuelaAndDenominacion(idescuela, denominacion);
        System.out.println("ESCUELA " + escuela.getDenominacion());
        return escuela;
    }
}