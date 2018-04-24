package com.cloud.controller;

import  com.cloud.model.Member;
import com.cloud.service.Member_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class Reigstration_controller {
    @Autowired
    Member_service memberService;


    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    String home(Model model) {
        model.addAttribute("members", memberService.getMember());
        return "admin";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homework4(Model model) {
        model.addAttribute("member", new Member());
        return "program";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute Member member, RedirectAttributes redirectAttributes)
    {
        memberService.addMember(member);
        redirectAttributes.addFlashAttribute("flash", "Registered "+ member.getEmail());
        return "redirect:/";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    ModelAndView addMember(@RequestParam String email) throws Exception {

        //System.out.println("Received request for student");
        ModelAndView modelAndView = new ModelAndView("admin");
        try {
            Member member = new Member();
            member.setEmail(email);
            member = memberService.addMember(member);
            modelAndView.addObject("message", "Member added with email: " + member.getEmail());
        }
        catch (Exception ex){
            modelAndView.addObject("message", "Failed to add member: " + ex.getMessage());
        }
        modelAndView.addObject("attendees", memberService.getMember());
        return modelAndView;
    }
}
