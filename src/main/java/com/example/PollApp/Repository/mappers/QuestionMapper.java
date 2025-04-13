package com.example.PollApp.Repository.mappers;

import com.example.PollApp.model.Question;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionMapper  implements RowMapper<Question> {
    @Override

    public Question mapRow(ResultSet rs, int rowNum) throws SQLException {

        Question question = new Question();
        question.setId(rs.getInt("Id"));
        question.setTitle(rs.getString("Title"));
        question.setOption1(rs.getString("Option1"));
        question.setOption2(rs.getString("Option2"));
        question.setOption3(rs.getString("Option3"));
        question.setOption4(rs.getString("Option4"));



return question ;




    }





}
