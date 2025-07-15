package com.medicine.Remainder.controller;

import com.medicine.Remainder.model.Remainder;
import com.medicine.Remainder.repository.RemainderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class RemainderController {

    @Autowired
    private RemainderRepository remainderRepo;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("remainders", remainderRepo.findAll());
        model.addAttribute("today", LocalDate.now());
        return "index";
    }

    @PostMapping("/add")
    public String addRemainder(@RequestParam String medicineName,
                                @RequestParam String time,
                                @RequestParam String startDate,
                                @RequestParam String endDate) {
        Remainder remainder = new Remainder();
        remainder.setMedicineName(medicineName);
        remainder.setTime(time);
        remainder.setStartDate(LocalDate.parse(startDate));
        remainder.setEndDate(LocalDate.parse(endDate));
        remainderRepo.save(remainder);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteRemainder(@RequestParam Long id) {
        remainderRepo.deleteById(id);
        return "redirect:/";
    }
}
