package co.usa.recursohumanog35.recursohumanog35.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.usa.recursohumanog35.recursohumanog35.model.Departamento;
import co.usa.recursohumanog35.recursohumanog35.service.DepartamentoServicio;

@RestController
@RequestMapping("/api/Departamento")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class DepartamentoControlador {
    @Autowired
    private DepartamentoServicio departamentoServicio;

    @GetMapping("/all")
    public List<Departamento>getDepartamentos(){
        return departamentoServicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Departamento>getDepartamento(@PathVariable("id") int id){
        return departamentoServicio.getDepartamento(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Departamento save(@RequestBody Departamento dpto){
        return departamentoServicio.save(dpto);

    }




    
}
