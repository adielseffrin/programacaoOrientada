package com.provaD1;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MeiaTest{
   Meia m0;
   
    @Before
    public void setUp() {
        String marca = "";
        int uso = 5;
       
        m0 = new Meia(marca,uso);
    }
    
    @Test
	public final void testMeiaMarca() {
	    String marca = "Nike";
        int uso = 10;
        Meia t = new Meia(marca,uso);
        String expectedResult = marca;
        
        String actualResult = t.getMarca();
		 assertTrue("Nome salvo com construtor",
                actualResult.equals(expectedResult));
	}
	
	@Test
	public final void testMeiaUso() {
	    String marca = "Nike";
        int uso = 10;
        
        Meia t = new Meia(marca,uso);
        int expectedResult = uso;
        
		int actualResult = t.getLimiteDeUso();
		assertTrue("Limite de uso", actualResult == expectedResult);
	}
	

	@Test
	public final void testSetIsFuradaTrue() {
		m0.setFurada(true);
		boolean expectedResult = true;
		boolean actualResult = m0.isFurada();
		assertTrue("testSetIsFuradaTrue", actualResult == expectedResult);
	}
	
	@Test
	public final void testSetIsFuradaFalse() {
		m0.setFurada(false);
		boolean expectedResult = false;
		boolean actualResult = m0.isFurada();
		assertTrue("testSetIsFuradaFalse", actualResult == expectedResult);
	}

	

	@Test
	public final void testSetGetLimiteDeUso() {
		m0.setLimiteDeUso(3);
		int expectedResult = 3;
		int actualResult = m0.getLimiteDeUso();
		assertTrue("testSetGetLimiteDeUso", actualResult == expectedResult);
	}

	@Test
	public final void testSetGetDiasDeUso() {
		m0.setDiasDeUso(3);
		int expectedResult = 3;
		int actualResult = m0.getDiasDeUso();
		assertTrue("testSetGetDiasDeUso", actualResult == expectedResult);
	}


	@Test
	public final void testSetGetMarca() {
		m0.setMarca("Teste");
		String expectedResult = "Teste";
		String actualResult = m0.getMarca();
		assertTrue("testSetGetMarca", actualResult.equals(expectedResult));
	}
	
		@Test
	public final void testSetIsLimpaTrue() {
		m0.setFurada(true);
		boolean expectedResult = true;
		boolean actualResult = m0.isFurada();
		assertTrue("testSetIsFuradaTrue", actualResult == expectedResult);
	}
	
	@Test
	public final void testSetIsFuradaFalse02() {
		m0.setFurada(false);
		boolean expectedResult = false;
		boolean actualResult = m0.isFurada();
		assertTrue("testSetIsFuradaFalse02", actualResult == expectedResult);
	}



	@Test
	public final void testPodeUsar01() {
	    m0.setFurada(true);
	    m0.setLimpa(true);
	    boolean expectedResult = false;
	    boolean actualResult = m0.podeUsar();
	    assertTrue("testPodeUsar01", actualResult == expectedResult);
	}

    @Test
	public final void testPodeUsar02() {
	    m0.setFurada(false);
	    m0.setLimpa(true);
	    boolean expectedResult = true;
	    boolean actualResult = m0.podeUsar();
	    assertTrue("testPodeUsar02", actualResult == expectedResult);
	}

	@Test
	public final void testPodeUsar03() {
	    m0.setFurada(true);
	    m0.setLimpa(false);
	    boolean expectedResult = false;
	    boolean actualResult = m0.podeUsar();
	    assertTrue("testPodeUsar03", actualResult == expectedResult);
	}

    @Test
	public final void testPodeUsar04() {
	   m0.setFurada(false);
	    m0.setLimpa(false);
	    boolean expectedResult = false;
	    boolean actualResult = m0.podeUsar();
	    assertTrue("testPodeUsar04", actualResult == expectedResult);
	}
	
	 @Test
	public final void testPodeUsar05() {
	    m0.setFurada(false);
	    m0.setLimpa(true);
	    m0.setLimiteDeUso(0);
	    boolean expectedResult = false;
	    boolean actualResult = m0.podeUsar();
	    assertTrue("testPodeUsar05", actualResult == expectedResult);
	}


	@Test
	public final void testUsar01() {
		int expectedResult = 4;
		int actualResult = 0;
		try{
		    m0.usar();
		    actualResult = m0.getLimiteDeUso();
		}catch(Exception e){
		    //do nothing
		}
		
		assertTrue("testUsar01", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar02() {
	    int expectedResult = 2;
		int actualResult = 0;
		try{
		    m0.usar();
		    m0.usar();
		    m0.usar();
		    actualResult = m0.getLimiteDeUso();
		}catch(Exception e){
		    //do nothing
		}
		
		assertTrue("testUsar02", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar03() {
		m0.setLimiteDeUso(1);
	    int expectedResult = 0;
		int actualResult = -1;
		
		try{
		    m0.usar();
		    actualResult = m0.getLimiteDeUso();
		}catch(Exception e){
		    //do nothing
		}
		
		assertTrue("testUsar03", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar04() {
		m0.setLimiteDeUso(0);
	    String expectedResult = "Nao pode usar";
		String actualResult = "";
		
		try{
		    m0.usar();
		}catch(Exception e){
		    actualResult = e.getMessage();
		}
		
		assertTrue("testUsar04", actualResult.equals(expectedResult));
	}
	
	@Test
	public final void testUsar05() {
		m0.setLimiteDeUso(1);
	    boolean expectedResult = true;
		boolean actualResult = false;
		
		try{
		    m0.usar();
		}catch(Exception e){
		    //nothign
		}
		actualResult = m0.isFurada();
		
		assertTrue("testUsar05", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar06() {
	
	    boolean expectedResult = false;
		boolean actualResult = true;
		
		try{
		    m0.usar();
		    m0.usar();
		    m0.usar();
		}catch(Exception e){
		    //nothign
		}
		actualResult = m0.isLimpa();
		assertTrue("testUsar06", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar07() {
	    boolean expectedResult = true;
		boolean actualResult = false;
		
		try{
		    m0.usar();
		    
		}catch(Exception e){
		    //nothign
		}
		actualResult = m0.isLimpa();
		assertTrue("testUsar07", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar08() {
	
	    String expectedResult = "Nao pode usar";
		String actualResult = "";
		
		try{
		    m0.usar();
		    m0.usar();
		    m0.usar();
		    m0.usar();
		}catch(Exception e){
		    actualResult = e.getMessage();
		}
		
		assertTrue("testUsar08", actualResult.equals(expectedResult));
	}
	
	@Test
	public final void testUsar09() {
	
	   	String expectedResult = "Nao pode usar";
		String actualResult = "";
		
		try{
		    m0.setFurada(true);
		    m0.usar();
		}catch(Exception e){
		    actualResult = e.getMessage();
		}
		
		
		assertTrue("testUsar09", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar10() {
	
	   	String expectedResult = "Nao pode usar";
		String actualResult = "";
		
		try{
		    m0.setLimpa(false);
		    m0.usar();
		}catch(Exception e){
		    actualResult = e.getMessage();
		}
		
		
		assertTrue("testUsar10", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar11() {
		int expectedResult = 4;
		int actualResult = 0;
		try{
		    m0.usar();
		    actualResult = m0.getLimiteDeUso();
		}catch(Exception e){
		    //do nothing
		}
		
		assertTrue("testUsar11", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar12() {
	    int expectedResult = 2;
		int actualResult = 0;
		try{
		    m0.usar();
		    m0.usar();
		    m0.usar();
		    actualResult = m0.getLimiteDeUso();
		}catch(Exception e){
		    //do nothing
		}
		
		assertTrue("testUsar12", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar13() {
		m0.setLimiteDeUso(1);
	    int expectedResult = 0;
		int actualResult = -1;
		
		try{
		    m0.usar();
		    actualResult = m0.getLimiteDeUso();
		}catch(Exception e){
		    //do nothing
		}
		
		assertTrue("testUsar13", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar14() {
		m0.setLimiteDeUso(0);
	    String expectedResult = "Nao pode usar";
		String actualResult = "";
		
		try{
		    m0.usar();
		}catch(Exception e){
		    actualResult = e.getMessage();
		}
		
		assertTrue("testUsar14", actualResult.equals(expectedResult));
	}
	
	@Test
	public final void testLimpar01() {
	    boolean expectedResult = true;
		boolean actualResult = false;
		
		m0.setLimpa(false);
		m0.limpar();
		actualResult = m0.isLimpa();
		assertTrue("testLimpar01", actualResult == expectedResult);
	}
	
	@Test
	public final void testLimpar02() {
	    boolean expectedResult = true;
		boolean actualResult = false;
		
		m0.setLimpa(true);
		m0.limpar();
		actualResult = m0.isLimpa();
		assertTrue("testLimpar02", actualResult == expectedResult);
	}
	
	@Test
	public final void testLimpar03() {
	    int expectedResult = 0;
		int actualResult = -1;
		
		m0.setDiasDeUso(1);
		m0.limpar();
		actualResult = m0.getDiasDeUso();
		assertTrue("testLimpar03", actualResult == expectedResult);
	}
	
	
	
    
	
}