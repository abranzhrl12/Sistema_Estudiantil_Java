package ComboxPerzonalizado;

//import ComboxPerzonalizado.RComboBoxUI;
import javax.swing.JComboBox;

public class RComboBox<E> extends JComboBox<E> {

    public RComboBox() {
        setUI(new RComboBoxUI());
    }
}
