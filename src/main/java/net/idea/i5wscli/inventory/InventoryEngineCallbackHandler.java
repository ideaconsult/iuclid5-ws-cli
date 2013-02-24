
/**
 * InventoryEngineCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package net.idea.i5wscli.inventory;

    /**
     *  InventoryEngineCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class InventoryEngineCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public InventoryEngineCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public InventoryEngineCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for putLiteratureInventoryEntry method
            * override this method for handling normal response from putLiteratureInventoryEntry operation
            */
           public void receiveResultputLiteratureInventoryEntry(
                    net.idea.i5wscli.inventory.InventoryEngineStub.EmptyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from putLiteratureInventoryEntry operation
           */
            public void receiveErrorputLiteratureInventoryEntry(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for executeECSubstanceInventoryQuery method
            * override this method for handling normal response from executeECSubstanceInventoryQuery operation
            */
           public void receiveResultexecuteECSubstanceInventoryQuery(
                    net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteECSubstanceInventoryQueryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from executeECSubstanceInventoryQuery operation
           */
            public void receiveErrorexecuteECSubstanceInventoryQuery(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteLiteratureInventoryEntries method
            * override this method for handling normal response from deleteLiteratureInventoryEntries operation
            */
           public void receiveResultdeleteLiteratureInventoryEntries(
                    net.idea.i5wscli.inventory.InventoryEngineStub.EmptyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteLiteratureInventoryEntries operation
           */
            public void receiveErrordeleteLiteratureInventoryEntries(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getLiteratureInventoryQuery method
            * override this method for handling normal response from getLiteratureInventoryQuery operation
            */
           public void receiveResultgetLiteratureInventoryQuery(
                    net.idea.i5wscli.inventory.InventoryEngineStub.GetLiteratureInventoryQueryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLiteratureInventoryQuery operation
           */
            public void receiveErrorgetLiteratureInventoryQuery(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for putLiteratureInventoryEntries method
            * override this method for handling normal response from putLiteratureInventoryEntries operation
            */
           public void receiveResultputLiteratureInventoryEntries(
                    net.idea.i5wscli.inventory.InventoryEngineStub.EmptyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from putLiteratureInventoryEntries operation
           */
            public void receiveErrorputLiteratureInventoryEntries(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for executeLiteratureInventoryQuery method
            * override this method for handling normal response from executeLiteratureInventoryQuery operation
            */
           public void receiveResultexecuteLiteratureInventoryQuery(
                    net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteLiteratureInventoryQueryResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from executeLiteratureInventoryQuery operation
           */
            public void receiveErrorexecuteLiteratureInventoryQuery(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteLiteratureInventoryEntry method
            * override this method for handling normal response from deleteLiteratureInventoryEntry operation
            */
           public void receiveResultdeleteLiteratureInventoryEntry(
                    net.idea.i5wscli.inventory.InventoryEngineStub.EmptyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteLiteratureInventoryEntry operation
           */
            public void receiveErrordeleteLiteratureInventoryEntry(java.lang.Exception e) {
            }
                


    }
    