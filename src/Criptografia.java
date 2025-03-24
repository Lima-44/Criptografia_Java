import javax.swing.JOptionPane;

public class Criptografia {
    public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog(null,"Digite uma sequência de caracteres: ");
    String letras = "";
    String ascii = "";
    String nova_ascii = "";
    String nova_letras = "";
    for (int i = 0; i < entrada.length(); i++){
        letras+= entrada.charAt(i)+" ";
        ascii+= (int) entrada.charAt(i)+" ";
        nova_ascii+=(int) entrada.charAt(i)+10+" ";
        nova_letras+=(char) (entrada.charAt(i)+10)+" ";
    }

    JOptionPane.showMessageDialog(null,"Letras:\n"+letras);
    JOptionPane.showMessageDialog(null,"ASCII:\n "+ascii);
    JOptionPane.showMessageDialog(null,"Nova ASCII:\n "+ nova_ascii);
    JOptionPane.showMessageDialog(null,"Nova letra:\n "+nova_letras);
}
}


