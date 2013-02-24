

/**
 * InventoryEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  InventoryEngineTest Junit test case
    */

    public class InventoryEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testputLiteratureInventoryEntry() throws java.lang.Exception{

        net.idea.i5wscli.inventory.InventoryEngineStub stub =
                    new net.idea.i5wscli.inventory.InventoryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntry putLiteratureInventoryEntry31=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntry)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntry.class);
                    // TODO : Fill in the putLiteratureInventoryEntry31 here
                
                        assertNotNull(stub.putLiteratureInventoryEntry(
                        putLiteratureInventoryEntry31));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartputLiteratureInventoryEntry() throws java.lang.Exception{
            net.idea.i5wscli.inventory.InventoryEngineStub stub = new net.idea.i5wscli.inventory.InventoryEngineStub();
             net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntry putLiteratureInventoryEntry31=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntry)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntry.class);
                    // TODO : Fill in the putLiteratureInventoryEntry31 here
                

                stub.startputLiteratureInventoryEntry(
                         putLiteratureInventoryEntry31,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.inventory.InventoryEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultputLiteratureInventoryEntry(
                         net.idea.i5wscli.inventory.InventoryEngineStub.EmptyResponse result
                            ) {
                
            }

            public void receiveErrorputLiteratureInventoryEntry(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testexecuteECSubstanceInventoryQuery() throws java.lang.Exception{

        net.idea.i5wscli.inventory.InventoryEngineStub stub =
                    new net.idea.i5wscli.inventory.InventoryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteECSubstanceInventoryQuery executeECSubstanceInventoryQuery33=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteECSubstanceInventoryQuery)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteECSubstanceInventoryQuery.class);
                    // TODO : Fill in the executeECSubstanceInventoryQuery33 here
                
                        assertNotNull(stub.executeECSubstanceInventoryQuery(
                        executeECSubstanceInventoryQuery33));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartexecuteECSubstanceInventoryQuery() throws java.lang.Exception{
            net.idea.i5wscli.inventory.InventoryEngineStub stub = new net.idea.i5wscli.inventory.InventoryEngineStub();
             net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteECSubstanceInventoryQuery executeECSubstanceInventoryQuery33=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteECSubstanceInventoryQuery)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteECSubstanceInventoryQuery.class);
                    // TODO : Fill in the executeECSubstanceInventoryQuery33 here
                

                stub.startexecuteECSubstanceInventoryQuery(
                         executeECSubstanceInventoryQuery33,
                    new tempCallbackN1005D()
                );
              


        }

        private class tempCallbackN1005D  extends net.idea.i5wscli.inventory.InventoryEngineCallbackHandler{
            public tempCallbackN1005D(){ super(null);}

            public void receiveResultexecuteECSubstanceInventoryQuery(
                         net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteECSubstanceInventoryQueryResponse result
                            ) {
                
            }

            public void receiveErrorexecuteECSubstanceInventoryQuery(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdeleteLiteratureInventoryEntries() throws java.lang.Exception{

        net.idea.i5wscli.inventory.InventoryEngineStub stub =
                    new net.idea.i5wscli.inventory.InventoryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntries deleteLiteratureInventoryEntries35=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntries)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntries.class);
                    // TODO : Fill in the deleteLiteratureInventoryEntries35 here
                
                        assertNotNull(stub.deleteLiteratureInventoryEntries(
                        deleteLiteratureInventoryEntries35));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdeleteLiteratureInventoryEntries() throws java.lang.Exception{
            net.idea.i5wscli.inventory.InventoryEngineStub stub = new net.idea.i5wscli.inventory.InventoryEngineStub();
             net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntries deleteLiteratureInventoryEntries35=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntries)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntries.class);
                    // TODO : Fill in the deleteLiteratureInventoryEntries35 here
                

                stub.startdeleteLiteratureInventoryEntries(
                         deleteLiteratureInventoryEntries35,
                    new tempCallbackN100C2()
                );
              


        }

        private class tempCallbackN100C2  extends net.idea.i5wscli.inventory.InventoryEngineCallbackHandler{
            public tempCallbackN100C2(){ super(null);}

            public void receiveResultdeleteLiteratureInventoryEntries(
                         net.idea.i5wscli.inventory.InventoryEngineStub.EmptyResponse result
                            ) {
                
            }

            public void receiveErrordeleteLiteratureInventoryEntries(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetLiteratureInventoryQuery() throws java.lang.Exception{

        net.idea.i5wscli.inventory.InventoryEngineStub stub =
                    new net.idea.i5wscli.inventory.InventoryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.inventory.InventoryEngineStub.GetLiteratureInventoryQuery getLiteratureInventoryQuery37=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.GetLiteratureInventoryQuery)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.GetLiteratureInventoryQuery.class);
                    // TODO : Fill in the getLiteratureInventoryQuery37 here
                
                        assertNotNull(stub.getLiteratureInventoryQuery(
                        getLiteratureInventoryQuery37));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetLiteratureInventoryQuery() throws java.lang.Exception{
            net.idea.i5wscli.inventory.InventoryEngineStub stub = new net.idea.i5wscli.inventory.InventoryEngineStub();
             net.idea.i5wscli.inventory.InventoryEngineStub.GetLiteratureInventoryQuery getLiteratureInventoryQuery37=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.GetLiteratureInventoryQuery)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.GetLiteratureInventoryQuery.class);
                    // TODO : Fill in the getLiteratureInventoryQuery37 here
                

                stub.startgetLiteratureInventoryQuery(
                         getLiteratureInventoryQuery37,
                    new tempCallbackN10113()
                );
              


        }

        private class tempCallbackN10113  extends net.idea.i5wscli.inventory.InventoryEngineCallbackHandler{
            public tempCallbackN10113(){ super(null);}

            public void receiveResultgetLiteratureInventoryQuery(
                         net.idea.i5wscli.inventory.InventoryEngineStub.GetLiteratureInventoryQueryResponse result
                            ) {
                
            }

            public void receiveErrorgetLiteratureInventoryQuery(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testputLiteratureInventoryEntries() throws java.lang.Exception{

        net.idea.i5wscli.inventory.InventoryEngineStub stub =
                    new net.idea.i5wscli.inventory.InventoryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntries putLiteratureInventoryEntries39=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntries)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntries.class);
                    // TODO : Fill in the putLiteratureInventoryEntries39 here
                
                        assertNotNull(stub.putLiteratureInventoryEntries(
                        putLiteratureInventoryEntries39));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartputLiteratureInventoryEntries() throws java.lang.Exception{
            net.idea.i5wscli.inventory.InventoryEngineStub stub = new net.idea.i5wscli.inventory.InventoryEngineStub();
             net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntries putLiteratureInventoryEntries39=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntries)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.PutLiteratureInventoryEntries.class);
                    // TODO : Fill in the putLiteratureInventoryEntries39 here
                

                stub.startputLiteratureInventoryEntries(
                         putLiteratureInventoryEntries39,
                    new tempCallbackN10164()
                );
              


        }

        private class tempCallbackN10164  extends net.idea.i5wscli.inventory.InventoryEngineCallbackHandler{
            public tempCallbackN10164(){ super(null);}

            public void receiveResultputLiteratureInventoryEntries(
                         net.idea.i5wscli.inventory.InventoryEngineStub.EmptyResponse result
                            ) {
                
            }

            public void receiveErrorputLiteratureInventoryEntries(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testexecuteLiteratureInventoryQuery() throws java.lang.Exception{

        net.idea.i5wscli.inventory.InventoryEngineStub stub =
                    new net.idea.i5wscli.inventory.InventoryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteLiteratureInventoryQuery executeLiteratureInventoryQuery41=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteLiteratureInventoryQuery)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteLiteratureInventoryQuery.class);
                    // TODO : Fill in the executeLiteratureInventoryQuery41 here
                
                        assertNotNull(stub.executeLiteratureInventoryQuery(
                        executeLiteratureInventoryQuery41));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartexecuteLiteratureInventoryQuery() throws java.lang.Exception{
            net.idea.i5wscli.inventory.InventoryEngineStub stub = new net.idea.i5wscli.inventory.InventoryEngineStub();
             net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteLiteratureInventoryQuery executeLiteratureInventoryQuery41=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteLiteratureInventoryQuery)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteLiteratureInventoryQuery.class);
                    // TODO : Fill in the executeLiteratureInventoryQuery41 here
                

                stub.startexecuteLiteratureInventoryQuery(
                         executeLiteratureInventoryQuery41,
                    new tempCallbackN101B5()
                );
              


        }

        private class tempCallbackN101B5  extends net.idea.i5wscli.inventory.InventoryEngineCallbackHandler{
            public tempCallbackN101B5(){ super(null);}

            public void receiveResultexecuteLiteratureInventoryQuery(
                         net.idea.i5wscli.inventory.InventoryEngineStub.ExecuteLiteratureInventoryQueryResponse result
                            ) {
                
            }

            public void receiveErrorexecuteLiteratureInventoryQuery(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdeleteLiteratureInventoryEntry() throws java.lang.Exception{

        net.idea.i5wscli.inventory.InventoryEngineStub stub =
                    new net.idea.i5wscli.inventory.InventoryEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntry deleteLiteratureInventoryEntry43=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntry)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntry.class);
                    // TODO : Fill in the deleteLiteratureInventoryEntry43 here
                
                        assertNotNull(stub.deleteLiteratureInventoryEntry(
                        deleteLiteratureInventoryEntry43));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdeleteLiteratureInventoryEntry() throws java.lang.Exception{
            net.idea.i5wscli.inventory.InventoryEngineStub stub = new net.idea.i5wscli.inventory.InventoryEngineStub();
             net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntry deleteLiteratureInventoryEntry43=
                                                        (net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntry)getTestObject(net.idea.i5wscli.inventory.InventoryEngineStub.DeleteLiteratureInventoryEntry.class);
                    // TODO : Fill in the deleteLiteratureInventoryEntry43 here
                

                stub.startdeleteLiteratureInventoryEntry(
                         deleteLiteratureInventoryEntry43,
                    new tempCallbackN1021A()
                );
              


        }

        private class tempCallbackN1021A  extends net.idea.i5wscli.inventory.InventoryEngineCallbackHandler{
            public tempCallbackN1021A(){ super(null);}

            public void receiveResultdeleteLiteratureInventoryEntry(
                         net.idea.i5wscli.inventory.InventoryEngineStub.EmptyResponse result
                            ) {
                
            }

            public void receiveErrordeleteLiteratureInventoryEntry(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    