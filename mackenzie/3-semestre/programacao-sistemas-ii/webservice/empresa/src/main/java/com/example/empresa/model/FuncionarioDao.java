package com.example.empresa.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.example.empresa.ConnectionFactory;

public class FuncionarioDao {

    private Connection connection;

    public FuncionarioDao() throws SQLException {
        this.connection = ConnectionFactory.getConexaoMySQL();
    }

    public void adiciona(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario VALUES(?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = this.connection.prepareStatement(sql);

        stmt.setLong(1, funcionario.getNumat());
        stmt.setString(2, funcionario.getNome());
        stmt.setDouble(3, funcionario.getSalario());
        stmt.setString(4, String.valueOf(funcionario.getSexo()));
        stmt.setInt(5, funcionario.getNdepto());
        stmt.setLong(6, funcionario.getNsuper());

        stmt.executeUpdate();

        stmt.close();
    }


    public ArrayList<Funcionario> getLista(){
         String sql = "SELECT * FROM funcionario";
         ArrayList<Funcionario> funcionarios = new ArrayList<>();

         try {
             PreparedStatement stmt = this.connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();

             while (rs.next()){
                 Funcionario funcionario = new Funcionario();
                 funcionario.setNumat(rs.getLong("numat"));
                 funcionario.setNome(rs.getString("nome"));
                 funcionario.setSalario(rs.getDouble("salario"));
                 funcionario.setSexo(rs.getString("sexo").charAt(0));
                 funcionario.setNdepto(rs.getInt("ndepto"));
                 funcionario.setNsuper(rs.getLong("nsuper"));

                 funcionarios.add(funcionario);
             }
             rs.close();
             stmt.close();

         } catch (SQLException e) {
             throw new RuntimeException(e);
         }

         return funcionarios;
    }
}
