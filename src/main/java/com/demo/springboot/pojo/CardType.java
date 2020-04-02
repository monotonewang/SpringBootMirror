package com.demo.springboot.pojo;

import java.util.List;

public class CardType {


    public void setCardDetailList(List<CardDetail> cardDetailList) {
        this.cardDetailList = cardDetailList;
    }

    private List<CardDetail> cardDetailList;
    private String day;

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
