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
class MobilBaru extends Mobil implements Kendaraan{

    private String garansi;

    public MobilBaru(String merek, String model, String garansi) {
        super(merek, model);
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }

    public void info() {
        System.out.println("Mobil Baru: " + getMerek() + " " + getModel() + "(Garansi:" + garansi + ")");
    }
}
