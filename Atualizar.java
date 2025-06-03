import dao.VeiculoDAO;
import model.TipoVeiculo;
import model.Veiculo;

import java.sql.SQLException;

public class Atualizar {
    public static void main(String[] args) {
        try {
            VeiculoDAO dao = new VeiculoDAO();
            dao.atualizarVeiculo(5, "GTX2525");
            System.out.println("Veiculo Atualizado");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
