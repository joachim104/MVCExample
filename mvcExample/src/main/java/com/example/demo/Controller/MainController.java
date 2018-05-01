package com.example.demo.Controller;

import com.example.demo.Model.Entities.Tal;
import com.example.demo.Model.Services.TalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    TalService talService = new TalService();

    @RequestMapping(value = {"numbers"}, method = RequestMethod.GET)
    public String numbers(Model model){

    List<Tal> tallist = new ArrayList<>();

        tallist = talService.generateList();

        model.addAttribute("tallist", tallist);

        return "numbers";
    }
}
