package com.heoth;

import com.heoth.controller.QuizStart;
import com.heoth.dao.QuizDao;
import com.heoth.dto.QuizDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        QuizStart quizStart = new QuizStart();
        quizStart.run();
    }
}