package com.allen.cmsshoppingcart;

import java.util.List;

import com.allen.cmsshoppingcart.models.PageRepository;
import com.allen.cmsshoppingcart.models.data.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class Common {

    @Autowired
    private PageRepository pageRepo;

    @ModelAttribute
    public void sharedDate(Model model) {

        List<Page> pages = pageRepo.findAllByOrderBySortingAsc();

        model.addAttribute("cpages", pages);
    }

}
