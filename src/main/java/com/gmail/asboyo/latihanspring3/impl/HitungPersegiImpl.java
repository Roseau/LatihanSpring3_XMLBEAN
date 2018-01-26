/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.asboyo.latihanspring3.impl;

import com.gmail.asboyo.latihanspring3.service.HitungServices;

/**
 *
 * @author St0rm
 */
public class HitungPersegiImpl implements HitungServices {

    @Override
    public double hitungLuas(int param) {
        return param*param;
    }
    
}
