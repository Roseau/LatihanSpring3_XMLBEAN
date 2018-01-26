/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.asboyo.latihanspring3.impl;

import com.gmail.asboyo.latihanspring3.service.HitungServices;
import com.gmail.asboyo.latihanspring3.service.HitungVolume;

/**
 *
 * @author St0rm
 */
public class HitungVolumeImpl implements HitungVolume {
    private HitungServices lingkaran;

    @Override
    public double hitungLuas(int lebar, int tinggi) {
        return lingkaran.hitungLuas(lebar)*tinggi;
    }
    public void setLingkaran(HitungServices lingkaran){
        this.lingkaran = lingkaran;
    }
    
    
    
}
