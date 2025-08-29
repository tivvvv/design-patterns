package com.tiv.design.patterns.behavioral.templatemethod;

public abstract class Course {

    protected final void makeCourse() {
        this.makeSlides();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeTextBook();
        }
        this.makeAttachment();
    }

    private void makeSlides() {
        System.out.println("制作PPT");
    }

    private void makeVideo() {
        System.out.println("制作视频");
    }

    private void writeTextBook() {
        System.out.println("编写课本");
    }

    protected boolean needWriteArticle() {
        return false;
    }

    abstract void makeAttachment();

}
