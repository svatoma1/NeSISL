package main.java.cz.cvut.ida.nesisl.api.neuralNetwork;


import main.java.cz.cvut.ida.nesisl.api.data.Value;

import java.util.List;

/**
 * Created by EL on 9.2.2016.
 */
public interface Node {

    public Double getValue(Value value, List<Double> othersInGroup);

    public Double getValue(double x, List<Double> othersInGroup);

    public double getFirstDerivationAtX(double x, List<Double> othersInGroup);

    public double getFirstDerivationAtFunctionValue(double x, List<Double> othersInGroup);

    public Parameters getParameters();

    public String getName();

    public void setName(String name);

    public void setParameters(Parameters parameters);

    public ActivationFunction getActivationFunction();

    public Long getIndex();

    public void setModifiability(Boolean modifiable);

    public Boolean isModifiable();
}
