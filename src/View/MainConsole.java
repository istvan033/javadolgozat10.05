

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
