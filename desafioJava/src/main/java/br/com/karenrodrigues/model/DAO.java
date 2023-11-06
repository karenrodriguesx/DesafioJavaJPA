package br.com.karenrodrigues.model;

import br.com.karenrodrigues.conexoes.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class DAO {

    // --------- LISTA DE USUARIOS -----------
    public ArrayList<Usuario> listaUsuarios() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        ArrayList<Usuario> usuarios = null;

        try {
            usuarios = (ArrayList<Usuario>) session.createQuery("from Usuario", Usuario.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return usuarios;
    }

    // --------- INSERINDO USUARIOS -----------
    public void insert(Usuario usuario) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    // ---------- EDITANDO E ATUALIZANDO USUARIOS --------------
    public void select(Usuario usuario) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            // Carrega os detalhes do usuário no objeto passado como parâmetro.
            Usuario carregaUsuario = session.get(Usuario.class, usuario.getId());
            if (carregaUsuario != null) {
                // Define os atributos do usuário passado como parâmetro com os valores carregados do banco de dados.
                usuario.setNome(carregaUsuario.getNome());
                usuario.setProfissao(carregaUsuario.getProfissao());
                usuario.setIdade(carregaUsuario.getIdade());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }}

    public void update(Usuario usuario) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    // ----------- EXCLUINDO USUARIOS -----------
    public void delete(Usuario usuario) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


}
