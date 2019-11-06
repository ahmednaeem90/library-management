package com.example.demo.contollers;

import com.example.demo.domain.Librarian;
import jdk.nashorn.internal.objects.annotations.Function;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/add")
    public String addLibrarian() {
        Librarian librarian = new Librarian("eddy", 25, 211);
        return "hello add librarian ";
        //return librarian;
    }

    @GetMapping("/view")
    public String viewLibrarian() {
        Librarian librarian = new Librarian("eddy", 25, 211);
        return "hello view librarian";
    }

    @GetMapping("/delete")
    public String deleteLibrarian() {
        Librarian librarian = new Librarian("eddy", 25, 211);
        return "hello delete librarian";

        }


        //Create remaining endpoints
    @GetMapping("/logout librarian")
    public String logoutLibrarian() {
        Librarian librarian = new Librarian("eddy", 25, 211);
        return "librarian logout";
    }

    }
