
/**
 * QueryToolEngineCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package net.idea.i5wscli.querytool;

    /**
     *  QueryToolEngineCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class QueryToolEngineCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public QueryToolEngineCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public QueryToolEngineCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for executeQuery method
            * override this method for handling normal response from executeQuery operation
            */
           public void receiveResultexecuteQuery(
                    net.idea.i5wscli.querytool.QueryToolEngineStub.ExecuteQueryExpressionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from executeQuery operation
           */
            public void receiveErrorexecuteQuery(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for countQuery method
            * override this method for handling normal response from countQuery operation
            */
           public void receiveResultcountQuery(
                    net.idea.i5wscli.querytool.QueryToolEngineStub.CountQueryExpressionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from countQuery operation
           */
            public void receiveErrorcountQuery(java.lang.Exception e) {
            }
                


    }
    