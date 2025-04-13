package com.example.PollApp.Repository;

import com.example.PollApp.model.Answer;
import com.example.PollApp.Repository.mappers.AnswerMapper; // Create this mapper similar to QuestionMapper
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class AnswerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Answer save(Answer answer) {
        try {
            String sql = "INSERT INTO Answers (questionId, userId, selectedOption) VALUES (?, ?, ?)";
            jdbcTemplate.update(sql, answer.getQuestionId(), answer.getUserId(), answer.getSelectedOption());
            return answer;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Answer update(Answer answer) {
        try {
            String sql = "UPDATE Answers SET questionId = ?, userId = ?, selectedOption = ? WHERE Id = ?";
            jdbcTemplate.update(sql, answer.getQuestionId(), answer.getUserId(), answer.getSelectedOption(), answer.getId());
            return answer;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String delete(int id) {
        try {
            String sql = "DELETE FROM Answers WHERE Id = ?";
            jdbcTemplate.update(sql, id);
            return "Answer with id " + id + " deleted successfully";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Answer getById(int id) {
        try {
            String sql = "SELECT * FROM Answers WHERE Id = ?";
            return jdbcTemplate.queryForObject(sql, new AnswerMapper(), id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Answer> getByQuestionId(int questionId) {
        try {
            String sql = "SELECT * FROM Answers WHERE questionId = ?";
            return jdbcTemplate.query(sql, new AnswerMapper(), questionId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Answer> getByUserId(int userId) {
        try {
            String sql = "SELECT * FROM Answers WHERE userId = ?";
            return jdbcTemplate.query(sql, new AnswerMapper(), userId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
