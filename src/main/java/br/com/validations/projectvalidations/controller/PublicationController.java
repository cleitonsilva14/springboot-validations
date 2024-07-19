package br.com.validations.projectvalidations.controller;


import br.com.validations.projectvalidations.model.Publication;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class PublicationController {


    @GetMapping("/")
    public ModelAndView home(){
        return new ModelAndView("form", Map.of("publication", new Publication()));
    }


    @PostMapping("/save")
    public String save(@Valid Publication pub, BindingResult result){
        if(result.hasErrors()){
            return "form";
        }

        return "redirect:/";
    }


}
