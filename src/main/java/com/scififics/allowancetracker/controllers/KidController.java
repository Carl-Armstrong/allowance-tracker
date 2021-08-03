package com.scififics.allowancetracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("kids")
public class KidController {

    private static List<String> kids = new ArrayList<>();

    @GetMapping
    public String displayAllKids(Model model) {
        model.addAttribute("kids", kids);
        return "kids/index";
    }

    @GetMapping("create")
    public String renderCreateKidForm() {
        return "kids/create";
    }

    @PostMapping("create")
    public String createKid(@RequestParam String kidName) {
        kids.add(kidName);
        return "redirect:";
    }
}
