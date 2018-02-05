package com.donaldjohn.junit;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InOrder;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MockITOTest
{
    @Test
    public void testMockedMethod()
    {
        Class1Mocked obj = mock(Class1Mocked.class);
        when(obj.hello("z3")).thenReturn("hello l4");

        String actual = obj.hello("z3");
        assertEquals("hello l4", actual);

        verify(obj).hello("z3");
    }

    @Test
    public void testMockMethodInOrder() {
        Class1Mocked objOther = mock(Class1Mocked.class);
        Class1Mocked objCn = mock(Class1Mocked.class);

        when(objOther.hello("z3")).thenReturn("hello l4");
        when(objCn.hello("z3")).thenReturn("hello 张三");

        String other = objOther.hello("z3");
        assertEquals("hello l4", other);
        String cn = objCn.hello("z3");
        assertEquals("hello 张三", cn);

        verify(objCn).show();
        InOrder inOrder = inOrder(objOther, objCn); //此行并不决定顺序，下面的两行才开始验证顺序
        inOrder.verify(objOther,times(2)).hello("z3");
        inOrder.verify(objCn).hello("z3");
    }

    @Test
    public void testSkipExpect() {
        Class1Mocked obj = mock(Class1Mocked.class);

        assertEquals(null, obj.hello("z3"));
        obj.show();

        verify(obj).hello("z3");
        verify(obj).show();
    }


    @Test
    public void testCallRealMethod () {
        Class1Mocked obj = mock(Class1Mocked.class);

        doCallRealMethod().when(obj).hello("z3");

        assertEquals("hello z3",obj.hello("z3"));
        assertEquals(null,obj.hello("l4"));
        obj.show();

        //verify(obj).hello("z3");
        //verify(obj).hello("l4");
        verify(obj).show();
    }

    @Test
    public void testSpy() {
        Class1Mocked obj = spy(new Class1Mocked());

        doNothing().when(obj).show();

        assertEquals("hello z3",obj.hello("z3"));
        obj.show();

        verify(obj).hello("z3");
        verify(obj).show();
    }
}
