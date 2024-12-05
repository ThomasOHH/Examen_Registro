/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controlador;
 
import com.example.demo.Model.Registro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author User
 */
@Controller
public class registrocontrolador {
      // Muestra el formulario de registro
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new Registro());
        return "register";
    }

    // Procesa los datos del formulario y muestra la vista de éxito
    @PostMapping("/register")
    public String submitRegistration(Registro registration, Model model) {
        // Aquí puedes hacer la lógica de guardar en la base de datos o procesar los datos.
        // En este ejemplo, simplemente redirigimos a la página de éxito.

        model.addAttribute("registration", registration);
        return "success";
    }
}

