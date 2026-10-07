package DAO;

import java.util.List;

import BD.Cnx;
import modelo.usuario;
import java.sql.*;
import java.util.ArrayList;


@Override
public int cadastrar(usuario usuario) {
    String sql = "INSERT INTO usuario (login, senha, admin) VALUES(?,?,?)";

    try (Connection conexao = Cnx.getConexao();
    PreparedStatement stmt = conexao;
    prepareStatement(sql);
    ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setLogin(rs.geString("login"));
            usuario.setSenha(rs.getString("senha");
            usuario.setAdmin(rs.getBoolean("admin"));
            lista.add(usuario);
        }

    }catch (SQLException e) {
        e.printStacktrace();
    }
    return lista;
}
