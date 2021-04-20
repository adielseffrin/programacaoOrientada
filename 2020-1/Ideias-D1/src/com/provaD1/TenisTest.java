package com.provaD1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

class TenisTest {

	Tenis t0;
    Meia m0;
   
    @Before
    public void setUp() {
        String marca = "";
        int uso = 5;
        double valor = 99.99;
        t0 = new Tenis(marca,uso,valor);
        m0 = new Meia(marca,uso);
    }

    /**
     * Defines a rule that allows in-test specification of expected exception
     * types and messages.
     */
    @Rule
    public ExpectedException exception = ExpectedException.none();

    /**
     * Testing the Finder with non-negative numbers.
     */
   

    /************ Teste dos tenis ************/
    @Test
    public final void verificarNomeViaConstrutor() {

        // we define some test input and what result we would expect
        String marca = "Nike";
        int uso = 10;
        double valor = 299.99;
        String expectedResult = marca;

        // create a Finder object and call the findMaximumElement function
        // with test input
        Tenis t = new Tenis(marca,uso,valor);
        String actualResult = t.getMarca();

        // the actualResult value should be the same as the expectedResult value
        assertTrue("Nome salvo com construtor",
                actualResult.equals(expectedResult));
    }
    
    @Test
	public final void testTenisMarca() {
	    String marca = "Nike";
        int uso = 10;
        double valor = 299.99;
        Tenis t = new Tenis(marca,uso,valor);
        String expectedResult = marca;
        
        String actualResult = t.getMarca();
		 assertTrue("Nome salvo com construtor",
                actualResult.equals(expectedResult));
	}
	
	@Test
	public final void testTenisUso() {
	    String marca = "Nike";
        int uso = 10;
        double valor = 299.99;
        Tenis t = new Tenis(marca,uso,valor);
        int expectedResult = uso;
        
		int actualResult = t.getLimiteDeUso();
		assertTrue("Limite de uso", actualResult == expectedResult);
	}
	
	@Test
	public final void testTenisValor() {
	    String marca = "Nike";
        int uso = 10;
        double valor = 299.99;
        Tenis t = new Tenis(marca,uso,valor);
        double expectedResult = valor;
        
	    double actualResult = t.getValorAtual();
		assertTrue("Valor Inicial", actualResult == expectedResult);
	}


	@Test
	public final void testSetGetDepreciacao() {
		t0.setDepreciacao(1);
		double expectedResult = 1;
		double actualResult = t0.getDepreciacao();
		assertTrue("testSetGetDepreciacao", actualResult == expectedResult);
	}


	@Test
	public final void testSetIsFuradoTrue() {
		t0.setFurado(true);
		boolean expectedResult = true;
		boolean actualResult = t0.isFurado();
		assertTrue("testSetIsFuradoTrue", actualResult == expectedResult);
	}
	
	@Test
	public final void testSetIsFuradoFalse() {
		t0.setFurado(false);
		boolean expectedResult = false;
		boolean actualResult = t0.isFurado();
		assertTrue("testSetIsFuradoFalse", actualResult == expectedResult);
	}

	

	@Test
	public final void testSetGetLimiteDeUso() {
		t0.setLimiteDeUso(3);
		int expectedResult = 3;
		int actualResult = t0.getLimiteDeUso();
		assertTrue("testSetGetLimiteDeUso", actualResult == expectedResult);
	}



	@Test
	public final void testSetGetMarca() {
		t0.setMarca("Teste");
		String expectedResult = "Teste";
		String actualResult = t0.getMarca();
		assertTrue("testSetGetMarca", actualResult.equals(expectedResult));
	}



	@Test
	public final void testPodeUsar01() {
	    t0.setFurado(true);
	    t0.setLimiteDeUso(1);
	    boolean expectedResult = false;
	    boolean actualResult = t0.podeUsar();
	    assertTrue("testPodeUsar01", actualResult == expectedResult);
	}

    @Test
	public final void testPodeUsar02() {
	    t0.setFurado(false);
	    t0.setLimiteDeUso(1);
	    boolean expectedResult = true;
	    boolean actualResult = t0.podeUsar();
	    assertTrue("testPodeUsar02", actualResult == expectedResult);
	}

	@Test
	public final void testPodeUsar03() {
	    t0.setFurado(true);
	    t0.setLimiteDeUso(0);
	    boolean expectedResult = false;
	    boolean actualResult = t0.podeUsar();
	    assertTrue("testPodeUsar03", actualResult == expectedResult);
	}

    @Test
	public final void testPodeUsar04() {
	    t0.setFurado(false);
	    t0.setLimiteDeUso(0);
	    boolean expectedResult = false;
	    boolean actualResult = t0.podeUsar();
	    assertTrue("testPodeUsar04", actualResult == expectedResult);
	}


	@Test
	public final void testUsar01() {
		int expectedResult = 4;
		int actualResult = 0;
		try{
		    t0.usar(null);
		    actualResult = t0.getLimiteDeUso();
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
		    t0.usar(null);
		    t0.usar(null);
		    t0.usar(null);
		    actualResult = t0.getLimiteDeUso();
		}catch(Exception e){
		    //do nothing
		}
		
		assertTrue("testUsar02", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar03() {
		t0.setLimiteDeUso(1);
	    int expectedResult = 0;
		int actualResult = -1;
		
		try{
		    t0.usar(null);
		    actualResult = t0.getLimiteDeUso();
		}catch(Exception e){
		    //do nothing
		}
		
		assertTrue("testUsar03", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar04() {
		t0.setLimiteDeUso(0);
	    String expectedResult = "Nao pode usar";
		String actualResult = "";
		
		try{
		    t0.usar(null);
		}catch(Exception e){
		    actualResult = e.getMessage();
		}
		
		assertTrue("testUsar04", actualResult.equals(expectedResult));
	}
	
	@Test
	public final void testUsar05() {
		t0.setLimiteDeUso(1);
	    boolean expectedResult = true;
		boolean actualResult = false;
		
		try{
		    t0.usar(null);
		}catch(Exception e){
		    //nothign
		}
		actualResult = t0.isFurado();
		
		assertTrue("testUsar05", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar06() {
	
	    double expectedResult = 99.99 - 99.99/5;
		double actualResult = 0;
		
		try{
		    t0.usar(null);
		}catch(Exception e){
		    //nothign
		}
		actualResult = t0.getValorAtual();
		
		assertTrue("testUsar06", actualResult - expectedResult < 0.0001);
	}
	
	@Test
	public final void testUsar07() {
	
	    double expectedResult = 99.99 - (99.99/5 * 2);
		double actualResult = 0;
		
		try{
		    t0.usar(null);
		    t0.usar(null);
		}catch(Exception e){
		    //nothign
		}
		actualResult = t0.getValorAtual();
		
		assertTrue("testUsar07", actualResult - expectedResult < 0.0001);
	}
	
	@Test
	public final void testUsar08() {
	
	    double expectedResult = 0;
		double actualResult = -1;
		
		try{
		    t0.usar(null);
		    t0.usar(null);
		    t0.usar(null);
		    t0.usar(null);
		    t0.usar(null);
		}catch(Exception e){
		    //nothign
		}
		actualResult = t0.getValorAtual();
		
		assertTrue("testUsar08", actualResult - expectedResult < 0.0001);
	}
	
	@Test
	public final void testUsar09() {
	
	   	String expectedResult = "Nao pode usar";
		String actualResult = "";
		
		try{
		    m0.setFurada(true);
		    t0.usar(m0);
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
		    t0.usar(m0);
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
		    t0.usar(m0);
		    actualResult = t0.getLimiteDeUso();
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
		    t0.usar(m0);
		    t0.usar(m0);
		    t0.usar(m0);
		    actualResult = t0.getLimiteDeUso();
		}catch(Exception e){
		    //do nothing
		}
		
		assertTrue("testUsar12", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar13() {
		t0.setLimiteDeUso(1);
	    int expectedResult = 0;
		int actualResult = -1;
		
		try{
		    t0.usar(m0);
		    actualResult = t0.getLimiteDeUso();
		}catch(Exception e){
		    //do nothing
		}
		
		assertTrue("testUsar13", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar14() {
		t0.setLimiteDeUso(0);
	    String expectedResult = "Nao pode usar";
		String actualResult = "";
		
		try{
		    t0.usar(m0);
		}catch(Exception e){
		    actualResult = e.getMessage();
		}
		
		assertTrue("testUsar14", actualResult.equals(expectedResult));
	}
	
	@Test
	public final void testUsar15() {
		t0.setLimiteDeUso(1);
	    boolean expectedResult = true;
		boolean actualResult = false;
		
		try{
		    t0.usar(m0);
		}catch(Exception e){
		    //nothign
		}
		actualResult = t0.isFurado();
		
		assertTrue("testUsar15", actualResult == expectedResult);
	}
	
	@Test
	public final void testUsar16() {
	
	    double expectedResult = 99.99 - 99.99/5;
		double actualResult = 0;
		
		try{
		    t0.usar(m0);
		}catch(Exception e){
		    //nothign
		}
		actualResult = t0.getValorAtual();
		
		assertTrue("testUsar16", actualResult - expectedResult < 0.0001);
	}
	
	@Test
	public final void testUsar17() {
	
	    double expectedResult = 99.99 - (99.99/5 * 2);
		double actualResult = 0;
		
		try{
		    t0.usar(m0);
		    t0.usar(m0);
		}catch(Exception e){
		    //nothign
		}
		actualResult = t0.getValorAtual();
		
		assertTrue("testUsar17", actualResult - expectedResult < 0.0001);
	}
	
	@Test
	public final void testUsar18() {
	
	    double expectedResult = 0;
		double actualResult = -1;
		
		try{
		    t0.usar(m0);
		    t0.usar(m0);
		    m0.limpar();
		    t0.usar(m0);
		    t0.usar(m0);
		    m0.limpar();
		    t0.usar(m0);
		}catch(Exception e){
		    //
		}
		actualResult = t0.getValorAtual();
		
		
		assertTrue("testUsar18", actualResult - expectedResult < 0.0001);
	}


}
