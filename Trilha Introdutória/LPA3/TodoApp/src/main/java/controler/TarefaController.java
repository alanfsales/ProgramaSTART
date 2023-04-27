package controler;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Tarefa;
import util.ConnectionFactory;
        
public class TarefaController {

    public void salvar(Tarefa tarefa){
        String sql = "INSERT INTO tarefa (idprojeto, nome, descricao, concluida, "
                + "observacoes, prazo, datacriacao, dataatualizacao) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
         try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, tarefa.getIdProjeto());
            statement.setString(2, tarefa.getNome());
            statement.setString(3, tarefa.getDescricao());
            statement.setBoolean(4, tarefa.isConcluida());
            statement.setString(5, tarefa.getObservacoes());
            statement.setDate(6, new Date(tarefa.getPrazo().getTime()));
            statement.setDate(7, new Date(tarefa.getDataCriacao().getTime()));
            statement.setDate(8, new Date(tarefa.getDataAtualizacao().getTime()));        
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar a tarefa " 
                    + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void atualizar(Tarefa tarefa){
        String sql = "UPDATE tarefa SET idprojeto = ?, nome = ?, descricao = ?, "
                + "concluida = ?, observacoes = ?, prazo = ?, datacriacao = ?, "
                + "dataatualizacao = ? WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, tarefa.getIdProjeto());
            statement.setString(2, tarefa.getNome());
            statement.setString(3, tarefa.getDescricao());
            statement.setBoolean(4, tarefa.isConcluida());
            statement.setString(5, tarefa.getObservacoes());
            statement.setDate(6, new Date(tarefa.getPrazo().getTime()));
            statement.setDate(7, new Date(tarefa.getDataCriacao().getTime()));
            statement.setDate(8, new Date(tarefa.getDataAtualizacao().getTime()));
            statement.setInt(9, tarefa.getId());
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa " 
                    + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void removerById(int idTarefa){
        String sql = "DELETE FROM tarefa WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idTarefa);
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar a tarefa " 
                    + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public List<Tarefa> listar(int idProjeto){
        String sql = "SELECT * FROM tarefa WHERE idprojeto = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Tarefa> tarefas = new ArrayList<>();
        
         try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idProjeto);
            resultSet = statement.executeQuery();
            
             while (resultSet.next()) {                 
                 Tarefa tarefa = new Tarefa();
                 tarefa.setId(resultSet.getInt("id"));
                 tarefa.setIdProjeto(resultSet.getInt("idprojeto"));
                 tarefa.setNome(resultSet.getString("nome"));
                 tarefa.setDescricao(resultSet.getString("descricao"));
                 tarefa.setConcluida(resultSet.getBoolean("concluida"));
                 tarefa.setObservacoes(resultSet.getString("observacoes"));
                 tarefa.setPrazo(resultSet.getDate("prazo"));
                 tarefa.setDataCriacao(resultSet.getDate("datacriacao"));
                 tarefa.setDataAtualizacao(resultSet.getDate("dataatualizacao"));
                 
                 tarefas.add(tarefa);
             }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao listar as tarefas " 
                    + ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        } 
        return tarefas;
    }
}
