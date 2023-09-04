/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author u04127224290
 */
public class ListaUsuarios {
    public static void main(String[] args) {
    List lista = new ArrayList();
    
    Usuarios usuarios = new Usuarios();
    usuarios.setIdusuario(1);
    usuarios.setNome("Marcos");
    usuarios.setApelido("MPV");
    
    lista.add( usuarios );
    
    lista.add(new Usuarios(2, "Jose", "jj" ));
    lista.add(new Usuarios(0, "Zamberlan", "zambi" ));
    
        Collections.sort(lista);
        for (Object usuarios1 : lista) {
            System.out.println(((Usuarios)usuarios1).getNome());
        }
    }
};
