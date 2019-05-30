package com.accenture.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.accenture.api.enums.GeneroEnum;
import com.accenture.api.impl.Hijo;
import com.accenture.api.impl.Mama;
import com.accenture.api.impl.Papa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        
        //Se setean los objetos
        Papa papa = new Papa();
        papa.setNombre("Carlos");
        papa.setApellidos("Restrepo");
        papa.setGenero(GeneroEnum.Masculino);
        papa.setEdad(40L);
        System.out.println(papa.getNombre() +" "+papa.hacerTarea());
        
        Mama mama = new Mama();
        mama.setNombre("Maria");
        mama.setApellidos("Cardona");
        mama.setGenero(GeneroEnum.Femenino);
        mama.setEdad(38L);
        System.out.println(mama.getNombre()+" "+mama.hacerTarea());
        
        Hijo hijo = new Hijo();
        hijo.setNombre("Luis");
        hijo.setApellidos("Restrepo");
        hijo.setGenero(GeneroEnum.Masculino);
        System.out.println(hijo.getNombre()+" "+hijo.hacerTarea());
        
        //java.util.List, que es para crear listas de objetos
        List<Familia> familia = new ArrayList<Familia>();
        familia.add(papa);
        familia.add(mama);
        familia.add(hijo);
        System.out.println("Numero de miembros en la familia>>> " + familia.size()); 
        
        //java.math, clase útil para operaciones matemáticas
        Math.max(5, 10);
        System.out.println("Numero máximo>>> " + Math.max(5, 10)); 
        
        //java.io es para manejo de archivos
        File file = new File("data.txt");
        try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("nombre del archivo>>> " + file); 
        
        //java.lang, manejo de cadenas
        String text = new String("java.lang se importa automáticamente.");
        System.out.println(text);
    }
}
