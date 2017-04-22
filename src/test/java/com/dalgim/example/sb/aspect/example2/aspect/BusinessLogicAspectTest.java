package com.dalgim.example.sb.aspect.example2.aspect;

import com.dalgim.example.sb.aspect.example2.architecture.BusinessLogic;
import com.dalgim.example.sb.aspect.example2.logic.input.SecondInput;
import com.dalgim.example.sb.aspect.example2.logic.input.ThirdInput;
import com.dalgim.example.sb.aspect.example2.logic.input.FirstInput;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Mateusz Dalgiewicz on 22.04.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessLogicAspectTest {

    @Autowired
    private BusinessLogic<SecondInput> secondLogic;
    @Autowired
    private BusinessLogic<FirstInput> firstLogic;
    @Autowired
    private BusinessLogic<ThirdInput> testExceptionLogic;

    @Test
    public void eventAspectTest() throws Exception {

        FirstInput firstInput = new FirstInput("JohnBlog", "Blog");
        firstLogic.logic(firstInput);

        SecondInput secondInput = new SecondInput("John", "Password");
        secondLogic.logic(secondInput);

        ThirdInput thirdInput = new ThirdInput("TestValue");
        testExceptionLogic.logic(thirdInput);
    }
}