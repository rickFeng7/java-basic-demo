package com.rick.jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.rick.jackson.entity.Person;
import com.rick.jackson.enums.GenderEnum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class JacksonUtilsTest {

    private Person person;
    private String personStr;
    private List<Person> people;
    private String peopleStr;

    @Before
    public void setUp() throws Exception {
        person = new Person()
                .setName("Tom")
                .setGender(1)
                .setGenderEnum(GenderEnum.MALE)
                .setAge(18)
                .setHeight(180)
                .setBirthday(LocalDateTime.of(2000, 1, 1, 0, 0, 0));
        Person person1 = new Person()
                .setName("Jerry")
                .setGender(2)
                .setGenderEnum(GenderEnum.FEMALE)
                .setAge(18)
                .setHeight(180)
                .setBirthday(LocalDateTime.of(2000, 1, 1, 0, 0, 0));
        personStr = "{\"name\":\"Tom\",\"gender\":1,\"genderEnum\":1,\"age\":18,\"height\":180,\"birthday\":\"2000-01-01 00:00:00\"}";
        people = Arrays.asList(person, person1);
        peopleStr = "[{\"name\":\"Tom\",\"gender\":1,\"genderEnum\":1,\"age\":18,\"height\":180,\"birthday\":\"2000-01-01 00:00:00\"}," +
                "{\"name\":\"Jerry\",\"gender\":2,\"genderEnum\":0,\"age\":18,\"height\":180,\"birthday\":\"2000-01-01 00:00:00\"}]";
    }

    @Test
    public void parseStr() {
        Assert.assertEquals(personStr, JacksonUtils.parseStr(person));
    }

    @Test
    public void parseObj() {
        Assert.assertEquals(person, JacksonUtils.parseObj(personStr, Person.class));
    }

    @Test
    public void parseRef() {
        Assert.assertEquals(people, JacksonUtils.parseRef(peopleStr, new TypeReference<List<Person>>() {
        }));
    }
}