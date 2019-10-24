/**
 * NiviService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nivi.project;

public interface NiviService extends javax.xml.rpc.Service {
    public java.lang.String getNiviAddress();

    public com.nivi.project.Nivi getNivi() throws javax.xml.rpc.ServiceException;

    public com.nivi.project.Nivi getNivi(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
