package com.lcc.yuanxing.book;

import java.util.ArrayList;

/**
 * 创建一个word的文档的类
 */
public class WordDocument implements Cloneable{
    //文本
    private String mText;
    //图片名列表
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument(){
        System.out.println("这个是个构造函数");
    }

    @Override
    protected WordDocument clone() throws CloneNotSupportedException {
        try{
            WordDocument document = (WordDocument) super.clone();
            document.mText = this.mText;
            document.mImages = this.mImages;
            return document;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void addImage(String img){
        if (mImages != null){
            mImages.add(img);
        }
    }

    public void setmImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    public void showDocument(){
        System.out.println("输出文字和图片的属性");
    }
}
