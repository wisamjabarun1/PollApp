package com.example.PollApp.model;

public class Answer {
    private int Id;
    private int  questionId;
    private int userId ;
    private String selectedOption;



    public Answer(int id, int questionId, String selectedOption, int userId) {
        Id = id;
        this.questionId = questionId;
        this.selectedOption = selectedOption;
        this.userId = userId;
    }

    public Answer() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "Id=" + Id +
                ", questionId=" + questionId +
                ", userId=" + userId +
                ", selectedOption='" + selectedOption + '\'' +
                '}';
    }
}
