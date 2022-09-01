import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmTest {

    @Test
    void AlarmWhenOver30(){
        //GIVEN
        int number=31;

        //WHEN
        String actual= Alarm.ladenleute(number);

        //THEN
        assertEquals("zuviel",actual);
    }

    @Test
    void AlarmWhenis30(){
        //GIVEN
        int number=30;

        //WHEN
        String actual= Alarm.ladenleute(number);

        //THEN
        assertEquals("genau",actual);
    }


    @Test
    void AlarmWhenUnder30(){
        //GIVEN
        int number=29;

        //WHEN
        String actual= Alarm.ladenleute(number);

        //THEN
        assertEquals("zuwenig",actual);
    }
}


