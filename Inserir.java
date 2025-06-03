import dao.VeiculoDAO;
import model.TipoVeiculo;
import model.Veiculo;

import java.sql.SQLException;

public class Inserir {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("GTX2533","GOL G3","Branco",
                TipoVeiculo.CARRO_PEQUENO);
        Veiculo v2 = new Veiculo("TXY2525","Hilux","Prata",
                TipoVeiculo.CARRO_GRANDE);
        Veiculo v3 = new Veiculo("TUV2020","CG 160","Preta",
                TipoVeiculo.MOTO);
        try {
            VeiculoDAO dao = new VeiculoDAO();
            dao.inserir(v3); //escolher o objeto a ser criado v1 ou v2 ou v3
            System.out.println("Veiculo Inserido");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
