
/**
 * ExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package net.idea.i5wscli.version;

public class ExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1361698764917L;
    
    private net.idea.i5wscli.version.VersionStub.ExceptionE faultMessage;

    
        public ExceptionException() {
            super("ExceptionException");
        }

        public ExceptionException(java.lang.String s) {
           super(s);
        }

        public ExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.idea.i5wscli.version.VersionStub.ExceptionE msg){
       faultMessage = msg;
    }
    
    public net.idea.i5wscli.version.VersionStub.ExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    