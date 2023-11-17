package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class configuracaoFuncionarioController extends ConectarDAO{
    
    String sql = "";
    PreparedStatement ps; 

    public configuracaoFuncionarioController() {
        super(); 
    }   
    
    // Função para listar usuario
    public ResultSet buscarUsuario(){
        
        sql = "SELECT * FROM endereco JOIN funcionarios ON endereco.idEndereco = funcionarios.id_Endereco;";
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareCall(sql);
            ResultSet result = ps.executeQuery();            
            
            return result;
            
        } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Não foi possível buscar os Funcionários!");
                return null;
        }
        
    }
    
    // Função para listar usuario
    public ResultSet buscarClientes(){
        
        sql = "SELECT * FROM endereco JOIN cliente ON endereco.idEndereco = cliente.id_Endereco;";
        
        try {
            
            PreparedStatement ps = (PreparedStatement) mycon.prepareCall(sql);
            ResultSet result = ps.executeQuery();            
            
            return result;
            
        } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Não foi possível buscar os Funcionários!");
                return null;
        }
        
    }
    
}
