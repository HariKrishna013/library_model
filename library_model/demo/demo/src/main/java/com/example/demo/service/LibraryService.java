package com.example.demo.service;

import com.example.demo.model.LibraryModel;
import com.example.demo.repository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
@Service
public class LibraryService {
    @Autowired
    LibraryRepo libraryrepo ;//aggregation
    public List<LibraryModel> getAllBooks() {
        List<LibraryModel> libraryModels = new ArrayList<>();

        libraryrepo.findAll().forEach(ss ->libraryModels.add(ss));
        return libraryModels;
    }

    public void  saveOrUpdate(LibraryModel libraryModel) {

       libraryrepo.save(libraryModel);
    }

    public void delete(int id) {
        libraryrepo.deleteById(id);
    }

    public LibraryModel getBookById(int id) {
        return libraryrepo.findById(id).get();
    }

    public void  update(LibraryModel libraryModel){

        libraryrepo.save(libraryModel);
    }
}

