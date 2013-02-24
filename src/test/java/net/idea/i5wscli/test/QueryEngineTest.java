

/**
 * QueryEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  QueryEngineTest Junit test case
    */

    public class QueryEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testexecuteQuery() throws java.lang.Exception{

        net.idea.i5wscli.query.QueryEngineStub stub =
                    new net.idea.i5wscli.query.QueryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.query.QueryEngineStub.ExecuteQuery executeQuery28=
                                                        (net.idea.i5wscli.query.QueryEngineStub.ExecuteQuery)getTestObject(net.idea.i5wscli.query.QueryEngineStub.ExecuteQuery.class);
                    // TODO : Fill in the executeQuery28 here
                
                        assertNotNull(stub.executeQuery(
                        executeQuery28));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartexecuteQuery() throws java.lang.Exception{
            net.idea.i5wscli.query.QueryEngineStub stub = new net.idea.i5wscli.query.QueryEngineStub();
             net.idea.i5wscli.query.QueryEngineStub.ExecuteQuery executeQuery28=
                                                        (net.idea.i5wscli.query.QueryEngineStub.ExecuteQuery)getTestObject(net.idea.i5wscli.query.QueryEngineStub.ExecuteQuery.class);
                    // TODO : Fill in the executeQuery28 here
                

                stub.startexecuteQuery(
                         executeQuery28,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.query.QueryEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultexecuteQuery(
                         net.idea.i5wscli.query.QueryEngineStub.ExecuteQueryResponse result
                            ) {
                
            }

            public void receiveErrorexecuteQuery(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetAllQueryNames() throws java.lang.Exception{

        net.idea.i5wscli.query.QueryEngineStub stub =
                    new net.idea.i5wscli.query.QueryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.query.QueryEngineStub.GetAllQueryNames getAllQueryNames30=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetAllQueryNames)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetAllQueryNames.class);
                    // TODO : Fill in the getAllQueryNames30 here
                
                        assertNotNull(stub.getAllQueryNames(
                        getAllQueryNames30));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetAllQueryNames() throws java.lang.Exception{
            net.idea.i5wscli.query.QueryEngineStub stub = new net.idea.i5wscli.query.QueryEngineStub();
             net.idea.i5wscli.query.QueryEngineStub.GetAllQueryNames getAllQueryNames30=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetAllQueryNames)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetAllQueryNames.class);
                    // TODO : Fill in the getAllQueryNames30 here
                

                stub.startgetAllQueryNames(
                         getAllQueryNames30,
                    new tempCallbackN10071()
                );
              


        }

        private class tempCallbackN10071  extends net.idea.i5wscli.query.QueryEngineCallbackHandler{
            public tempCallbackN10071(){ super(null);}

            public void receiveResultgetAllQueryNames(
                         net.idea.i5wscli.query.QueryEngineStub.GetAllQueryNamesResponse result
                            ) {
                
            }

            public void receiveErrorgetAllQueryNames(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetQueryDefinitionsByName() throws java.lang.Exception{

        net.idea.i5wscli.query.QueryEngineStub stub =
                    new net.idea.i5wscli.query.QueryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByName getQueryDefinitionsByName32=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByName)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByName.class);
                    // TODO : Fill in the getQueryDefinitionsByName32 here
                
                        assertNotNull(stub.getQueryDefinitionsByName(
                        getQueryDefinitionsByName32));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetQueryDefinitionsByName() throws java.lang.Exception{
            net.idea.i5wscli.query.QueryEngineStub stub = new net.idea.i5wscli.query.QueryEngineStub();
             net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByName getQueryDefinitionsByName32=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByName)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByName.class);
                    // TODO : Fill in the getQueryDefinitionsByName32 here
                

                stub.startgetQueryDefinitionsByName(
                         getQueryDefinitionsByName32,
                    new tempCallbackN100D6()
                );
              


        }

        private class tempCallbackN100D6  extends net.idea.i5wscli.query.QueryEngineCallbackHandler{
            public tempCallbackN100D6(){ super(null);}

            public void receiveResultgetQueryDefinitionsByName(
                         net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByNameResponse result
                            ) {
                
            }

            public void receiveErrorgetQueryDefinitionsByName(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetQueryDefinitionsByResultDocumentType() throws java.lang.Exception{

        net.idea.i5wscli.query.QueryEngineStub stub =
                    new net.idea.i5wscli.query.QueryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByResultDocumentType getQueryDefinitionsByResultDocumentType34=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByResultDocumentType)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByResultDocumentType.class);
                    // TODO : Fill in the getQueryDefinitionsByResultDocumentType34 here
                
                        assertNotNull(stub.getQueryDefinitionsByResultDocumentType(
                        getQueryDefinitionsByResultDocumentType34));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetQueryDefinitionsByResultDocumentType() throws java.lang.Exception{
            net.idea.i5wscli.query.QueryEngineStub stub = new net.idea.i5wscli.query.QueryEngineStub();
             net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByResultDocumentType getQueryDefinitionsByResultDocumentType34=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByResultDocumentType)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByResultDocumentType.class);
                    // TODO : Fill in the getQueryDefinitionsByResultDocumentType34 here
                

                stub.startgetQueryDefinitionsByResultDocumentType(
                         getQueryDefinitionsByResultDocumentType34,
                    new tempCallbackN1013B()
                );
              


        }

        private class tempCallbackN1013B  extends net.idea.i5wscli.query.QueryEngineCallbackHandler{
            public tempCallbackN1013B(){ super(null);}

            public void receiveResultgetQueryDefinitionsByResultDocumentType(
                         net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionsByResultDocumentTypeResponse result
                            ) {
                
            }

            public void receiveErrorgetQueryDefinitionsByResultDocumentType(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetQueryDefinitionByName() throws java.lang.Exception{

        net.idea.i5wscli.query.QueryEngineStub stub =
                    new net.idea.i5wscli.query.QueryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionByName getQueryDefinitionByName36=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionByName)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionByName.class);
                    // TODO : Fill in the getQueryDefinitionByName36 here
                
                        assertNotNull(stub.getQueryDefinitionByName(
                        getQueryDefinitionByName36));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetQueryDefinitionByName() throws java.lang.Exception{
            net.idea.i5wscli.query.QueryEngineStub stub = new net.idea.i5wscli.query.QueryEngineStub();
             net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionByName getQueryDefinitionByName36=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionByName)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionByName.class);
                    // TODO : Fill in the getQueryDefinitionByName36 here
                

                stub.startgetQueryDefinitionByName(
                         getQueryDefinitionByName36,
                    new tempCallbackN101A0()
                );
              


        }

        private class tempCallbackN101A0  extends net.idea.i5wscli.query.QueryEngineCallbackHandler{
            public tempCallbackN101A0(){ super(null);}

            public void receiveResultgetQueryDefinitionByName(
                         net.idea.i5wscli.query.QueryEngineStub.GetQueryDefinitionByNameResponse result
                            ) {
                
            }

            public void receiveErrorgetQueryDefinitionByName(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetAllQueryResultTypes() throws java.lang.Exception{

        net.idea.i5wscli.query.QueryEngineStub stub =
                    new net.idea.i5wscli.query.QueryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.query.QueryEngineStub.GetAllQueryResultTypes getAllQueryResultTypes38=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetAllQueryResultTypes)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetAllQueryResultTypes.class);
                    // TODO : Fill in the getAllQueryResultTypes38 here
                
                        assertNotNull(stub.getAllQueryResultTypes(
                        getAllQueryResultTypes38));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetAllQueryResultTypes() throws java.lang.Exception{
            net.idea.i5wscli.query.QueryEngineStub stub = new net.idea.i5wscli.query.QueryEngineStub();
             net.idea.i5wscli.query.QueryEngineStub.GetAllQueryResultTypes getAllQueryResultTypes38=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetAllQueryResultTypes)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetAllQueryResultTypes.class);
                    // TODO : Fill in the getAllQueryResultTypes38 here
                

                stub.startgetAllQueryResultTypes(
                         getAllQueryResultTypes38,
                    new tempCallbackN10205()
                );
              


        }

        private class tempCallbackN10205  extends net.idea.i5wscli.query.QueryEngineCallbackHandler{
            public tempCallbackN10205(){ super(null);}

            public void receiveResultgetAllQueryResultTypes(
                         net.idea.i5wscli.query.QueryEngineStub.GetAllQueryResultTypesResponse result
                            ) {
                
            }

            public void receiveErrorgetAllQueryResultTypes(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetAllQueryDefinitions() throws java.lang.Exception{

        net.idea.i5wscli.query.QueryEngineStub stub =
                    new net.idea.i5wscli.query.QueryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.query.QueryEngineStub.GetAllQueryDefinitions getAllQueryDefinitions40=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetAllQueryDefinitions)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetAllQueryDefinitions.class);
                    // TODO : Fill in the getAllQueryDefinitions40 here
                
                        assertNotNull(stub.getAllQueryDefinitions(
                        getAllQueryDefinitions40));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetAllQueryDefinitions() throws java.lang.Exception{
            net.idea.i5wscli.query.QueryEngineStub stub = new net.idea.i5wscli.query.QueryEngineStub();
             net.idea.i5wscli.query.QueryEngineStub.GetAllQueryDefinitions getAllQueryDefinitions40=
                                                        (net.idea.i5wscli.query.QueryEngineStub.GetAllQueryDefinitions)getTestObject(net.idea.i5wscli.query.QueryEngineStub.GetAllQueryDefinitions.class);
                    // TODO : Fill in the getAllQueryDefinitions40 here
                

                stub.startgetAllQueryDefinitions(
                         getAllQueryDefinitions40,
                    new tempCallbackN1026A()
                );
              


        }

        private class tempCallbackN1026A  extends net.idea.i5wscli.query.QueryEngineCallbackHandler{
            public tempCallbackN1026A(){ super(null);}

            public void receiveResultgetAllQueryDefinitions(
                         net.idea.i5wscli.query.QueryEngineStub.GetAllQueryDefinitionsResponse result
                            ) {
                
            }

            public void receiveErrorgetAllQueryDefinitions(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    