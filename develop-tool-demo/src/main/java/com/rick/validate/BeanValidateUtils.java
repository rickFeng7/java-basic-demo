package com.rick.validate;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author fengrui03
 * @date 2022/11/3
 */
@Slf4j
public class BeanValidateUtils {
    
    public static <T> void beanValidate(T object) {
        // 获得验证器
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        // 执行验证
        Set<ConstraintViolation<T>> constraintValidations = validator.validate(object);
        // 如果有验证信息，则将第一个取出来包装成异常返回--这里可以执行打印内容校验结果
        if (CollectionUtils.isNotEmpty(constraintValidations)) {
            String message = constraintValidations.iterator().next().getMessage();
            String path = constraintValidations.iterator().next().getPropertyPath().toString();
            log.error("{} - {}", path, message);
        }
    }
}
