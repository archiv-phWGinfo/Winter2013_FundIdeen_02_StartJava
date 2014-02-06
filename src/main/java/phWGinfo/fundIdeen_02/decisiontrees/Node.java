package phWGinfo.fundIdeen_02.decisiontrees;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapted from Jakob Griffith: https://github.com/kobaj/JavaDecisionTree
 */
class Node<T>
{
    public String identifier;

    public T data;
    public Node<?> parent = null;
    public List<Node<?>> children;

    public Node(T data, String ident)
    {
        this.identifier = ident;
        this.data = data;
        children = new ArrayList<Node<?>>();
    }

    public Node(T data)
    {
        this(data, "unset");
    }

    public String toString(String tabs)
    {
        String childs = "";
        for (Node<?> n : children)
            childs += n.toString(tabs + "-");

        if (childs.equals(""))
            childs = "no children.";

        return "\n" + tabs + "Node: " + identifier + " value: " + data.toString() + " children: " + childs;
    }

    @Override
    public String toString()
    {
        return toString("");
    }
}
