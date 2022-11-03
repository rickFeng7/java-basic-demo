package com.rick.jackson.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rick.jackson.enums.GenderEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author fengrui03
 * @date 2022/11/3
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
// @JsonIgnoreProperties({"gender"})// 序列化和反序列化忽略属性
// @JsonPropertyOrder({"name", "gender", "genderEnum"})// 指定序列化顺序
public class Person {
    @NotNull// 校验
    // @JsonProperty("pName")// 设置别名
    @JsonProperty(index = 0)// 序列化顺序
    private String name;
    private Integer gender;
    private GenderEnum genderEnum;
    // @JsonSetter(value = "pAge")// 反序列化时自定义属性名称
    private Integer age;
    // @JsonIgnore// 序列化和反序列化忽略属性
    private int height;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")// 需要导入模块：jackson-datatype-jsr310，并注册模块：objectMapper.findAndRegisterModules()
    private LocalDateTime birthday;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")// 日期格式化
    private Date createDate;

    // @JsonGetter("pAge")// 序列化时自定义属性名称
    public Integer getAge() {
        return age;
    }

    @JsonCreator
    public Person(@JsonProperty("gender") int gender) {
        this.gender = gender;
        this.genderEnum = GenderEnum.getEnumByCode(gender);
    }
}
