
/**
 * ContainerEngineCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package net.idea.i5wscli.container;

    /**
     *  ContainerEngineCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ContainerEngineCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ContainerEngineCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ContainerEngineCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for downloadContainer method
            * override this method for handling normal response from downloadContainer operation
            */
           public void receiveResultdownloadContainer(
                    net.idea.i5wscli.container.ContainerEngineStub.DownloadContainerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from downloadContainer operation
           */
            public void receiveErrordownloadContainer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for importExternalContainer method
            * override this method for handling normal response from importExternalContainer operation
            */
           public void receiveResultimportExternalContainer(
                    net.idea.i5wscli.container.ContainerEngineStub.ImportExternalContainerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from importExternalContainer operation
           */
            public void receiveErrorimportExternalContainer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for uploadContainer method
            * override this method for handling normal response from uploadContainer operation
            */
           public void receiveResultuploadContainer(
                    net.idea.i5wscli.container.ContainerEngineStub.UploadContainerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from uploadContainer operation
           */
            public void receiveErroruploadContainer(java.lang.Exception e) {
            }
                


    }
    