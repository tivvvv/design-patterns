package com.tiv.design.patterns.structural.flyweight;

public class TextEditor {

    private FlyweightCharacterFactory factory;

    public TextEditor() {
        factory = new FlyweightCharacterFactory();
    }

    /**
     * 显示文本,每个字符可以有各自的外部状态
     */
    public void displayText(String text) {
        System.out.println("显示文本: " + text);

        boolean style = true;

        for (char c : text.toCharArray()) {
            FlyweightCharacter character = factory.getCharacter(c);

            if (style) {
                character.display("Arial", 12, "black");
            } else {
                character.display("Times New Roman", 14, "blue");
            }

            style = !style;
        }

        System.out.println("总共创建: " + factory.getCharacterCount() + " 个字符");
    }

}
