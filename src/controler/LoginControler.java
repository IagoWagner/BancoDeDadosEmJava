package controler;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.LoginView;
import view.MenuView;

/**
 *
 * @author Iago
 */
public class LoginControler {
    private LoginView view;

    public LoginControler(LoginView view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
 String usuario = view.getjTextFieldUsuario().getText();
 String senha = view.getjPasswordFieldSenha().getText();
 Usuario usuarioAutenticar = new Usuario(usuario, senha);
        
                
 Connection conexao = new Conexao().getConnection();
 UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
                
 boolean existe = usuarioDao.existePorUsuarioESenha(usuarioAutenticar);
                
 if(existe){
 MenuView telaDeMenu = new MenuView();
 telaDeMenu.setVisible(true);
 }else{
 JOptionPane.showMessageDialog(view, "Usuario ou Senha invalidos!");
             
    }
  }
}
