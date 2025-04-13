package com.example.PollApp.Controllers;

import com.example.PollApp.model.Answer;
import com.example.PollApp.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    // Endpoint to submit a new answer
    @PostMapping
    public Answer submitAnswer(@RequestBody Answer answer) {
        return answerService.save(answer);
    }

    // Endpoint to update an existing answer
    @PutMapping
    public Answer updateAnswer(@RequestBody Answer answer) {
        return answerService.update(answer);
    }

    // Endpoint to delete an answer by its id
    @DeleteMapping("/{id}")
    public String deleteAnswer(@PathVariable int id) {
        return answerService.delete(id);
    }

    // Endpoint to retrieve an answer by its id
    @GetMapping("/{id}")
    public Answer getAnswer(@PathVariable int id) {
        return answerService.getById(id);
    }

    // Endpoint to retrieve all answers for a given question
    @GetMapping("/question/{questionId}")
    public List<Answer> getAnswersByQuestion(@PathVariable int questionId) {
        return answerService.getByQuestionId(questionId);
    }

    // Endpoint to retrieve all answers submitted by a given user
    @GetMapping("/user/{userId}")
    public List<Answer> getAnswersByUser(@PathVariable int userId) {
        return answerService.getByUserId(userId);
    }
}
