package com.example.PollApp.Controllers;

import com.example.PollApp.model.Question;
import com.example.PollApp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Questions")

public class QuestionController {
    @Autowired
    QuestionService questionService;


    @PostMapping
    public Question createUser(@RequestBody Question question) {
        try {
            return questionService.save(question);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


        @PutMapping
        public Question updateUser(@RequestBody Question question) {
            try {
                return questionService.update(question);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }

        @DeleteMapping("/{Id}")
        public String deleteUser(@PathVariable int Id) {
            try {
                return questionService.Delete(Id);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }

        @GetMapping("/{Id}")
        public Optional<Question> getUser(@PathVariable int Id) {
            try {
                return questionService.getById(Id);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return Optional.empty();
            }
        }














    }















