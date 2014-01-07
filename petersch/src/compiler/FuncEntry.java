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
public class FuncEntry {
    public String name;
    public int type;
    public String signature;
    public boolean undefined = false;
    
    public FuncEntry(int type, String name, String signature) {
        this.type = type;
        this.name = name;
        this.signature = signature;
    }
    
    public FuncEntry() {
        this.type = jazzikParser.INT_TYPE;
        this.name = "UNDEFINED";
        this.signature = "";
        undefined = true;
    }
}

