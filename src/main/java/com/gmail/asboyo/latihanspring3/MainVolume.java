/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.asboyo.latihanspring3;

import com.gmail.asboyo.latihanspring3.service.HitungVolume;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author St0rm
 */
public class MainVolume {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("appconfig2.xml"));
        HitungVolume d1 = (HitungVolume)factory.getBean("hitungVol");
        System.out.println(d1.hitungLuas(10, 45));
    }
}
