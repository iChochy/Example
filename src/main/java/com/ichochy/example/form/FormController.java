/*
 * Copyright (c) 2021 iChochy
 * URL:https://ichochy.com
 * Date:2021/06/09 22:07:09
 */

package com.ichochy.example.form;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    /**
     * 打开表单
     * @param model
     * @return
     */
    @GetMapping(value = "/form")
    public String openForm(Model model) {
        model.addAttribute("form", new Form());
        return "form";
    }

    /**
     * 提交表单
     * @param form
     * @param model
     * @return
     */
    @PostMapping(value = "/form")
    public String submitForm(@ModelAttribute Form form, Model model) {
        model.addAttribute("form", form);
        return "result";
    }

}
