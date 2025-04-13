package com.example.PollApp.services;

import com.example.PollApp.Repository.AnswerRepository;
import com.example.PollApp.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    // Save a new answer (when a user selects an option)
    public Answer save(Answer answer) {
        // You might add validation or additional business logic here
        return answerRepository.save(answer);
    }

    // Update an existing answer (if your logic permits editing)
    public Answer update(Answer answer) {
        return answerRepository.update(answer);
    }

    // Delete an answer by its id
    public String delete(int id) {
        return answerRepository.delete(id);
    }

    // Retrieve an answer by its id
    public Answer getById(int id) {
        return answerRepository.getById(id);
    }

    // Retrieve all answers for a given question
    public List<Answer> getByQuestionId(int questionId) {
        return answerRepository.getByQuestionId(questionId);
    }

    // Retrieve all answers submitted by a given user
    public List<Answer> getByUserId(int userId) {
        return answerRepository.getByUserId(userId);
    }
}
