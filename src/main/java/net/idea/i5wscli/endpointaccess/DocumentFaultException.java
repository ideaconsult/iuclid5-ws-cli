
/**
 * DocumentFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package net.idea.i5wscli.endpointaccess;

public class DocumentFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1361698125030L;
    
    private net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DocumentFault faultMessage;

    
        public DocumentFaultException() {
            super("DocumentFaultException");
        }

        public DocumentFaultException(java.lang.String s) {
           super(s);
        }

        public DocumentFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DocumentFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DocumentFault msg){
       faultMessage = msg;
    }
    
    public net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DocumentFault getFaultMessage(){
       return faultMessage;
    }
}
    