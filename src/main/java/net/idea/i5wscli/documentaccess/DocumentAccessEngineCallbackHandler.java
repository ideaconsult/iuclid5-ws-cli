
/**
 * DocumentAccessEngineCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package net.idea.i5wscli.documentaccess;

    /**
     *  DocumentAccessEngineCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DocumentAccessEngineCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DocumentAccessEngineCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DocumentAccessEngineCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for closeDocument method
            * override this method for handling normal response from closeDocument operation
            */
           public void receiveResultcloseDocument(
                    net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.EmptyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from closeDocument operation
           */
            public void receiveErrorcloseDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for determineDocumentType method
            * override this method for handling normal response from determineDocumentType operation
            */
           public void receiveResultdetermineDocumentType(
                    net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DetermineDocumentTypeResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from determineDocumentType operation
           */
            public void receiveErrordetermineDocumentType(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createDocument method
            * override this method for handling normal response from createDocument operation
            */
           public void receiveResultcreateDocument(
                    net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CreateDocumentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createDocument operation
           */
            public void receiveErrorcreateDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for compareDocuments method
            * override this method for handling normal response from compareDocuments operation
            */
           public void receiveResultcompareDocuments(
                    net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CompareDocumentsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from compareDocuments operation
           */
            public void receiveErrorcompareDocuments(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for deleteDocument method
            * override this method for handling normal response from deleteDocument operation
            */
           public void receiveResultdeleteDocument(
                    net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.EmptyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteDocument operation
           */
            public void receiveErrordeleteDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for existsDocument method
            * override this method for handling normal response from existsDocument operation
            */
           public void receiveResultexistsDocument(
                    net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.ExistsDocumentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from existsDocument operation
           */
            public void receiveErrorexistsDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fetchDocument method
            * override this method for handling normal response from fetchDocument operation
            */
           public void receiveResultfetchDocument(
                    net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.FetchDocumentResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fetchDocument operation
           */
            public void receiveErrorfetchDocument(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for openDocumentForReading method
            * override this method for handling normal response from openDocumentForReading operation
            */
           public void receiveResultopenDocumentForReading(
                    net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForReadingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from openDocumentForReading operation
           */
            public void receiveErroropenDocumentForReading(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for openDocumentForWriting method
            * override this method for handling normal response from openDocumentForWriting operation
            */
           public void receiveResultopenDocumentForWriting(
                    net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForWritingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from openDocumentForWriting operation
           */
            public void receiveErroropenDocumentForWriting(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for commitDocument method
            * override this method for handling normal response from commitDocument operation
            */
           public void receiveResultcommitDocument(
                    net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.EmptyResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from commitDocument operation
           */
            public void receiveErrorcommitDocument(java.lang.Exception e) {
            }
                


    }
    