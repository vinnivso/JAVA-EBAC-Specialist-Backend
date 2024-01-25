package org.vinnivso.annotations;

@Annotation(tableName = "Toyota", columnTitles = "City, Sport, Cross", rowNumber = 5)

public class Main {
    @Annotation(tableName = "Nissan", columnTitles = "Sport" ,rowNumber = 9)
    private String name;
}
