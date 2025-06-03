import dao.VeiculoDAO;
import model.Veiculo;

import java.sql.SQLException;
import java.util.List;

public class BuscarTodos {
    public static void main(String[] args) throws SQLException {
        VeiculoDAO dao = new VeiculoDAO();
        List<Veiculo> veiculos = dao.listarTodos();
        for (Veiculo v : veiculos){
            System.out.println(v.getModelo() + " - " +
                    v.getPlaca());
        }
    }
}
