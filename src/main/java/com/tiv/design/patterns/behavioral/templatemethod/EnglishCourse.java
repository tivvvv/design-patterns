package com.tiv.design.patterns.behavioral.templatemethod;

public class EnglishCourse extends Course {

    private boolean needWriteArticleFlag = false;

    public EnglishCourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void makeAttachment() {
        System.out.println("提供英语听力录音");
        System.out.println("提供英语单词书");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
