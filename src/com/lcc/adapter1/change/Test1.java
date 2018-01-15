package com.lcc.adapter1.change;

import com.lcc.adapter1.Hotel;

public class Test1 {
    public static void main(String[] args) {

        GBSocketInterface gbSocket = new GBSocket();

        Hotel hotel = new Hotel();

        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);

        hotel.setSocket(socketAdapter);

        hotel.charge();
    }
}
