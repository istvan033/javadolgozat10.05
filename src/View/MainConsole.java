/*
* File: Filereader.java
* Author: Pásztor István
* Copyright: 2023, Pászor István
* Group: SZOFT II/2/N
* Date: 2023-10-05
* Github: https://github.com/istvan033
* Licenc: GNU GPL
*/

package View;

import java.util.ArrayList;

import modell.Employee;

public class MainConsole {
    public void showData(ArrayList<Employee> emplist){
        for (Employee employee : emplist) {
            System.out.println(employee.getNev() + " | " + employee.getTelepules() + " | " 
            + employee.getCim() + " | " + employee.getSzuletesiDatum() + " | " + employee.getFizetes());
        }
    }
}
