package com.lcc.adapter1.change;

/**
 * 中国插座
 */
public class GBSocket implements GBSocketInterface{

    @Override
    public void powerWithThreeFlat() {
        System.out.println("中国插座：国标接口：：使用三项扁头插孔供电");
    }
}