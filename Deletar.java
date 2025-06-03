import dao.VeiculoDAO;

import java.sql.SQLException;

public class Deletar {
    public static void main(String[] args) throws SQLException {
        VeiculoDAO dao = new VeiculoDAO();
        dao.deletarVeiculo(3); //passar um ID válido
        System.out.println("Deletado com sucesso");
    }
}
