package com.nivi.project;

public class NiviProxy implements com.nivi.project.Nivi {
  private String _endpoint = null;
  private com.nivi.project.Nivi nivi = null;
  
  public NiviProxy() {
    _initNiviProxy();
  }
  
  public NiviProxy(String endpoint) {
    _endpoint = endpoint;
    _initNiviProxy();
  }
  
  private void _initNiviProxy() {
    try {
      nivi = (new com.nivi.project.NiviServiceLocator()).getNivi();
      if (nivi != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nivi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nivi)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nivi != null)
      ((javax.xml.rpc.Stub)nivi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.nivi.project.Nivi getNivi() {
    if (nivi == null)
      _initNiviProxy();
    return nivi;
  }
  
  public java.lang.String getName() throws java.rmi.RemoteException{
    if (nivi == null)
      _initNiviProxy();
    return nivi.getName();
  }
  
  
}