package com.example.PollApp.Repository;

import com.example.PollApp.Repository.mappers.QuestionMapper;
import com.example.PollApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class QuestionRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

public Question save (Question question){
    try {
        String Sql="INSERT INTO Questions (title,option1,option2,option3,option4) VALUES (?, ?, ?, ?, ?)" ;
        jdbcTemplate.update(Sql,question.getTitle(),question.getOption1(),question.getOption2(),question.getOption3(),question.getOption4());
        return question;
    }catch (Exception e){
        System.out.println(e.getMessage());
        return null;
    }

}

public Question update(Question question) {
    try {
        String Sql = "UPDATE Questions SET title = ?, option1 = ?, option2 = ?, option3 = ?, option4 = ? WHERE Id = ?";

        jdbcTemplate.update(Sql, question.getTitle(), question.getOption1(), question.getOption2(), question.getOption3(), question.getOption4(), question.getId());
        return question;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return null;
    }
}

    public String delete(int id) {
        try {
            String sql = "DELETE FROM Questions WHERE Id = ?";
            jdbcTemplate.update(sql, id);
            return "Question with id " + id + " deleted successfully";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }




    public Optional<Question> getById(int Id) {
        try {
            String sql = "SELECT * FROM Questions WHERE Id = ?";
            return Optional.ofNullable(jdbcTemplate.queryForObject(sql, new QuestionMapper(), Id));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }

    }













    }

























