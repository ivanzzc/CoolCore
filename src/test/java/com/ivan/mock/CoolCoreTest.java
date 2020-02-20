package com.ivan.mock;

import junit.framework.TestCase;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CoolCoreTest extends TestCase {

    private HttpServletRequest request;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        request=mock(HttpServletRequest.class);
        when(request.getParameter("name")).thenReturn("Ivan");
        when(request.getParameter("message")).thenReturn("Hello Mockito!");
    }

    @Test
    public void testProcess(){
        CoolCore coolCore=new CoolCore();
        String result=coolCore.process(request);
        assertEquals("Ivan:Hello Mockito!",result);
    }
}
