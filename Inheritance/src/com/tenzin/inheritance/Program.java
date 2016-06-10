/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.inheritance;

import com.tenzin.inheritance.dao.StudentsDAO;
import com.tenzin.inheritance.entity.Students;
import com.tenzin.inheritance.nep.StudentsDAODBImpl;
import com.tenzin.inheritance.nep.StudentsDAOImpl;

/**
 *
 * @author Home
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Students std=new Students();
        
        StudentsDAO stdDAO=new StudentsDAODBImpl();
        stdDAO.insert(std);
    }
    
}
