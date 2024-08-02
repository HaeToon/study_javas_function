package com.heoth.dao;

import com.heoth.connection.JDBCConnectionPool;
import com.heoth.dto.QuizDto;

import java.sql.SQLException;
import java.util.List;

public class QuizDao extends JDBCConnectionPool {
    public int insertQuiz(QuizDto quizDto){
        int result = 0;
        String sql = "insert into Quiz values(quiz_seq.nextval,?,?,?,?)";
        try {
            pstmt.setString(1,quizDto.getQuestion());
            pstmt.setString(2,quizDto.getOption());
            pstmt.setInt(3,quizDto.getScore());
            pstmt.setInt(4,quizDto.getAnswer());
            result=pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            close();
        }
        return result;
    }
}
