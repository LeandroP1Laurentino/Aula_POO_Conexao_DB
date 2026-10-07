import java.sql.Connection;
import java.sql.SQLException;
import BD.Cnx;

public class Main {
    public static void main(String[] args) {
        System.out.println("TESTANDO CONEXÃO COM O BANCO DE DADOS");

        try(Connection conexao = Cnx.getConexao()){
            if (conexao != null && !conexao.isClosed()){
                System.out.println("Conexão estabelecida com sucesso!");
            }
        } catch (SQLException e) {
            System.err.println("Falha no conectar ao banco de dados: ");
            e.printStackTrace();
        }

    }}