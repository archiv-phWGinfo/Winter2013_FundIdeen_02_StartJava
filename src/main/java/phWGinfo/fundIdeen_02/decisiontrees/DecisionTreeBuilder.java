package phWGinfo.fundIdeen_02.decisiontrees;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Adapted from Jakob Griffith: https://github.com/kobaj/JavaDecisionTree
 */
public class DecisionTreeBuilder {


    public static void main(String[] args)
    {
        System.out.println("begin");

        /* Simple example with rain prediction

        // conditions are possible values for attributes
        Condition gr_20 = new Condition(">20");
        Condition gr_50 = new Condition(">50");
        Condition gr_80 = new Condition(">80");
        Condition yes = new Condition("yes");
        Condition no = new Condition("no");
        Condition scattered = new Condition("scattered");
        Condition overcast = new Condition("overcast");

        // these attributes are overall, all possible values
        Attribute[] real_attributes = new Attribute[3];
        real_attributes[0] = new Attribute("%", gr_20, gr_50, gr_80);
        real_attributes[1] = new Attribute("rained", yes, no);
        real_attributes[2] = new Attribute("cloudy", scattered, no, overcast);

        // these attributes will be linked to examples
        Attribute[] example_attributes = new Attribute[6];
        example_attributes[0] = new Attribute("%", gr_20, gr_50, gr_80);
        example_attributes[1] = new Attribute("%", gr_20, gr_50, gr_80);
        example_attributes[2] = new Attribute("%", gr_20, gr_50, gr_80);
        example_attributes[3] = new Attribute("rained", yes, no);
        example_attributes[4] = new Attribute("cloudy", scattered, no, overcast);
        example_attributes[5] = new Attribute("rain_today", yes, no);

        // examples contain attributes and a value
        // here we will build a decision tree based on 'weather'
        Example[] examples = new Example[10];
        // these are in the order of the example attributes above
        examples[0] = new Example(example_attributes, gr_20, gr_50, no, no, scattered, yes);
        examples[1] = new Example(example_attributes, gr_20, no, no, no, no, no);
        examples[2] = new Example(example_attributes, no, no, no, yes, no, no);
        examples[3] = new Example(example_attributes, gr_20, gr_50, gr_80, no, overcast, yes);
        examples[4] = new Example(example_attributes, gr_20, gr_50, gr_80, yes, no, yes);
        examples[5] = new Example(example_attributes, gr_20, gr_50, gr_80, yes, overcast, yes);
        examples[6] = new Example(example_attributes, gr_20, no, no, yes, no, no);
        examples[7] = new Example(example_attributes, no, no, no, no, no, no);
        examples[8] = new Example(example_attributes, gr_20, no, no, no, overcast, yes);
        examples[9] = new Example(example_attributes, gr_20, no, no, no, scattered, yes);

        Attribute desired_attribute = example_attributes[example_attributes.length - 1]; // desired attribute is the last
        */

        // conditionas are possible values for attributes
        Condition yes = new Condition("yes");
        Condition no = new Condition("no");
        Condition some = new Condition("some");
        Condition full = new Condition("full");
        Condition none = new Condition("none");
        Condition $ = new Condition("$");
        Condition $$ = new Condition("$$");
        Condition $$$ = new Condition("$$$");
        Condition french = new Condition("french");
        Condition thai = new Condition("thai");
        Condition burger = new Condition("burger");
        Condition italian = new Condition("italian");
        Condition zero10 = new Condition("zero10");
        Condition ten30 = new Condition("ten30");
        Condition thirty60 = new Condition("thirty60");
        Condition sixtyup = new Condition("sixtyup");

// these attributes are overall, all possible values
        Attribute[] real_attributes = new Attribute[10];
        real_attributes[0] = new Attribute("alt", yes, no);
        real_attributes[1] = new Attribute("bar", yes, no);
        real_attributes[2] = new Attribute("fri", yes, no);
        real_attributes[3] = new Attribute("hun", yes, no);
        real_attributes[4] = new Attribute("pat", some, full, none);
        real_attributes[5] = new Attribute("price", $, $$, $$$);
        real_attributes[6] = new Attribute("rain", yes, no);
        real_attributes[7] = new Attribute("res", yes, no);
        real_attributes[8] = new Attribute("type", french, thai, burger, italian);
        real_attributes[9] = new Attribute("est", zero10, ten30, thirty60, sixtyup);

// these attributes will be linked to examples
        Attribute[] example_attributes = new Attribute[11];
        example_attributes[0] = new Attribute("alt", yes, no);
        example_attributes[1] = new Attribute("bar", yes, no);
        example_attributes[2] = new Attribute("fri", yes, no);
        example_attributes[3] = new Attribute("hun", yes, no);
        example_attributes[4] = new Attribute("pat", some, full, none);
        example_attributes[5] = new Attribute("price", $, $$, $$$);
        example_attributes[6] = new Attribute("rain", yes, no);
        example_attributes[7] = new Attribute("res", yes, no);
        example_attributes[8] = new Attribute("type", french, thai, burger, italian);
        example_attributes[9] = new Attribute("est", zero10, ten30, thirty60, sixtyup);
        example_attributes[10] = new Attribute("willwait", yes, no); // this is the one we are checking for in the tree

// examples contain attributes and a value
// here we will build a decision tree based on will wait for a seat at a restaurant
        Example[] examples = new Example[12];
// these are in the order of the example attributes above
        examples[0] = new Example(example_attributes, yes, no, no, yes, some, $$$, no, yes, french, zero10, yes);
        examples[1] = new Example(example_attributes, yes, no, no, yes, full, $, no, no, thai, thirty60, no);
        examples[2] = new Example(example_attributes, no, yes, no, no, some, $, no, no, burger, zero10, yes);
        examples[3] = new Example(example_attributes, yes, no, yes, yes, full, $, yes, no, thai, ten30, yes);
        examples[4] = new Example(example_attributes, yes, no, yes, no, full, $$$, no, yes, french, sixtyup, no);
        examples[5] = new Example(example_attributes, no, yes, no, yes, some, $$, yes, yes, italian, zero10, yes);
        examples[6] = new Example(example_attributes, no, yes, no, no, none, $, yes, no, burger, zero10, no);
        examples[7] = new Example(example_attributes, no, no, no, yes, some, $$, yes, yes, thai, zero10, yes);
        examples[8] = new Example(example_attributes, no, yes, yes, no, full, $, yes, no, burger, sixtyup, no);
        examples[9] = new Example(example_attributes, yes, yes, yes, yes, full, $$$, no, yes, italian, ten30, no);
        examples[10] = new Example(example_attributes, no, no, no, no, none, $, no, no, thai, zero10, no);
        examples[11] = new Example(example_attributes, yes, yes, yes, yes, full, $, no, no, burger, thirty60, yes);

        Node<?> tree = learnDecision(examples, real_attributes, yes, example_attributes[10]);

        System.out.println(tree.toString());
    }



    /**
     * Main learn loop that builds a decision tree
     *
     * @param examples list of input samples built from attributes and conditions
     * @param attributes list of all attributes to iterate over
     * @param default_label list of default condition for desired attribute to apply
     * @param desired_attribute the attribute to test for
     * @return
     */
    public static Node<?> learnDecision(Example[] examples, Attribute[] attributes, Condition default_label, Attribute desired_attribute)
    {
        // first base case
        if (examples.length == 0)
        {
            System.out.println("leaf 1");
            return new Node<Condition>(default_label, "first leaf ");
        }

        // second base case
        ArrayList<Example> example_copy = new ArrayList<Example>();
        for(Example e: examples)
            example_copy.add(e);
        Collections.sort(example_copy, new ExampleComparator());
        if(example_copy.get(0).get_label().equals(//
                example_copy.get(example_copy.size() - 1).get_label()))
        {
            System.out.println("leaf 2");
            return new Node<Condition>(examples[0].get_label(), "second leaf ");
        }

        // third base case
        if (attributes.length == 0)
        {
            Condition mode = mode(examples);
            System.out.println("leaf 3");
            return new Node<Condition>(mode, "third leaf ");
        }

        // recurse
        Attribute best = chooseBestAttribute(examples, attributes, desired_attribute);
        System.out.println("Finding a best: " + best.name);
        Node<Attribute> tree = new Node<Attribute>(best, "middle node ");
        Condition label = mode(examples);

        for (Condition c : best.possible_conditions)
        {
            Example[] example_i = best.satisfied(examples, c);
            Node<?> sub_tree = learnDecision(example_i, removeBest(attributes, best), label, desired_attribute);
            sub_tree.identifier += c.toString();

            tree.children.add(sub_tree);
        }

        return tree;
    }

    /**
     * Takes in an array of attributes and removes one.
     *
     * @param attributes array of attributes
     * @param best attribute to be removed
     * @return an array of attributes
     */
    public static Attribute[] removeBest(Attribute[] attributes, Attribute best)
    {
        ArrayList<Attribute> modified_attributes = new ArrayList<Attribute>();

        for (Attribute a : attributes)
        {
            if (!a.equals(best))
                modified_attributes.add(a);
        }

        return modified_attributes.toArray(new Attribute[0]);
    }

    /**
     * Calculates the mathematical mode condition (based on desired attribute, aka, last attribute in example).
     *
     * @param examples
     * @return condition that appears most often
     */
    public static Condition mode(Example[] examples)
    {
        Condition max_condition = null;
        int max_count = 0;

        // not the most efficient
        for (Example e : examples)
        {
            int local_count = 0;
            for (Example inner_e : examples)
            {
                if (inner_e.get_label().equals(e.get_label()))
                    local_count++;
            }

            if (local_count > max_count)
            {
                max_count = local_count;
                max_condition = e.get_label();
            }
        }

        System.out.println("mode value: " + max_condition);

        return max_condition;
    }

    /**
     * This will calculate the Gain and Remainder of attributes and picks the best to recurse over
     *
     * @param examples
     * @param attributes
     * @param desired_attribute
     * @return
     */
    public static Attribute chooseBestAttribute(Example[] examples, Attribute[] attributes, Attribute desired_attribute)
    {

        Attribute best = null;
        double smallest_double = Double.MAX_VALUE;

        for (Attribute a : attributes)
        {
            double remain = remain(examples, a, desired_attribute);
            if (best == null || remain < smallest_double)
            {
                smallest_double = remain;
                best = a;
            }
        }

        return best;
    }

    /**
     * Computes the remain,
     * sum(p/t * I(pi/ti, ni/ti));
     *
     * @param examples
     * @param attribute
     * @param desired_attribute
     * @return a double value for the remain
     */
    public static double remain(Example[] examples, Attribute attribute, Attribute desired_attribute)
    {
        System.out.println("\nrunning a rem for: " + attribute.name);

        double total_examples = examples.length;

        double total = 0;

        // figure out each attribute
        for (Condition major_condition : attribute.possible_conditions)
        {
            System.out.println("possible condition: " + major_condition.name);

            Example[] sub_examples = attribute.satisfied(examples, major_condition);
            Double total_sub_examples = (double) sub_examples.length;
            double precident = total_sub_examples / total_examples;

            System.out.println("Number satisfied: " + total_sub_examples);

            // figure out the igain
            ArrayList<Double> sub_example_count = new ArrayList<Double>();
            for (Condition c : desired_attribute.possible_conditions)
            {
                Example[] examples_c = desired_attribute.satisfied(sub_examples, c);
                System.out.println("number of passing sub examples: " + examples_c.length);
                sub_example_count.add(examples_c.length / total_sub_examples);
            }
            double i_gain = iGain(sub_example_count.toArray(new Double[0]));
            System.out.println("iGain: " + i_gain);

            double total_local_value = precident * i_gain;

            total += total_local_value;
        }

        System.out.println("got a result of: " + total);

        return total;
    }

    /**
     * computers the I value of remain
     * sum(-p(vi)logbase2ofp(vi))
     *
     * @param ds which comes from remain
     * @return double value of I
     */
    public static double iGain(Double... ds)
    {
        double final_value = 0;
        for (double d : ds)
        {
            if (d != 0.0)
                final_value += -d * Math.log(d) / Math.log(2.0);
        }

        if (Double.isNaN(final_value))
            final_value = 0;

        return final_value;
    }




}
