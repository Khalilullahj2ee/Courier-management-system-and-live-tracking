/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Khalil
 */
public class Splash {

    public static void main(String[] args) {
        Splass spl = new Splass();
        spl.setVisible(true);

        try {
            Thread.sleep(4000);

            //AdministrationLogin log = new AdministrationLogin();
            spl.setVisible(false);
            new EmployeesLogin().setVisible(true);
            //log.setVisible(true);
            

        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
