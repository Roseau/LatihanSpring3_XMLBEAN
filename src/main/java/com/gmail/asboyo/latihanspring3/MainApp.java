/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.asboyo.latihanspring3;

import com.gmail.asboyo.latihanspring3.service.HitungServices;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author St0rm
 */
public class MainApp {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("appconfig.xml"));
        HitungServices d1 = (HitungServices) factory.getBean("lingkaran");
        System.out.println(d1.hitungLuas(100));
    }
}
