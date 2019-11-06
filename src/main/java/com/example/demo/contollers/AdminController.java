package com.example.demo.contollers;

import com.example.demo.domain.Librarian;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/view")
    public String viewLibrarian(){
        Librarian librarian = new Librarian("eddy", 25, 211);
        return "hello view librarian ";
        //return librarian;
    }

    //Create remining endpoints
}
