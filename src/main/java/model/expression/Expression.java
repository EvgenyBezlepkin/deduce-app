package model.expression;

import java.util.Collection;


public interface Expression {

    boolean calculate(Collection<String> knownFacts);
}