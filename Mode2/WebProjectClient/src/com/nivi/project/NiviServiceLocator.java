/**
 * NiviServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.nivi.project;

public class NiviServiceLocator extends org.apache.axis.client.Service implements com.nivi.project.NiviService {

    public NiviServiceLocator() {
    }


    public NiviServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NiviServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Nivi
    private java.lang.String Nivi_address = "http://192.168.1.24:8282/WebProject/services/Nivi";

    public java.lang.String getNiviAddress() {
        return Nivi_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NiviWSDDServiceName = "Nivi";

    public java.lang.String getNiviWSDDServiceName() {
        return NiviWSDDServiceName;
    }

    public void setNiviWSDDServiceName(java.lang.String name) {
        NiviWSDDServiceName = name;
    }

    public com.nivi.project.Nivi getNivi() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Nivi_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNivi(endpoint);
    }

    public com.nivi.project.Nivi getNivi(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.nivi.project.NiviSoapBindingStub _stub = new com.nivi.project.NiviSoapBindingStub(portAddress, this);
            _stub.setPortName(getNiviWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNiviEndpointAddress(java.lang.String address) {
        Nivi_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.nivi.project.Nivi.class.isAssignableFrom(serviceEndpointInterface)) {
                com.nivi.project.NiviSoapBindingStub _stub = new com.nivi.project.NiviSoapBindingStub(new java.net.URL(Nivi_address), this);
                _stub.setPortName(getNiviWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Nivi".equals(inputPortName)) {
            return getNivi();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://project.nivi.com", "NiviService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://project.nivi.com", "Nivi"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Nivi".equals(portName)) {
            setNiviEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
