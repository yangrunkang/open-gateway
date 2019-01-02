package com.open.basic.user;

import com.open.basic.user.entity.Question;
import com.open.basic.user.mapper.QuestionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OpenBasicUserApplicationTests {

    @Resource
    private QuestionMapper questionMapper;

    @Test
    public void contextLoads() {
        List<Question> questions = questionMapper.selectAll();
        System.out.println(questions);
    }

}

