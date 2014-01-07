/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import parser.jazzikParser;

/**
 *
 * @author pepo
 */
public class VarEntry {
    public String name;
    public int type;
    public String register;
    public boolean undefined = false;
    
    public VarEntry(int type, String name, String register) {
        this.type = type;
        this.name = name;
        this.register = register;
    }
    
    public VarEntry() {
        this.type = jazzikParser.INT_TYPE;
        this.name = "UNDEFINED";
        this.register = "%UNDEFINED";
        undefined = true;
    }
}
