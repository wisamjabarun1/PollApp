package com.example.PollApp.services;

import com.example.PollApp.Repository.QuestionRepository;
import com.example.PollApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionService {
    @Autowired

    private QuestionRepository questionRepository;


public Question save (Question question){
    return questionRepository.save(question);
}


public  Question update (Question question){
    return  questionRepository.update(question);
}

public String Delete (int id){
    return questionRepository.delete(id);
}

    public Optional<Question> getById(int id) {
        return questionRepository.getById(id);
    }




}
