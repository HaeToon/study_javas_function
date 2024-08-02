package com.heoth.controller;

import com.heoth.dao.QuizDao;
import com.heoth.dto.QuizDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuizInsertProcess {

    public void insertQuiz(){
        int id = 1;
        Map<Integer, QuizDto> map = new HashMap<>();
        List<String> questions = new ArrayList<>();
        questions.add("Python에서 변수를 선언하는 방법은? (점수: 10점)");
        questions.add("Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
        questions.add("Python에서 조건문을 작성하는 방법은? (점수: 10점)");
        questions.add("Python에서 함수를 정의하는 방법은? (점수: 5점)");
        List<String>options = new ArrayList<>();
        options.add("1) var name 2) name = value 3) set name 4) name == value");
        options.add("1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        options.add("1) if-else, 2) for-in, 3) while, 4) def");
        options.add("1) class, 2) def, 3) import, 4) return");
        List<Integer>answers = new ArrayList<>();
        answers.add(2);
        answers.add(1);
        answers.add(1);
        answers.add(2);
        List<Integer>scores = new ArrayList<>();
        scores.add(10);
        scores.add(15);
        scores.add(10);
        scores.add(5);
        QuizDto quizDto = new QuizDto();
        for(int i=0; i<questions.size(); i++){
            quizDto.setQuestion(questions.get(i));
            quizDto.setOption(options.get(i));
            quizDto.setScore(scores.get(i));
            quizDto.setAnswer(answers.get(i));
            map.put(id,quizDto);
            id++;
        }
        QuizDao quizDao = new QuizDao();
        for(int i=0; i<map.size(); i++){
            quizDao.insertQuiz(map.get(i+1));
        }
    }
}
