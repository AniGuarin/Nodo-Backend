package com.example.tallerlibros.Controller;
import com.example.tallerlibros.Model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;


@RestController
@RequestMapping ("/Book")
public class BookController {
   @GetMapping
    public List<Book> getBooks() {
       List<Book> books = new ArrayList<>();

       books.add(new Book("Akelarre", "Mario Mendoza",
               "2019", "2342456"));
       books.add(new Book("El Psicoanalista","John Katzenbach",
               "2002", "235321"));
       books.add(new Book("Rèquiem por una mujer", "William Faulkner", "1952",
       "244567"));

       return books;
   }

}
