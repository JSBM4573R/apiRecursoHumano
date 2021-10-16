package co.usa.recursohumanog35.recursohumanog35.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursohumanog35.recursohumanog35.model.Empleado;
import co.usa.recursohumanog35.recursohumanog35.repository.Empleadorepositorio;

@Service
public class EmpleadoServicio {
    
    @Autowired
    private Empleadorepositorio empleadorepositorio;

    public List<Empleado>getAll(){
        return empleadorepositorio.getAll();
    }

    public Optional<Empleado>getEmpleado(int id){
        return empleadorepositorio.getEmpleado(id);
    }

    public Empleado save(Empleado empleado){
        if (empleado.getNumId()==null) {
            return empleadorepositorio.save(empleado);
            
        } else {
            Optional<Empleado> consulta=empleadorepositorio.getEmpleado(empleado.getNumId());
            if (consulta.isEmpty()) {
                return empleadorepositorio.save(empleado);
                
            } else {
                return empleado;                
            }
            
        }
    }

}
