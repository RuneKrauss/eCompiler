package com.runekrauss.compiler;

/**
 * Holds some information about a type regarding functions and so on.
 *
 * @author Rune Krauss
 */
public class TypeInformation {
    /**
     * Id (for example the position in the symbol table regarding variables)
     */
    private int id;

    /**
     * Type of the field
     */
    private final DataType type;

    /**
     * Address of a type (structure) regarding references
     */
    private int address;

    public TypeInformation(DataType type) {
        this.type = type;
    }

    public TypeInformation(int id, DataType type) {
        this.id = id;
        this.type = type;
    }

    public TypeInformation(DataType type, int address) {
        this.type = type;
        this.address = address;
    }

    public TypeInformation(int id, DataType type, int address) {
        this.id = id;
        this.type = type;
        this.address = address;
    }

    public DataType getType() {
        return type;
    }

    public String getJvmType() {
        return type.getJvmType();
    }
}