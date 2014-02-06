package phWGinfo.fundIdeen_02.decisiontrees;

import java.util.Comparator;

/**
 * Adapted from Jakob Griffith: https://github.com/kobaj/JavaDecisionTree
 */
class ExampleComparator implements Comparator<Example>
{
    public int compare(Example o1, Example o2)
    {
        return (o1.get_label()).compareTo(o2.get_label());
    }
}
