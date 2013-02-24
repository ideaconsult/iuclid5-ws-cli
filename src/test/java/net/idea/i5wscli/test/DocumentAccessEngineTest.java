

/**
 * DocumentAccessEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  DocumentAccessEngineTest Junit test case
    */

    public class DocumentAccessEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testcloseDocument() throws java.lang.Exception{

        net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub =
                    new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CloseDocument closeDocument42=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CloseDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CloseDocument.class);
                    // TODO : Fill in the closeDocument42 here
                
                        assertNotNull(stub.closeDocument(
                        closeDocument42));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcloseDocument() throws java.lang.Exception{
            net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub = new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();
             net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CloseDocument closeDocument42=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CloseDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CloseDocument.class);
                    // TODO : Fill in the closeDocument42 here
                

                stub.startcloseDocument(
                         closeDocument42,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.documentaccess.DocumentAccessEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultcloseDocument(
                         net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.EmptyResponse result
                            ) {
                
            }

            public void receiveErrorcloseDocument(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdetermineDocumentType() throws java.lang.Exception{

        net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub =
                    new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DetermineDocumentType determineDocumentType44=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DetermineDocumentType)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DetermineDocumentType.class);
                    // TODO : Fill in the determineDocumentType44 here
                
                        assertNotNull(stub.determineDocumentType(
                        determineDocumentType44));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdetermineDocumentType() throws java.lang.Exception{
            net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub = new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();
             net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DetermineDocumentType determineDocumentType44=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DetermineDocumentType)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DetermineDocumentType.class);
                    // TODO : Fill in the determineDocumentType44 here
                

                stub.startdetermineDocumentType(
                         determineDocumentType44,
                    new tempCallbackN10071()
                );
              


        }

        private class tempCallbackN10071  extends net.idea.i5wscli.documentaccess.DocumentAccessEngineCallbackHandler{
            public tempCallbackN10071(){ super(null);}

            public void receiveResultdetermineDocumentType(
                         net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DetermineDocumentTypeResponse result
                            ) {
                
            }

            public void receiveErrordetermineDocumentType(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testcreateDocument() throws java.lang.Exception{

        net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub =
                    new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CreateDocument createDocument46=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CreateDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CreateDocument.class);
                    // TODO : Fill in the createDocument46 here
                
                        assertNotNull(stub.createDocument(
                        createDocument46));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcreateDocument() throws java.lang.Exception{
            net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub = new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();
             net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CreateDocument createDocument46=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CreateDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CreateDocument.class);
                    // TODO : Fill in the createDocument46 here
                

                stub.startcreateDocument(
                         createDocument46,
                    new tempCallbackN100D6()
                );
              


        }

        private class tempCallbackN100D6  extends net.idea.i5wscli.documentaccess.DocumentAccessEngineCallbackHandler{
            public tempCallbackN100D6(){ super(null);}

            public void receiveResultcreateDocument(
                         net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CreateDocumentResponse result
                            ) {
                
            }

            public void receiveErrorcreateDocument(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testcompareDocuments() throws java.lang.Exception{

        net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub =
                    new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CompareDocuments compareDocuments48=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CompareDocuments)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CompareDocuments.class);
                    // TODO : Fill in the compareDocuments48 here
                
                        assertNotNull(stub.compareDocuments(
                        compareDocuments48));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcompareDocuments() throws java.lang.Exception{
            net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub = new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();
             net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CompareDocuments compareDocuments48=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CompareDocuments)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CompareDocuments.class);
                    // TODO : Fill in the compareDocuments48 here
                

                stub.startcompareDocuments(
                         compareDocuments48,
                    new tempCallbackN1013B()
                );
              


        }

        private class tempCallbackN1013B  extends net.idea.i5wscli.documentaccess.DocumentAccessEngineCallbackHandler{
            public tempCallbackN1013B(){ super(null);}

            public void receiveResultcompareDocuments(
                         net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CompareDocumentsResponse result
                            ) {
                
            }

            public void receiveErrorcompareDocuments(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdeleteDocument() throws java.lang.Exception{

        net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub =
                    new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DeleteDocument deleteDocument50=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DeleteDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DeleteDocument.class);
                    // TODO : Fill in the deleteDocument50 here
                
                        assertNotNull(stub.deleteDocument(
                        deleteDocument50));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdeleteDocument() throws java.lang.Exception{
            net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub = new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();
             net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DeleteDocument deleteDocument50=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DeleteDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.DeleteDocument.class);
                    // TODO : Fill in the deleteDocument50 here
                

                stub.startdeleteDocument(
                         deleteDocument50,
                    new tempCallbackN101A0()
                );
              


        }

        private class tempCallbackN101A0  extends net.idea.i5wscli.documentaccess.DocumentAccessEngineCallbackHandler{
            public tempCallbackN101A0(){ super(null);}

            public void receiveResultdeleteDocument(
                         net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.EmptyResponse result
                            ) {
                
            }

            public void receiveErrordeleteDocument(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testexistsDocument() throws java.lang.Exception{

        net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub =
                    new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.ExistsDocument existsDocument52=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.ExistsDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.ExistsDocument.class);
                    // TODO : Fill in the existsDocument52 here
                
                        assertNotNull(stub.existsDocument(
                        existsDocument52));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartexistsDocument() throws java.lang.Exception{
            net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub = new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();
             net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.ExistsDocument existsDocument52=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.ExistsDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.ExistsDocument.class);
                    // TODO : Fill in the existsDocument52 here
                

                stub.startexistsDocument(
                         existsDocument52,
                    new tempCallbackN10205()
                );
              


        }

        private class tempCallbackN10205  extends net.idea.i5wscli.documentaccess.DocumentAccessEngineCallbackHandler{
            public tempCallbackN10205(){ super(null);}

            public void receiveResultexistsDocument(
                         net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.ExistsDocumentResponse result
                            ) {
                
            }

            public void receiveErrorexistsDocument(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testfetchDocument() throws java.lang.Exception{

        net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub =
                    new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.FetchDocument fetchDocument54=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.FetchDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.FetchDocument.class);
                    // TODO : Fill in the fetchDocument54 here
                
                        assertNotNull(stub.fetchDocument(
                        fetchDocument54));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartfetchDocument() throws java.lang.Exception{
            net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub = new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();
             net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.FetchDocument fetchDocument54=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.FetchDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.FetchDocument.class);
                    // TODO : Fill in the fetchDocument54 here
                

                stub.startfetchDocument(
                         fetchDocument54,
                    new tempCallbackN1026A()
                );
              


        }

        private class tempCallbackN1026A  extends net.idea.i5wscli.documentaccess.DocumentAccessEngineCallbackHandler{
            public tempCallbackN1026A(){ super(null);}

            public void receiveResultfetchDocument(
                         net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.FetchDocumentResponse result
                            ) {
                
            }

            public void receiveErrorfetchDocument(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testopenDocumentForReading() throws java.lang.Exception{

        net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub =
                    new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForReading openDocumentForReading56=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForReading)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForReading.class);
                    // TODO : Fill in the openDocumentForReading56 here
                
                        assertNotNull(stub.openDocumentForReading(
                        openDocumentForReading56));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartopenDocumentForReading() throws java.lang.Exception{
            net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub = new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();
             net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForReading openDocumentForReading56=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForReading)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForReading.class);
                    // TODO : Fill in the openDocumentForReading56 here
                

                stub.startopenDocumentForReading(
                         openDocumentForReading56,
                    new tempCallbackN102CF()
                );
              


        }

        private class tempCallbackN102CF  extends net.idea.i5wscli.documentaccess.DocumentAccessEngineCallbackHandler{
            public tempCallbackN102CF(){ super(null);}

            public void receiveResultopenDocumentForReading(
                         net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForReadingResponse result
                            ) {
                
            }

            public void receiveErroropenDocumentForReading(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testopenDocumentForWriting() throws java.lang.Exception{

        net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub =
                    new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForWriting openDocumentForWriting58=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForWriting)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForWriting.class);
                    // TODO : Fill in the openDocumentForWriting58 here
                
                        assertNotNull(stub.openDocumentForWriting(
                        openDocumentForWriting58));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartopenDocumentForWriting() throws java.lang.Exception{
            net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub = new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();
             net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForWriting openDocumentForWriting58=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForWriting)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForWriting.class);
                    // TODO : Fill in the openDocumentForWriting58 here
                

                stub.startopenDocumentForWriting(
                         openDocumentForWriting58,
                    new tempCallbackN10334()
                );
              


        }

        private class tempCallbackN10334  extends net.idea.i5wscli.documentaccess.DocumentAccessEngineCallbackHandler{
            public tempCallbackN10334(){ super(null);}

            public void receiveResultopenDocumentForWriting(
                         net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.OpenDocumentForWritingResponse result
                            ) {
                
            }

            public void receiveErroropenDocumentForWriting(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testcommitDocument() throws java.lang.Exception{

        net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub =
                    new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CommitDocument commitDocument60=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CommitDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CommitDocument.class);
                    // TODO : Fill in the commitDocument60 here
                
                        assertNotNull(stub.commitDocument(
                        commitDocument60));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcommitDocument() throws java.lang.Exception{
            net.idea.i5wscli.documentaccess.DocumentAccessEngineStub stub = new net.idea.i5wscli.documentaccess.DocumentAccessEngineStub();
             net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CommitDocument commitDocument60=
                                                        (net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CommitDocument)getTestObject(net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.CommitDocument.class);
                    // TODO : Fill in the commitDocument60 here
                

                stub.startcommitDocument(
                         commitDocument60,
                    new tempCallbackN10399()
                );
              


        }

        private class tempCallbackN10399  extends net.idea.i5wscli.documentaccess.DocumentAccessEngineCallbackHandler{
            public tempCallbackN10399(){ super(null);}

            public void receiveResultcommitDocument(
                         net.idea.i5wscli.documentaccess.DocumentAccessEngineStub.EmptyResponse result
                            ) {
                
            }

            public void receiveErrorcommitDocument(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    