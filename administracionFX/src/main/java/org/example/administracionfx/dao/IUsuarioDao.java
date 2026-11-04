package org.example.administracionfx.dao;

import org.example.administracionfx.model.Usuario;

import java.util.List;

public interface IUsuarioDao {
    public Usuario save(Usuario entity);
    public List<Usuario> listAll();
    public Usuario findbyId(String id);
}
