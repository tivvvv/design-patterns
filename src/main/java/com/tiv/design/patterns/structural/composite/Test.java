package com.tiv.design.patterns.structural.composite;

public class Test {

    public static void main(String[] args) {
        Component rootCatalog = new Catalog("课程目录", 0);

        Component linuxCourse = new Course("Linux课程", 100);

        Component pythonCatalog = new Catalog("Python课程目录", 1);
        Component pythonBaseCourse = new Course("Python基础课程", 50);
        Component pythonAdvancedCourse = new Course("Python进阶课程", 200);
        pythonCatalog.add(pythonBaseCourse);
        pythonCatalog.add(pythonAdvancedCourse);

        Component AlgorithmCourse = new Course("算法课程", 300);

        Component javaCatalog = new Catalog("Java课程目录", 1);
        Component javaBaseCourse = new Course("Java基础课程", 50);
        Component jvmCourse = new Course("JVM课程", 100);
        Component jucCourse = new Course("JUC课程", 150);

        Component javaProjectCatalog = new Catalog("Java项目目录", 2);
        Component javaImProject = new Course("Java IM项目课程", 2000);
        Component javaOAProject = new Course("Java OA项目课程", 1000);
        javaProjectCatalog.add(javaImProject);
        javaProjectCatalog.add(javaOAProject);

        javaCatalog.add(javaBaseCourse);
        javaCatalog.add(jvmCourse);
        javaCatalog.add(jucCourse);
        javaCatalog.add(javaProjectCatalog);

        rootCatalog.add(linuxCourse);
        rootCatalog.add(pythonCatalog);
        rootCatalog.add(AlgorithmCourse);
        rootCatalog.add(javaCatalog);

        rootCatalog.print();
    }

}
