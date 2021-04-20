package com.provaD1;
import static org.junit.Assert.*;
import org.junit.Test;

public class PessoaTest{
    @Test
    public final void verificaPessoaLimiteTenisNegativo() {
        int qt = -1;
        int qm = 1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        int resultado = pessoa.getMeusTenis().length;
        int esperado = 0; 
        
        assertTrue("Limite de tenis negativo", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaLimiteMeiasNegativo() {
        int qt = 1;
        int qm = -1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        int resultado = pessoa.getMinhasMeias().length;
        int esperado = 0; 
        
        assertTrue("Limite de meias negativo", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaLimiteTenisPositivo() {
        int qt = 1;
        int qm = 1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        int resultado = pessoa.getMeusTenis().length;
        int esperado = qt; 
        
        assertTrue("Limite de tenis positivo", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaLimiteMeiasPositivo() {
        int qt = 1;
        int qm = 1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        int resultado = pessoa.getMinhasMeias().length;
        int esperado = qm; 
        
        assertTrue("Limite de meias negativo", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaTenisCompradosInicial() {
        int qt = 1;
        int qm = 1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        int resultado = pessoa.getTenisComprados();
        int esperado = 0; 
        
        assertTrue("Quantidade inicial de tenis comprados", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaMeiasCompradasInicial() {
        int qt = 1;
        int qm = 1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        int resultado = pessoa.getMeiasCompradas();
        int esperado = 0; 
        
        assertTrue("Quantidade inicial de meias compradas", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarTenis01() {
        int qt = 1;
        int qm = 1;
        int qtde = 1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        boolean resultado = pessoa.possoComprarTodosTenis(qtde);
        boolean esperado = true; 
        
        assertTrue("Pode comprar tenis 01", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarTenis02() {
        int qt = 1;
        int qm = 1;
        int qtde = 2;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        boolean resultado = pessoa.possoComprarTodosTenis(qtde);
        boolean esperado = false; 
        
        assertTrue("Pode comprar tenis 02", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarTenis03() {
        int qt = 1;
        int qm = 1;
        int qtde = -1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        boolean resultado = pessoa.possoComprarTodosTenis(qtde);
        boolean esperado = false; 
        
        assertTrue("Pode comprar tenis 03", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarTenis04() {
        int qt = 5;
        int qm = 1;
        
        int comprar = 3;
        int qtde = 1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        pessoa.comprarAlgunsTenis(comprar);
        
        boolean resultado = pessoa.possoComprarTodosTenis(qtde);
        boolean esperado = true; 
        
        assertTrue("Pode comprar tenis 04", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarTenis05() {
        int qt = 5;
        int qm = 1;
        
        int comprar = 3;
        int qtde = 2;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        pessoa.comprarAlgunsTenis(comprar);
        
        boolean resultado = pessoa.possoComprarTodosTenis(qtde);
        boolean esperado = true; 
        
        assertTrue("Pode comprar tenis 05", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarTenis06() {
        int qt = 5;
        int qm = 1;
        
        int comprar = 3;
        int qtde = 5;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        pessoa.comprarAlgunsTenis(comprar);
        
        boolean resultado = pessoa.possoComprarTodosTenis(qtde);
        boolean esperado = false; 
        
        assertTrue("Pode comprar tenis 06", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarTenis07() {
        int qt = 5;
        int qm = 1;
        
        int comprarPrimeiro = 1;
        int comprarSegundo = 2;
        int qtde = 2;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        pessoa.comprarAlgunsTenis(comprarPrimeiro);
        pessoa.comprarAlgunsTenis(comprarSegundo);
        
        boolean resultado = pessoa.possoComprarTodosTenis(qtde);
        boolean esperado = true; 
        
        assertTrue("Pode comprar tenis 07", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarMeia01() {
        int qt = 1;
        int qm = 1;
        int qtde = 1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        boolean resultado = pessoa.possoComprarTodasMeias(qtde);
        boolean esperado = true; 
        
        assertTrue("Pode comprar meias 01", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarMeia02() {
        int qt = 1;
        int qm = 1;
        int qtde = 2;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        boolean resultado = pessoa.possoComprarTodasMeias(qtde);
        boolean esperado = false; 
        
        assertTrue("Pode comprar meias 02", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarMeias03() {
        int qt = 1;
        int qm = 1;
        int qtde = -1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        
        boolean resultado = pessoa.possoComprarTodasMeias(qtde);
        boolean esperado = false; 
        
        assertTrue("Pode comprar meias 03", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarMeias04() {
        int qt = 5;
        int qm = 1;
        
        int comprar = 3;
        int qtde = 1;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        pessoa.comprarAlgumasMeias(comprar);
        
        boolean resultado = pessoa.possoComprarTodasMeias(qtde);
        boolean esperado = true; 
        
        assertTrue("Pode comprar meias 04", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarMeias05() {
        int qt = 1;
        int qm = 5;
        
        int comprar = 3;
        int qtde = 2;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        pessoa.comprarAlgumasMeias(comprar);
        
        boolean resultado = pessoa.possoComprarTodasMeias(qtde);
        boolean esperado = true; 
        
        assertTrue("Pode comprar meias 05", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarMeias06() {
        int qt = 1;
        int qm = 5;
        
        int comprar = 3;
        int qtde = 5;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        pessoa.comprarAlgumasMeias(comprar);
        
        boolean resultado = pessoa.possoComprarTodasMeias(qtde);
        boolean esperado = false; 
        
        assertTrue("Pode comprar meias 06", resultado == esperado);
    }
    
    @Test
    public final void verificaPessoaPodeComprarMeias07() {
        int qt = 1;
        int qm = 5;
        
        int comprarPrimeiro = 1;
        int comprarSegundo = 2;
        int qtde = 2;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        pessoa.comprarAlgumasMeias(comprarPrimeiro);
        pessoa.comprarAlgumasMeias(comprarSegundo);
        
        boolean resultado = pessoa.possoComprarTodasMeias(qtde);
        boolean esperado = true; 
        
        assertTrue("Pode comprar meias 07", resultado == esperado);
    }
    
    @Test
    public final void verificaListarMeias() {
        int qt = 1;
        int qm = 5;
        
        int comprar = 3;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        pessoa.comprarAlgumasMeias(comprar);
        
        String listagem = pessoa.listarMeias();
        
        boolean resultado = true;
        boolean esperado = true;
        
        for (Meia meia : pessoa.getMinhasMeias()) {
            if (meia != null) {
                String texto = String.format("Marca: %s Furada: %s", meia.getMarca(), meia.isFurada() ? "S" : "N");
                
                if (!listagem.contains(texto)) {
                    resultado = false;
                    break;
                }
            }
            
        }
        
        assertTrue("Listagem de meias", resultado == esperado);
    }
    
    @Test
    public final void verificaCalculaTenis() {
        int qt = 5;
        int qm = 1;
        
        int comprar = 3;
        
        Pessoa pessoa = new Pessoa(qt,qm);
        pessoa.comprarAlgunsTenis(comprar);
        
        double resultado = pessoa.calculaTotalTenis();
        double esperado = 0;
        
        for (Tenis tenis : pessoa.getMeusTenis()) {
            if (tenis != null) {
                esperado += tenis.getValorAtual();
            }
        }
        
        assertTrue("Valor total de tenis", resultado == esperado);
    }
}