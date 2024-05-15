/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telegram.qthpolices;

import com.sun.xml.rpc.spi.model.JavaInterface;
import com.sun.xml.rpc.spi.model.Port;
import com.sun.xml.rpc.spi.tools.Names;
import com.sun.xml.ws.api.ha.StickyFeature;
import com.sun.xml.ws.security.impl.policy.Issuer;
import com.sun.xml.wss.AliasSelector;

/**
 *
 * @author admin
 */
public abstract class IDClientIssueCommand extends Issuer implements  PixelDrawPipe, Names, StickyFeature, AliasSelector, Rule {

    @Override
    public String stubFor(Port port) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String interfaceImplClassName(JavaInterface ji) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
