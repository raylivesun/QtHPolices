/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package valueprop.qthpolices;

import java.io.Reader;
import java.io.Writer;
import java.lang.annotation.Annotation;
import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngineFactory;
import static org.junit.jupiter.api.Assertions.fail;

/**
 *
 * @author admin
 */
public class IDClientFriendInterationIT {
    
    public IDClientFriendInterationIT() {
    }

    /**
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of setBindings method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSetBindings() {
        System.out.println("setBindings");
        Bindings bndngs = null;
        int i = 0;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.setBindings(bndngs, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBindings method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetBindings() {
        System.out.println("getBindings");
        int i = 0;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Bindings expResult = null;
        Bindings result = instance.getBindings(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAttribute method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSetAttribute() {
        System.out.println("setAttribute");
        String string = "";
        Object o = null;
        int i = 0;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.setAttribute(string, o, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAttribute method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetAttribute_String_int() {
        System.out.println("getAttribute");
        String string = "";
        int i = 0;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.getAttribute(string, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAttribute method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testRemoveAttribute() {
        System.out.println("removeAttribute");
        String string = "";
        int i = 0;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.removeAttribute(string, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAttribute method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetAttribute_String() {
        System.out.println("getAttribute");
        String string = "";
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.getAttribute(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAttributesScope method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetAttributesScope() {
        System.out.println("getAttributesScope");
        String string = "";
        IDClientFriendInteration instance = new IDClientFriendInteration();
        int expResult = 0;
        int result = instance.getAttributesScope(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWriter method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetWriter() {
        System.out.println("getWriter");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Writer expResult = null;
        Writer result = instance.getWriter();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErrorWriter method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetErrorWriter() {
        System.out.println("getErrorWriter");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Writer expResult = null;
        Writer result = instance.getErrorWriter();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWriter method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSetWriter() {
        System.out.println("setWriter");
        Writer writer = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.setWriter(writer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setErrorWriter method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSetErrorWriter() {
        System.out.println("setErrorWriter");
        Writer writer = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.setErrorWriter(writer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReader method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetReader() {
        System.out.println("getReader");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Reader expResult = null;
        Reader result = instance.getReader();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReader method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSetReader() {
        System.out.println("setReader");
        Reader reader = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.setReader(reader);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScopes method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetScopes() {
        System.out.println("getScopes");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testEval_String_ScriptContext() {
        System.out.println("eval");
        String string = "";
        ScriptContext sc = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testEval_Reader_ScriptContext() {
        System.out.println("eval");
        Reader reader = null;
        ScriptContext sc = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testEval_String() {
        System.out.println("eval");
        String string = "";
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testEval_Reader()  {
        System.out.println("eval");
        Reader reader = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testEval_String_Bindings() {
        System.out.println("eval");
        String string = "";
        Bindings bndngs = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testEval_Reader_Bindings() {
        System.out.println("eval");
        Reader reader = null;
        Bindings bndngs = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testPut() {
        System.out.println("put");
        String string = "";
        Object o = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.put(string, o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGet_String() {
        System.out.println("get");
        String string = "";
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.get(string);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBindings method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testCreateBindings() {
        System.out.println("createBindings");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Bindings expResult = null;
        Bindings result = instance.createBindings();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContext method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetContext() {
        System.out.println("getContext");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        ScriptContext expResult = null;
        ScriptContext result = instance.getContext();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContext method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSetContext() {
        System.out.println("setContext");
        ScriptContext sc = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.setContext(sc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFactory method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetFactory() {
        System.out.println("getFactory");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        ScriptEngineFactory expResult = null;
        ScriptEngineFactory result = instance.getFactory();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMimeType method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetMimeType() {
        System.out.println("getMimeType");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        String expResult = "";
        String result = instance.getMimeType();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMimeType method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSetMimeType() {
        System.out.println("setMimeType");
        String string = "";
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.setMimeType(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEncoding method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetEncoding() {
        System.out.println("getEncoding");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        String expResult = "";
        String result = instance.getEncoding();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEncoding method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSetEncoding() {
        System.out.println("setEncoding");
        String string = "";
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.setEncoding(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContent method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetContent() {
        System.out.println("getContent");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetId() {
        System.out.println("getId");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        String expResult = "";
        String result = instance.getId();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSetId() {
        System.out.println("setId");
        String string = "";
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.setId(string);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetValue() {
        System.out.println("getValue");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        String expResult = "";
        String result = instance.getValue();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamespace method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetNamespace() {
        System.out.println("getNamespace");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        String expResult = "";
        String result = instance.getNamespace();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScope method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetScope() {
        System.out.println("getScope");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Class<? extends Annotation> expResult = null;
        Class<? extends Annotation> result = instance.getScope();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGet_Contextual_CreationalContext() {
        System.out.println("get");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGet_Contextual() {
        System.out.println("get");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isActive method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testIsActive() {
        System.out.println("isActive");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        boolean result = instance.isActive();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSize() {
        System.out.println("size");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        int expResult = 0;
        int result = instance.size();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        boolean result = instance.contains(o);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testIterator() {
        System.out.println("iterator");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testToArray_0args() {
        System.out.println("toArray");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testToArray_ObjectArr() {
        System.out.println("toArray");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testAdd_Object() {
        System.out.println("add");
        Object e = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        boolean result = instance.add(e);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testRemove_Object() {
        System.out.println("remove");
        Object o = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        boolean result = instance.remove(o);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsAll method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testContainsAll() {
        System.out.println("containsAll");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testAddAll_Collection() {
        System.out.println("addAll");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testAddAll_int_Collection() {
        System.out.println("addAll");
        int i = 0;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testRetainAll() {
        System.out.println("retainAll");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of replaceAll method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testReplaceAll() {
        System.out.println("replaceAll");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSort() {
        System.out.println("sort");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testClear() {
        System.out.println("clear");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGet_int() {
        System.out.println("get");
        int i = 0;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.get(i);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSet() {
        System.out.println("set");
        int i = 0;
        Object e = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.set(i, e);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testAdd_int_Object() {
        System.out.println("add");
        int i = 0;
        Object e = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        instance.add(i, e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testRemove_int() {
        System.out.println("remove");
        int i = 0;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.remove(i);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object o = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        int expResult = 0;
        int result = instance.indexOf(o);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastIndexOf method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testLastIndexOf() {
        System.out.println("lastIndexOf");
        Object o = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        int expResult = 0;
        int result = instance.lastIndexOf(o);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listIterator method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testListIterator_0args() {
        System.out.println("listIterator");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listIterator method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testListIterator_int() {
        System.out.println("listIterator");
        int i = 0;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subList method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSubList() {
        System.out.println("subList");
        int i = 0;
        int i1 = 0;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of spliterator method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testSpliterator() {
        System.out.println("spliterator");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object e = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testAddLast() {
        System.out.println("addLast");
        Object e = null;
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetFirst() {
        System.out.println("getFirst");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.getFirst();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testGetLast() {
        System.out.println("getLast");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.getLast();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.removeFirst();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        Object expResult = null;
        Object result = instance.removeLast();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reversed method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testReversed() {
        System.out.println("reversed");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testToArray_IntFunction() {
        System.out.println("toArray");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeIf method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testRemoveIf() {
        System.out.println("removeIf");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        boolean expResult = false;
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stream method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testStream() {
        System.out.println("stream");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parallelStream method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testParallelStream() {
        System.out.println("parallelStream");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of forEach method, of class IDClientFriendInteration.
     */
    @org.junit.jupiter.api.Test
    public void testForEach() {
        System.out.println("forEach");
        IDClientFriendInteration instance = new IDClientFriendInteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
