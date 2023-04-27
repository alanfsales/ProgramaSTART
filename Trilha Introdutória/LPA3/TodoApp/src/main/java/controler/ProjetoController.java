package controler;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Projeto;
import util.ConnectionFactory;

public class ProjetoController {
    
    public void salvar(Projeto projeto){
        
        String sql = "INSERT INTO projeto (nome, descricao, datacriacao, "
                + "dataatualizacao) VALUES (?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, projeto.getNome());
            statement.setString(2, projeto.getDescricao());
            statement.setDate(3, new Date(projeto.getDataCriacao().getTime()));
            statement.setDate(4, new Date(projeto.getDataatualizacao().getTime()));
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar o projeto " 
                    + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void atualizar(Projeto projeto){
        String sql = "UPDATE projeto SET nome = ?, descricao = ?, "
                + "datacriacao = ?, dataatualizacao = ? WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, projeto.getNome());
            statement.setString(2, projeto.getDescricao());
            statement.setDate(3, new Date(projeto.getDataCriacao().getTime()));
            statement.setDate(4, new Date(projeto.getDataatualizacao().getTime()));
            statement.setInt(5, projeto.getId());
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar o projeto " 
                    + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void removerById(int idProjeto){
       String sql = "DELETE FROM projeto WHERE id = ?";
       
       Connection connection = null;
       PreparedStatement statement = null;
       
        try {
           connection = ConnectionFactory.getConnection();
           statement = connection.prepareStatement(sql); 
           statement.setInt(1, idProjeto);
           statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar o projeto " 
                    + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public List<Projeto> listar(){
        String sql = "SELECT * FROM projeto";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Projeto> projetos = new ArrayList<>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                Projeto projeto = new Projeto();
                projeto.setId(resultSet.getInt("id"));
                projeto.setNome(resultSet.getString("nome"));
                projeto.setDescricao(resultSet.getString("descricao"));
                projeto.setDataCriacao(resultSet.getDate("datacriacao"));
                projeto.setDataatualizacao(resultSet.getDate("dataatualizacao"));
                   
                projetos.add(projeto);
            }
        }catch (SQLException ex) {
            throw new RuntimeException("Erro ao listar os projetos " 
                    + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        return projetos;
    }
}
