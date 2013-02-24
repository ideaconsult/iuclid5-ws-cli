
/**
 * ResourceFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package net.idea.i5wscli.resource;

public class ResourceFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1361698748844L;
    
    private net.idea.i5wscli.resource.ResourceEngineStub.ResourceFault faultMessage;

    
        public ResourceFaultException() {
            super("ResourceFaultException");
        }

        public ResourceFaultException(java.lang.String s) {
           super(s);
        }

        public ResourceFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ResourceFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.idea.i5wscli.resource.ResourceEngineStub.ResourceFault msg){
       faultMessage = msg;
    }
    
    public net.idea.i5wscli.resource.ResourceEngineStub.ResourceFault getFaultMessage(){
       return faultMessage;
    }
}
    