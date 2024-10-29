package com.escass.portfolio.Serviecs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="")
public class PofolService {
    @RequestMapping(value="/escass.com", method=RequestMethod.GET)
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pofol/index");
        return modelAndView;
    }

    @RequestMapping(value="/escass.com", method=RequestMethod.POST)
    public ModelAndView postIndex() {
        return new ModelAndView("pofol/index");
    }
}
