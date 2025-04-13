package com.example.PollApp.Repository.mappers;

import com.example.PollApp.model.Answer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnswerMapper implements RowMapper<Answer> {
    @Override
    public Answer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Answer answer = new Answer();
        answer.setId(rs.getInt("Id"));
        answer.setQuestionId(rs.getInt("questionId"));
        answer.setUserId(rs.getInt("userId"));
        answer.setSelectedOption(rs.getString("selectedOption"));
        return answer;
    }
}
