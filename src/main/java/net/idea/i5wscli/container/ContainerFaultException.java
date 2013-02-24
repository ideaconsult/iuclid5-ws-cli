
/**
 * ContainerFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package net.idea.i5wscli.container;

public class ContainerFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1361697817136L;
    
    private net.idea.i5wscli.container.ContainerEngineStub.ContainerFault faultMessage;

    
        public ContainerFaultException() {
            super("ContainerFaultException");
        }

        public ContainerFaultException(java.lang.String s) {
           super(s);
        }

        public ContainerFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ContainerFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.idea.i5wscli.container.ContainerEngineStub.ContainerFault msg){
       faultMessage = msg;
    }
    
    public net.idea.i5wscli.container.ContainerEngineStub.ContainerFault getFaultMessage(){
       return faultMessage;
    }
}
    