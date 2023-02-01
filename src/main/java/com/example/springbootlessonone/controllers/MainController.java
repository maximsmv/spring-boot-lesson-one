package com.example.springbootlessonone.controllers;

import com.example.springbootlessonone.domain.Tire;
import com.example.springbootlessonone.service.TireService;
import com.example.springbootlessonone.service.TireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({"", "/"})
public class MainController {
    @Autowired
    private TireServiceImpl tireService;

    @GetMapping
    public String indexPage(Model model) {
        model.addAttribute("tireList", tireService.findAll());
        model.addAttribute("tire", new Tire());
        return "index";
    }

    @PostMapping
    public String addTire(@ModelAttribute("tire") Tire tire) {
        tireService.save(tire);
        return "redirect:/";
    }
}
