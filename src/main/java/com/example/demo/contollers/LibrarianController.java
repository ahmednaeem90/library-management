package com.example.demo.contollers;

import com.example.demo.domain.Books;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public class LibrarianController {

    @GetMapping("/addBooks")
    public String addBooks() {
        Books books = new Books("Dark Shadow", 1020, "Mccleasky", 14);
        return "shelf 21";

    }
    @GetMapping("/viewBooks")
    public String viewBooks(){
        Books books = new Books("Dark Shadow",1020, "Mccleassky", 14);
        return "viewingBooks";

    }
    @GetMapping ("/issueBooks")
    public String issueBooks(){
        Books books = new Books("Dark Shadow", 1020, "Mccleasky", 14);
        return "issueBooks";
    }
    @GetMapping ("/viewIssuedBooks")
    public String viewIssuedBooks(){
        Books books = new Books("Dark Shadow", 1020, "Mcclesky", 14);
        return "viewIssuedBooks";

    }
    @GetMapping( "/returnBooks")
    public String returnBooks(){
        Books books = new Books("Dark Shadow", 1020, "Mclesky", 14);
        return "return";

    }
    @GetMapping("/canLogout")
    public String canLogout(){
        Books books= new Books("dark shadow", 1020, "Mclesky", 14);
        return "canLogout";

    }
}
