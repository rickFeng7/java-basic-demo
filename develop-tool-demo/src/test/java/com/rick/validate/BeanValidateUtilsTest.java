package com.rick.validate;

import com.rick.jackson.entity.Person;
import com.rick.jackson.enums.GenderEnum;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

public class BeanValidateUtilsTest {

    @Test
    public void beanValidate() {
        Person person = new Person()
                .setGenderEnum(GenderEnum.MALE)
                .setAge(18)
                .setHeight(180)
                .setBirthday(LocalDateTime.of(2000, 1, 1, 0, 0, 0))
                .setCreateDate(new Date());
        BeanValidateUtils.beanValidate(person);
    }
}