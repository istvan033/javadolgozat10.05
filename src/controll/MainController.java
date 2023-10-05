

package controll;

import java.io.FileNotFoundException;

import View.MainConsole;
import modell.Filereader;

public class MainController {
    public MainController() throws FileNotFoundException{
       Filereader fr = new Filereader();
       fr.loadData();
       new MainConsole().showData(fr.getEmplist());
    }
}
