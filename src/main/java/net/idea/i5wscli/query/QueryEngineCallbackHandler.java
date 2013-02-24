
/**
 * QueryEngineCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package net.idea.i5wscli.query;

    /**
     *  QueryEngineCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class QueryEngineCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public QueryEngineCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public QueryEngineCallbackHandler(){
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
                    net.idea.i5wscli.query.QueryEngineStub.ExecuteQueryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from executeQuery operation
           */
            public void receiveErrorexecuteQuery(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllQueryNames method
            * override this method for handling normal response from getAllQueryNames operation
            */
           public void receiveResultgetAllQueryNames(
                    net.idea.i5wscli.query.QueryEngineStub.GetAllQueryNamesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllQueryNames operation
           */
            public void receiveErrorgetAllQueryNames(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQueryDefinitionsByName method
            * override this method for handling normal response from getQueryDefinitionsByName operation
            */
           public void receiveResultgetQueryDefinitionsByName(
                    net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQueryDefinitionsByName operation
           */
            public void receiveErrorgetQueryDefinitionsByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQueryDefinitionsByResultDocumentType method
            * override this method for handling normal response from getQueryDefinitionsByResultDocumentType operation
            */
           public void receiveResultgetQueryDefinitionsByResultDocumentType(
                    net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByResultDocumentTypeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQueryDefinitionsByResultDocumentType operation
           */
            public void receiveErrorgetQueryDefinitionsByResultDocumentType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getQueryDefinitionByName method
            * override this method for handling normal response from getQueryDefinitionByName operation
            */
           public void receiveResultgetQueryDefinitionByName(
                    net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionByNameResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getQueryDefinitionByName operation
           */
            public void receiveErrorgetQueryDefinitionByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllQueryResultTypes method
            * override this method for handling normal response from getAllQueryResultTypes operation
            */
           public void receiveResultgetAllQueryResultTypes(
                    net.idea.i5wscli.query.QueryEngineStub.GetAllQueryResultTypesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllQueryResultTypes operation
           */
            public void receiveErrorgetAllQueryResultTypes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllQueryDefinitions method
            * override this method for handling normal response from getAllQueryDefinitions operation
            */
           public void receiveResultgetAllQueryDefinitions(
                    net.idea.i5wscli.query.QueryEngineStub.GetAllQueryDefinitionsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllQueryDefinitions operation
           */
            public void receiveErrorgetAllQueryDefinitions(java.lang.Exception e) {
            }
                


    }
    