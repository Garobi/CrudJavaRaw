import componentes.FrameInicial;
import java.awt.Container;
import javax.swing.JFrame;


public class App extends JFrame {

  public App() {
    setSize(800, 600);
    setLayout(null);
    setResizable(false);
    Container Window = getContentPane();

    FrameInicial frame = new FrameInicial();
    Window.add(frame.telaInicial(Window));

    setVisible(true);
  }
  public static void main(String[] args) throws Exception { new App(); }
}
