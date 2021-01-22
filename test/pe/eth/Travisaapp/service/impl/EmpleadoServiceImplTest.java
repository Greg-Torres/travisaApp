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
import pe.eth.Travisaapp.domain.Empleado;

/**
 *
 * @author CARLOS
 */
public class EmpleadoServiceImplTest {
    
    public EmpleadoServiceImplTest() {
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
     * Test of validar method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        String usuario = "";
        String clave = "";
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        Empleado expResult = null;
        Empleado result = instance.validar(usuario, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Empleado bean = null;
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        String expResult = "";
        String result = instance.insertar(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Empleado bean = null;
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        String expResult = "";
        String result = instance.update(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String codigo = "";
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        String expResult = "";
        String result = instance.delete(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leer method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testLeer() {
        System.out.println("leer");
        String codigo = "";
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        Empleado expResult = null;
        Empleado result = instance.leer(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerVarios method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testLeerVarios() {
        System.out.println("leerVarios");
        Empleado bean = null;
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        List<Empleado> expResult = null;
        List<Empleado> result = instance.leerVarios(bean);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rowToBean method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testRowToBean() throws Exception {
        System.out.println("rowToBean");
        ResultSet rs = null;
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        Empleado expResult = null;
        Empleado result = instance.rowToBean(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarporcodigo method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testBuscarporcodigo() {
        System.out.println("buscarporcodigo");
        String codigo = "";
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        Empleado expResult = null;
        Empleado result = instance.buscarporcodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarporNombre method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testBuscarporNombre() {
        System.out.println("buscarporNombre");
        String nombre = "";
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        ArrayList<Empleado> expResult = null;
        ArrayList<Empleado> result = instance.buscarporNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarDni method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testBuscarDni() {
        System.out.println("buscarDni");
        String codigo = "";
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        Empleado expResult = null;
        Empleado result = instance.buscarDni(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        ArrayList<Empleado> expResult = null;
        ArrayList<Empleado> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarCodigo method, of class EmpleadoServiceImpl.
     */
    @Test
    public void testBuscarCodigo() {
        System.out.println("BuscarCodigo");
        String codigo = "";
        EmpleadoServiceImpl instance = new EmpleadoServiceImpl();
        Empleado expResult = null;
        Empleado result = instance.BuscarCodigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
