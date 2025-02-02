/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelos.Usuario;

/**
 *
 * @author luisr
 */
public class UsuarioFileManagment {
    private static final String FILE_NAME = "users.txt";

    public Boolean userExists(String username) {
        String regex = username + "\\|.*";
        return FileManagment.searchOneInFile(FILE_NAME, regex) != null;
    }

    public void createUser(Usuario usuario) {
        FileManagment.createFile(FILE_NAME);
        if (!userExists(usuario.getUsername())) {
            String content = usuario.getUsername() + "|" + usuario.getPassword() + ";";
            FileManagment.writeFile(FILE_NAME, content);
        }
    }

    public Boolean validateUser(String username, String password) {
        String regex = username + "\\|" + password + ";";
        return FileManagment.searchOneInFile(FILE_NAME, regex) != null;
    }

}
