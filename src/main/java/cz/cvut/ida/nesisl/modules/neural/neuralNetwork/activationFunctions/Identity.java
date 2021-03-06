package main.java.cz.cvut.ida.nesisl.modules.neural.neuralNetwork.activationFunctions;

import main.java.cz.cvut.ida.nesisl.api.neuralNetwork.ActivationFunction;
import main.java.cz.cvut.ida.nesisl.api.neuralNetwork.Parameters;

import java.util.List;

/**
 * Created by EL on 9.2.2016.
 */
public class Identity  implements ActivationFunction {

    private static Identity identity = null;

    public static ActivationFunction getFunction(){
        if(null == identity){
            identity = new Identity();
        }
        return identity;
    }

    private Identity() {
    }

    @Override
    public double getValueAt(double x, Parameters parameter, List<Double> otherInGroups) {
        return x;
    }

    @Override
    public double getFirstDerivationAt(double x, Parameters parameter, List<Double> otherInGroups) {
        return 1;
    }

    @Override
    public double getFirstDerivationAtFunctionValue(double functionValue, Parameters parameter, List<Double> otherInGroups) {
        return 1;
    }

    @Override
    public String getName() {
        return "identity";
    }
}
