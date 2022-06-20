/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.holamundo;

import gt.com.holamundo.domain.Persona;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author malopez
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        var msg = "Hola mundo con Thymeleaf";

        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@gmail.com");
        persona.setTelefono("58734924");

        var persona2 = new Persona();
        persona2.setNombre("Luis");
        persona2.setApellido("Pacheco");
        persona2.setEmail("lpacheco@gmail.com");
        persona2.setTelefono("9834234");

//        var personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona2);
        var personas = Arrays.asList(persona, persona2);
//        var personas = Arrays.asList();

        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("msg", msg);
        model.addAttribute("saludo", saludo);
//        model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
