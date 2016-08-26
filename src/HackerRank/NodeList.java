/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Michael
 */

public class Node {
    public int value;

    public Node(int value)
    {
        this.value = value;
    }
}

public class NodeList extends ArrayList<Node>
{
    ArrayList nlist = new ArrayList<Node>();
    public Node node;
    //Iterator it = nlist.iterator();
    
 
    public void add(Node n)
    {
        Iterator it = nlist.iterator();
        boolean sorted = false;
        while (it.hasNext() && !sorted)
        {
            Node s = (Node) it.next();
            if (s.value>n.value)
            {
                int index = nlist.indexOf(s);
                nlist.add(index, nlist);
            }
            
        }
    }
}
    
