package dao;

import model.TipoVeiculo;
import model.Veiculo;
import util.ConexaoUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {
    public void inserir(Veiculo veiculo) throws SQLException {
        String sql = "INSERT INTO veiculo (placa, modelo, cor,tipo)" +
                "VALUES (?,?,?,?)";
        Connection conn = ConexaoUtil.obterConexao();
        PreparedStatement stmt = conn.prepareStatement(sql);
        try{
            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setString(3, veiculo.getCor());
            stmt.setString(4, veiculo.getTipo().toString());
            stmt.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public List<Veiculo>listarTodos() throws SQLException {
        List<Veiculo> lista = new ArrayList<>();
        String sql = "SELECT * FROM veiculo";
        Connection conn = ConexaoUtil.obterConexao();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try{
            while (rs.next()){
                Veiculo v = new Veiculo(
                        rs.getString("placa"),
                        rs.getString("modelo"),
                        rs.getString("cor"),
                        TipoVeiculo.valueOf(rs.getString("tipo"))
                );
                lista.add(v);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return lista;
    }
    public static void deletarVeiculo(int id) throws SQLException {
        String sql = "DELETE FROM veiculo WHERE id = ?";
        Connection conn = ConexaoUtil.obterConexao();
        PreparedStatement stmt = conn.prepareStatement(sql);
        try {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void atualizarVeiculo(int id, String novaPlaca) throws SQLException {
        String sql = "UPDATE veiculo SET placa = ? WHERE id = ?";
        Connection conn = ConexaoUtil.obterConexao();
        PreparedStatement stmt = conn.prepareStatement(sql);
        try{
            stmt.setString(1, novaPlaca);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
