package org.example.administracionfx.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.example.administracionfx.model.Usuario;

import java.util.List;

public class UsuarioDao implements IUsuarioDao {
    @Override
    public Usuario save(Usuario entity) {
        return null;
    }

    @Override
    public List<Usuario> listAll() {
        EntityManager em = EntityManagerAdmin.getEntityManager();
        try {
            Query query = em.createQuery("select u from Usuario u"
                    , Usuario.class);
            return query.getResultList();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            em.close();
        }
        return List.of();
    }

    @Override
    public Usuario findbyId(String id) {
        return null;
    }
}
