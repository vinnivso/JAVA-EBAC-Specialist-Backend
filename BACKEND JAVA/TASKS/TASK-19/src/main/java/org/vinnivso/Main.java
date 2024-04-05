package org.vinnivso;

import org.vinnivso.reflections.Annotation;
import org.vinnivso.reflections.Car;
import org.vinnivso.reflections.Task;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Task firstPrinter = new Task();
        //System.out.println(firstPrinter.getClass());
        //System.out.println(firstPrinter.getClass().getSimpleName());
        //System.out.println(firstPrinter.getClass().getAnnotation(Annotation.class));
        //System.out.println(firstPrinter.getClass().getCanonicalName());
        //System.out.println(firstPrinter.getClass().getDeclaredAnnotation(Annotation.class));

        Class secondPrinter = Car.class;
        System.out.println(secondPrinter);

        try {
            Constructor constructor = secondPrinter.getConstructor();
            Car firstProduct = (Car) constructor.newInstance();
            System.out.println(constructor);
            System.out.println(firstProduct);

            Field[] fields = firstProduct.getClass().getDeclaredFields();
            for (Field field: fields){
                Class<?> type = field.getType();
                String name = field.getName();
                System.out.println(type);
                System.out.println(name);
            }

            Method[] method = firstProduct.getClass().getDeclaredMethods();
            for (Method element: method){
                Class<?> type = element.getReturnType();
                String name = element.getName();
                System.out.println(type);
                System.out.println(name);

                System.out.println("EXECUTING METHODS");
                if (element.getName().startsWith("get")){

                    System.out.println(element.invoke(firstProduct));
                } else {
                    for (Class Classestypes : element.getParameterTypes()){

                        if (Classestypes.equals(String.class)){
                            System.out.println(element.invoke(firstProduct, "2JZ GTE"));
                        } else if (Classestypes.equals(Long.class)) {
                            System.out.println(element.invoke(firstProduct, "Supra MK4"));
                        } else {
                            System.out.println(element.invoke(firstProduct, 322));
                        }
                    }
                }
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
