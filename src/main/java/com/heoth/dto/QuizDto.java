package com.heoth.dto;

public class QuizDto {
    private long id;
    private String question;
    private String option;
    private int score;
    private int answer;

    public QuizDto() {

    }

    public QuizDto(String question, String option, int score, int answer) {
        this.question = question;
        this.option = option;
        this.score = score;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption() {
        return option;
    }

    public int getScore() {
        return score;
    }

    public int getAnswer() {
        return answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
