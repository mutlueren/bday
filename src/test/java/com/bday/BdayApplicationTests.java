package com.bday;

import com.bday.service.BdayService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BdayApplicationTests {

    @InjectMocks
    BdayService bdayService;

    @Test
    public void birthdayServiceSetTimeTest() {
        String result = bdayService.setTime(LocalDate.of(1995, 03, 02));
        System.out.println(result);
        assertNotNull(result);        
        assertNotEquals(result,"Please insert a valid birthday.");
        assertNotEquals(result,"HAPPY BIRTHDAY!");
    }

}
