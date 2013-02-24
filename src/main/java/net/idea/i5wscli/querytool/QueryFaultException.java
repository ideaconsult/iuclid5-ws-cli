
/**
 * QueryFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package net.idea.i5wscli.querytool;

public class QueryFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1361698682566L;
    
    private net.idea.i5wscli.querytool.QueryToolEngineStub.QueryFault faultMessage;

    
        public QueryFaultException() {
            super("QueryFaultException");
        }

        public QueryFaultException(java.lang.String s) {
           super(s);
        }

        public QueryFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public QueryFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(net.idea.i5wscli.querytool.QueryToolEngineStub.QueryFault msg){
       faultMessage = msg;
    }
    
    public net.idea.i5wscli.querytool.QueryToolEngineStub.QueryFault getFaultMessage(){
       return faultMessage;
    }
}
    