package com.example.pocms1.controller;

import com.example.pocms1.model.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController implements com.example.pocms1.api.BookApi {
    @Override
    public ResponseEntity<List<BookDto>> getBooks() {
       return ResponseEntity.ok(new ArrayList() {{
           add(new BookDto().title("Harry Potter and the Philosopher's Stone").author("J. K. Rowling").id(1L));
       }});
    }
}
