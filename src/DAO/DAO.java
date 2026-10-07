package DAO;

import java.util.List;

public class DAO {

    public interface usuarioDAO<T> {
        int cadastrar (T objeto);
        int modificar (int id, T objeto);
        boolean excluir(int id);
        T mostrar (int id);
        List<T> listar();

    }
}
