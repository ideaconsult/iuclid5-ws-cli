
/**
 * EngineFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package net.idea.i5wscli.session;

public class EngineFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1361697361368L;
    
    private net.idea.i5wscli.session.SessionEngineStub.EngineFault faultMessage;

    
        public EngineFaultException() {
            super("EngineFaultException");
        }

        public EngineFaultException(java.lang.String s) {
           super(s);
        }

        public EngineFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public EngineFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.idea.i5wscli.session.SessionEngineStub.EngineFault msg){
       faultMessage = msg;
    }
    
    public net.idea.i5wscli.session.SessionEngineStub.EngineFault getFaultMessage(){
       return faultMessage;
    }
}
    