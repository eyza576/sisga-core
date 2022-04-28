package ilp.edu.sisgaedu.servicis;

import ilp.edu.sisgaedu.entity.Escuela;

import java.util.List;

public interface IEscuelaService  {
    List<Escuela> listarEscuelas();




    //Obtener escuela por su código
     Escuela obtenerEscuelPorCodigo(String codigo);



    //Buscar una escuela a travez de su id y denominación
     Escuela buscarEscuelaByIdAndDenominacion(Long idescuela, String denominacion);


}
