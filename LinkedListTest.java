import junit.framework.TestCase;

public class LinkedListTest extends TestCase {
    
    public void testAdd(){

        LinkedList list = new LinkedList();

        //TEST add(String element)
        assertEquals(0,list.size());        
        list.add("zero");
        assertEquals(1,  list.size());
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        //TEST toString()
        assertEquals("[zero, one, two, three, four]", list.toString());        

        //TEST size()
        assertEquals(5, list.size());
        
        //TEST get()
        assertEquals(true, list.get(0).equals("zero"));
        assertEquals(true, list.get(1).equals("one"));
        assertEquals(true, list.get(2).equals("two"));
        assertEquals(true, list.get(3).equals("three"));
        assertEquals(true, list.get(4).equals("four"));

        //TEST remove(int index)
        list.remove(3);
        assertEquals("[zero, one, two, four]", list.toString());        
        assertEquals(4, list.size());
        
        //TEST get(int index)
        assertEquals(true, list.get(3).equals("four"));
        
        //TEST remove(int index)
        list.remove(1);
        assertEquals("[zero, two, four]", list.toString());        
        assertEquals(3, list.size());
        assertEquals(true, list.get(1).equals("two"));

        list.remove(0);
        assertEquals("[two, four]", list.toString());        
        assertEquals(2, list.size());

        list.remove(0);
        assertEquals(1,  list.size());
        assertEquals("[four]", list.toString());        
        
        //TEST add(int index, String element)        
        list.add(10, "ten");	//illegal index, should not add
        assertEquals("[four]", list.toString());        
        assertEquals(1, list.size());

        list.add(1, "ten");
        assertEquals("[four, ten]", list.toString());        
        assertEquals(2, list.size());
        assertEquals(true, list.get(1).equals("ten"));

        list.add(0, "eight");
        assertEquals("[eight, four, ten]", list.toString());        
        assertEquals(3, list.size());
        assertEquals(true, list.get(0).equals("eight"));
        
        list.add(0, "nine");
        assertEquals("[nine, eight, four, ten]", list.toString());
        assertEquals(4, list.size());
        assertEquals(true, list.get(0).equals("nine"));
        
        list.remove(2);
        assertEquals("[nine, eight, ten]", list.toString());
        assertEquals(3, list.size());
        assertEquals(true, list.get(2).equals("ten"));

        //TEST remove(String element)
        list.remove("ten");
        assertEquals("[nine, eight]", list.toString());
        assertEquals(2,  list.size());
        assertEquals(true, list.get(1).equals("eight"));
        
        //TEST clear()
        list.clear();
        assertEquals("[]", list.toString());
        assertEquals(0, list.size());

        list.add("A");
        list.add("B");
        list.add("A");
        assertEquals(3, list.size());
        list.remove("A");
        assertEquals(false, list.get(0).equals("test"));
        assertEquals("[B, A]", list.toString());
        
        //TEST set(int index, String element)
        list.set(0, "C");
        assertEquals("[C, A]", list.toString());
        assertEquals(2, list.size());
        
        list.set(0, "D");
        assertEquals(2, list.size());
        assertEquals("[D, A]", list.toString());
        assertEquals(true, list.get(0).equals("D"));
                
    }

}
