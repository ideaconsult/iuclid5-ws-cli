
/**
 * SessionFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package net.idea.i5wscli.endpointaccess;

public class SessionFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1361698125020L;
    
    private net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.SessionFault faultMessage;

    
        public SessionFaultException() {
            super("SessionFaultException");
        }

        public SessionFaultException(java.lang.String s) {
           super(s);
        }

        public SessionFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SessionFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.SessionFault msg){
       faultMessage = msg;
    }
    
    public net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.SessionFault getFaultMessage(){
       return faultMessage;
    }
}
    