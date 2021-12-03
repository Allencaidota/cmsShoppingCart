package com.allen.cmsshoppingcart.controllers;

import java.util.List;

import com.allen.cmsshoppingcart.models.PageRepository;
import com.allen.cmsshoppingcart.models.data.Page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {

    private PageRepository pageRepo;

    public AdminPagesController(PageRepository pageRepo) {
        this.pageRepo = pageRepo;
    }

    @GetMapping
    public String index(Model model) {

        List<Page> pages = pageRepo.findAll();

        model.addAttribute("pages", pages);

        return "admin/pages/index";
    }

    @GetMapping("/add")
    public String add(@ModelAttribute Page model) {

        // model.addAttribute("pages", new Page());

        return "admin/pages/add";
    }

}