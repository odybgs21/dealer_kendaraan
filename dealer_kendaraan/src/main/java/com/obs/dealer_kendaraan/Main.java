/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obs.dealer_kendaraan;

/**
 *
 * @author D-16
 */
public class Main {
    public static void main(String[] args) {
        MobilBaru mobilBaru = new MobilBaru("Mercedez Benz", "B-102", "3 tahun");
        MobilBekas mobilBekas = new MobilBekas("Toyota", "Supra", 2018,
                200000000);
        Dealer dealer = new Dealer("Mobilindo", mobilBaru, mobilBekas);
        dealer.info();
    }
}
