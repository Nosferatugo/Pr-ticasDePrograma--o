/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.praticas.business;

import br.com.praticas.fachada.Facade;
import br.com.praticas.interfac.IAgendaBusiness;
import br.com.praticas.modelobeans.BeansAgenda;
import br.com.praticas.util.MensagensUtil;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Nathan S.
 */
public class AgendaBusiness implements IAgendaBusiness{
    
       //----------------------------------------------------
    // ACESAR TODOS OS METODOS ATRAVEZ DA FACHADA. 
    // O METODO GETINSTANCE() FAZ COM QUE TODA VEZ QUE FOR ALTERAR ALGO NO BANCO
    // O BANCO É ESTARTADO SOMENTE UMA VEZ
        private Facade fachada = Facade.getInstance();
    
    
 private  BeansAgenda agenda = new BeansAgenda();
    
    
    public void slavarNaAgenda(String NomePac, String NomeMed, String Turno, String Motivo, Date Data, String Status) {
      agenda.setNomePac(NomePac);
        agenda.setNomeMed(NomeMed);
        agenda.setTurno(Turno);
        agenda.setMotivo(Motivo);
        agenda.setData(Data);
        agenda.setStatus(Status);
        
   
       fachada.SalvarNaAgenda(agenda);
       //  UTILIZAR O ARQUIVO DE CONFIGURAÇÃO DE MENSAGEM 
        
         JOptionPane.showMessageDialog(null, MensagensUtil.getValor(MensagensUtil.MSG_SUCESSO_SALVAR, "  "));
          
    
       
       // PRONTO ASSIM TODA ESSA INFORMAÇÃO SAIU DA TELA E FICA NO BUSSINESS
    }

    @Override
    public void salvarNaAgenda(String NomePac, String NomeMed, String Turno, String Motivo, Date Data, String Status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscaMedico(String nomeMedico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscaPaciente(String nomePaciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
