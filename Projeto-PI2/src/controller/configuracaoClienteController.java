package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class configuracaoClienteController extends ConectarDAO{
    
    String sql = "";
    PreparedStatement ps; 

    public configuracaoClienteController() {
        super(); 
    }       
    
    // Função para listar usuario
    public ResultSet buscarClientes(int idCliente){
        
        sql = "SELECT * FROM endereco JOIN cliente ON endereco.idEndereco = cliente.id_Endereco where cliente.idCliente='" + idCliente + "'";        
        
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
