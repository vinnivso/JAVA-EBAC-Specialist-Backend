package org.vinnivso.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Annotation {

    String tableName();

    String[] columnTitles();

    int rowNumber() default 7;

}
