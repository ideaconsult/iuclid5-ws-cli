
/**
 * EndpointAccessEngineCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package net.idea.i5wscli.endpointaccess;

    /**
     *  EndpointAccessEngineCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class EndpointAccessEngineCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public EndpointAccessEngineCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public EndpointAccessEngineCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for copyEndpoint method
            * override this method for handling normal response from copyEndpoint operation
            */
           public void receiveResultcopyEndpoint(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpointResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from copyEndpoint operation
           */
            public void receiveErrorcopyEndpoint(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteEndpoint method
            * override this method for handling normal response from deleteEndpoint operation
            */
           public void receiveResultdeleteEndpoint(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpointResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteEndpoint operation
           */
            public void receiveErrordeleteEndpoint(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for referenceEndpoint method
            * override this method for handling normal response from referenceEndpoint operation
            */
           public void receiveResultreferenceEndpoint(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpointResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from referenceEndpoint operation
           */
            public void receiveErrorreferenceEndpoint(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for referenceEndpoints method
            * override this method for handling normal response from referenceEndpoints operation
            */
           public void receiveResultreferenceEndpoints(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpointsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from referenceEndpoints operation
           */
            public void receiveErrorreferenceEndpoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateEndpoint method
            * override this method for handling normal response from updateEndpoint operation
            */
           public void receiveResultupdateEndpoint(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.UpdateEndpointResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateEndpoint operation
           */
            public void receiveErrorupdateEndpoint(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for copyEndpoints method
            * override this method for handling normal response from copyEndpoints operation
            */
           public void receiveResultcopyEndpoints(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpointsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from copyEndpoints operation
           */
            public void receiveErrorcopyEndpoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteEndpoints method
            * override this method for handling normal response from deleteEndpoints operation
            */
           public void receiveResultdeleteEndpoints(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpointsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteEndpoints operation
           */
            public void receiveErrordeleteEndpoints(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createNewEndpoint method
            * override this method for handling normal response from createNewEndpoint operation
            */
           public void receiveResultcreateNewEndpoint(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpointResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createNewEndpoint operation
           */
            public void receiveErrorcreateNewEndpoint(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createNewEndpointSummary method
            * override this method for handling normal response from createNewEndpointSummary operation
            */
           public void receiveResultcreateNewEndpointSummary(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpointSummaryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createNewEndpointSummary operation
           */
            public void receiveErrorcreateNewEndpointSummary(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for detachEndpoint method
            * override this method for handling normal response from detachEndpoint operation
            */
           public void receiveResultdetachEndpoint(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DetachEndpointResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from detachEndpoint operation
           */
            public void receiveErrordetachEndpoint(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for renameEndpoint method
            * override this method for handling normal response from renameEndpoint operation
            */
           public void receiveResultrenameEndpoint(
                    net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.RenameEndpointResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from renameEndpoint operation
           */
            public void receiveErrorrenameEndpoint(java.lang.Exception e) {
            }
                


    }
    