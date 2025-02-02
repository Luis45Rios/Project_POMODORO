/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelos.Usuario;
import Servicios.UsuarioFileManagment;
/**
 *
 * @author luisr
 */
public class UsuarioController {
    private final UsuarioFileManagment usuarioService = new UsuarioFileManagment();

    public Boolean usuarioExiste(String username) {
        return usuarioService.userExists(username);
    }

    public void crearUsuario(String username, String password) {
        Usuario usuario = new Usuario(username, password);
        usuarioService.createUser(usuario);
    }

    public Boolean validarUsuario(String username, String password) {
        return usuarioService.validateUser(username, password);
    }
}
