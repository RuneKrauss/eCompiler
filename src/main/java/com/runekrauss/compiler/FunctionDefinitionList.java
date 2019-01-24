package com.runekrauss.compiler;

import java.util.ArrayList;
import java.util.List;

/**
 * This list as a data structure contains the defined functions and is used to check whether a function has been
 * defined twice with regard to the signature.
 *
 * @author Rune Krauss
 */
public class FunctionDefinitionList {
    /**
     * Contains all functions from the respective program.
     */
    private List<FunctionDefinition> functionDefinitions;

    FunctionDefinitionList() {
        functionDefinitions = new ArrayList<>();
    }

    /**
     * Is there already a function with this signature in this list?
     *
     * @param functionId Name of this function
     * @param parameters Parameters of this function
     * @return Status whether the list already contains this function
     */
    public boolean contains(String functionId, TypeInformation[] parameters) {
        for (FunctionDefinition functionDefinition : functionDefinitions) {
            // Get parameters of the current function in the list
            TypeInformation[] functionParameters = functionDefinition.getParameters();
            // The function may only exist if the number of parameters and the function name match
            if (functionParameters.length == parameters.length && functionId.equals(functionDefinition.getFunctionId())) {
                if (functionParameters.length == 0 && parameters.length == 0)
                    // There are no parameters available => The function signatures are the same
                    return true;
                boolean match = true;
                // Look more closely at the individual data types of the parameters
                for (int i = 0; i < functionParameters.length; ++i)
                    if (functionParameters[i].getType() != parameters[i].getType()) {
                        // Data types do not match => function signatures cannot be the same
                        match = false;
                        break;
                    }
                if (match)
                    return true;
            }
        }
        return false;
    }

    /**
     * Adds a method definition to this list.
     *
     * @param type Type of the function
     * @param functionId Name of this function
     * @param parameters Parameters of the function
     */
    public void add(TypeInformation type, String functionId, TypeInformation[] parameters) {
        functionDefinitions.add(new FunctionDefinition(type, functionId, parameters));
    }
}
