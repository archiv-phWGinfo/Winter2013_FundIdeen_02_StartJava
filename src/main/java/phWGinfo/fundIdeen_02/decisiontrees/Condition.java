package phWGinfo.fundIdeen_02.decisiontrees;

/**
 * Adapted from Jakob Griffith: https://github.com/kobaj/JavaDecisionTree
 */

class Condition
{
    public String name;

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    public int compareTo(Condition get_label)
    {
        return (get_label.name.compareTo(name));
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Condition other = (Condition) obj;
        if (name == null)
        {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        return true;
    }

    public Condition(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}

