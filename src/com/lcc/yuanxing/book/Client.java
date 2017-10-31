package com.lcc.yuanxing.book;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        WordDocument wordDocument = new WordDocument();
        wordDocument.setmText("1");
        wordDocument.addImage("1");
        wordDocument.addImage("2");
        wordDocument.addImage("3");

        wordDocument.showDocument();

        WordDocument wordDocument1 = wordDocument.clone();
        wordDocument1.setmText("仅仅是修改了一下标题");
    }
}
