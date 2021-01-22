/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.eth.Travisaapp.service.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pe.eth.Travisaapp.domain.Cliente;

/**
 *
 * @author CARLOS
 */
public class ClienteServiceImplTest {
    
    public ClienteServiceImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertar method, of class ClienteServiceImpl.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Cliente bean = null;
        ClienteServiceImpl instance = new ClienteServiceImpl();
        String expResult = "";
        String result = instance.insertar(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ClienteServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Cliente bean = null;
        ClienteServiceImpl instance = new ClienteServiceImpl();
        String expResult = "";
        String result = instance.update(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ClienteServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String codigo = "";
        ClienteServiceImpl instance = new ClienteServiceImpl();
        String expResult = "";
        String result = instance.delete(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarporcodigo method, of class ClienteServiceImpl.
     */
    @Test
    public void testBuscarporcodigo() {
        System.out.println("buscarporcodigo");
        String codigo = "";
        ClienteServiceImpl instance = new ClienteServiceImpl();
        Cliente expResult = null;
        Cliente result = instance.buscarporcodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarporNombre method, of class ClienteServiceImpl.
     */
    @Test
    public void testBuscarporNombre() {
        System.out.println("buscarporNombre");
        String nombre = "";
        ClienteServiceImpl instance = new ClienteServiceImpl();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.buscarporNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leer method, of class ClienteServiceImpl.
     */
    @Test
    public void testLeer() {
        System.out.println("leer");
        String codigo = "";
        ClienteServiceImpl instance = new ClienteServiceImpl();
        Cliente expResult = null;
        Cliente result = instance.leer(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerVarios method, of class ClienteServiceImpl.
     */
    @Test
    public void testLeerVarios() {
        System.out.println("leerVarios");
        Cliente bean = null;
        ClienteServiceImpl instance = new ClienteServiceImpl();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.leerVarios(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rowToBean method, of class ClienteServiceImpl.
     */
    @Test
    public void testRowToBean() throws Exception {
        System.out.println("rowToBean");
        ResultSet rs = null;
        ClienteServiceImpl instance = new ClienteServiceImpl();
        Cliente expResult = null;
        Cliente result = instance.rowToBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarDni method, of class ClienteServiceImpl.
     */
    @Test
    public void testBuscarDni() {
        System.out.println("buscarDni");
        String codigo = "";
        ClienteServiceImpl instance = new ClienteServiceImpl();
        Cliente expResult = null;
        Cliente result = instance.buscarDni(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class ClienteServiceImpl.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        ClienteServiceImpl instance = new ClienteServiceImpl();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarCodigo method, of class ClienteServiceImpl.
     */
    @Test
    public void testBuscarCodigo() {
        System.out.println("BuscarCodigo");
        String codigo = "";
        ClienteServiceImpl instance = new ClienteServiceImpl();
        Cliente expResult = null;
        Cliente result = instance.BuscarCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
