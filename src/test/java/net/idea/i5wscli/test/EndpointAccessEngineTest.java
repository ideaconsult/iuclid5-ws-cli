

/**
 * EndpointAccessEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  EndpointAccessEngineTest Junit test case
    */

    public class EndpointAccessEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testcopyEndpoint() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoint copyEndpoint44=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoint.class);
                    // TODO : Fill in the copyEndpoint44 here
                
                        assertNotNull(stub.copyEndpoint(
                        copyEndpoint44));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcopyEndpoint() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoint copyEndpoint44=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoint.class);
                    // TODO : Fill in the copyEndpoint44 here
                

                stub.startcopyEndpoint(
                         copyEndpoint44,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultcopyEndpoint(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpointResponse result
                            ) {
                
            }

            public void receiveErrorcopyEndpoint(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdeleteEndpoint() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoint deleteEndpoint46=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoint.class);
                    // TODO : Fill in the deleteEndpoint46 here
                
                        assertNotNull(stub.deleteEndpoint(
                        deleteEndpoint46));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdeleteEndpoint() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoint deleteEndpoint46=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoint.class);
                    // TODO : Fill in the deleteEndpoint46 here
                

                stub.startdeleteEndpoint(
                         deleteEndpoint46,
                    new tempCallbackN10071()
                );
              


        }

        private class tempCallbackN10071  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN10071(){ super(null);}

            public void receiveResultdeleteEndpoint(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpointResponse result
                            ) {
                
            }

            public void receiveErrordeleteEndpoint(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testreferenceEndpoint() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoint referenceEndpoint48=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoint.class);
                    // TODO : Fill in the referenceEndpoint48 here
                
                        assertNotNull(stub.referenceEndpoint(
                        referenceEndpoint48));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartreferenceEndpoint() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoint referenceEndpoint48=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoint.class);
                    // TODO : Fill in the referenceEndpoint48 here
                

                stub.startreferenceEndpoint(
                         referenceEndpoint48,
                    new tempCallbackN100D6()
                );
              


        }

        private class tempCallbackN100D6  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN100D6(){ super(null);}

            public void receiveResultreferenceEndpoint(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpointResponse result
                            ) {
                
            }

            public void receiveErrorreferenceEndpoint(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testreferenceEndpoints() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoints referenceEndpoints50=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoints)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoints.class);
                    // TODO : Fill in the referenceEndpoints50 here
                
                        assertNotNull(stub.referenceEndpoints(
                        referenceEndpoints50));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartreferenceEndpoints() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoints referenceEndpoints50=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoints)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpoints.class);
                    // TODO : Fill in the referenceEndpoints50 here
                

                stub.startreferenceEndpoints(
                         referenceEndpoints50,
                    new tempCallbackN1013B()
                );
              


        }

        private class tempCallbackN1013B  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN1013B(){ super(null);}

            public void receiveResultreferenceEndpoints(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.ReferenceEndpointsResponse result
                            ) {
                
            }

            public void receiveErrorreferenceEndpoints(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testupdateEndpoint() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.UpdateEndpoint updateEndpoint52=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.UpdateEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.UpdateEndpoint.class);
                    // TODO : Fill in the updateEndpoint52 here
                
                        assertNotNull(stub.updateEndpoint(
                        updateEndpoint52));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartupdateEndpoint() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.UpdateEndpoint updateEndpoint52=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.UpdateEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.UpdateEndpoint.class);
                    // TODO : Fill in the updateEndpoint52 here
                

                stub.startupdateEndpoint(
                         updateEndpoint52,
                    new tempCallbackN101A0()
                );
              


        }

        private class tempCallbackN101A0  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN101A0(){ super(null);}

            public void receiveResultupdateEndpoint(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.UpdateEndpointResponse result
                            ) {
                
            }

            public void receiveErrorupdateEndpoint(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testcopyEndpoints() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoints copyEndpoints54=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoints)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoints.class);
                    // TODO : Fill in the copyEndpoints54 here
                
                        assertNotNull(stub.copyEndpoints(
                        copyEndpoints54));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcopyEndpoints() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoints copyEndpoints54=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoints)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpoints.class);
                    // TODO : Fill in the copyEndpoints54 here
                

                stub.startcopyEndpoints(
                         copyEndpoints54,
                    new tempCallbackN10205()
                );
              


        }

        private class tempCallbackN10205  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN10205(){ super(null);}

            public void receiveResultcopyEndpoints(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CopyEndpointsResponse result
                            ) {
                
            }

            public void receiveErrorcopyEndpoints(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdeleteEndpoints() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoints deleteEndpoints56=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoints)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoints.class);
                    // TODO : Fill in the deleteEndpoints56 here
                
                        assertNotNull(stub.deleteEndpoints(
                        deleteEndpoints56));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdeleteEndpoints() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoints deleteEndpoints56=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoints)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpoints.class);
                    // TODO : Fill in the deleteEndpoints56 here
                

                stub.startdeleteEndpoints(
                         deleteEndpoints56,
                    new tempCallbackN1026A()
                );
              


        }

        private class tempCallbackN1026A  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN1026A(){ super(null);}

            public void receiveResultdeleteEndpoints(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DeleteEndpointsResponse result
                            ) {
                
            }

            public void receiveErrordeleteEndpoints(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testcreateNewEndpoint() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpoint createNewEndpoint58=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpoint.class);
                    // TODO : Fill in the createNewEndpoint58 here
                
                        assertNotNull(stub.createNewEndpoint(
                        createNewEndpoint58));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcreateNewEndpoint() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpoint createNewEndpoint58=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpoint.class);
                    // TODO : Fill in the createNewEndpoint58 here
                

                stub.startcreateNewEndpoint(
                         createNewEndpoint58,
                    new tempCallbackN102CF()
                );
              


        }

        private class tempCallbackN102CF  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN102CF(){ super(null);}

            public void receiveResultcreateNewEndpoint(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpointResponse result
                            ) {
                
            }

            public void receiveErrorcreateNewEndpoint(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testcreateNewEndpointSummary() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpointSummary createNewEndpointSummary60=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpointSummary)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpointSummary.class);
                    // TODO : Fill in the createNewEndpointSummary60 here
                
                        assertNotNull(stub.createNewEndpointSummary(
                        createNewEndpointSummary60));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcreateNewEndpointSummary() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpointSummary createNewEndpointSummary60=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpointSummary)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpointSummary.class);
                    // TODO : Fill in the createNewEndpointSummary60 here
                

                stub.startcreateNewEndpointSummary(
                         createNewEndpointSummary60,
                    new tempCallbackN10334()
                );
              


        }

        private class tempCallbackN10334  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN10334(){ super(null);}

            public void receiveResultcreateNewEndpointSummary(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.CreateNewEndpointSummaryResponse result
                            ) {
                
            }

            public void receiveErrorcreateNewEndpointSummary(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testdetachEndpoint() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DetachEndpoint detachEndpoint62=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DetachEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DetachEndpoint.class);
                    // TODO : Fill in the detachEndpoint62 here
                
                        assertNotNull(stub.detachEndpoint(
                        detachEndpoint62));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdetachEndpoint() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DetachEndpoint detachEndpoint62=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DetachEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DetachEndpoint.class);
                    // TODO : Fill in the detachEndpoint62 here
                

                stub.startdetachEndpoint(
                         detachEndpoint62,
                    new tempCallbackN10399()
                );
              


        }

        private class tempCallbackN10399  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN10399(){ super(null);}

            public void receiveResultdetachEndpoint(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.DetachEndpointResponse result
                            ) {
                
            }

            public void receiveErrordetachEndpoint(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testrenameEndpoint() throws java.lang.Exception{

        net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub =
                    new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.RenameEndpoint renameEndpoint64=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.RenameEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.RenameEndpoint.class);
                    // TODO : Fill in the renameEndpoint64 here
                
                        assertNotNull(stub.renameEndpoint(
                        renameEndpoint64));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartrenameEndpoint() throws java.lang.Exception{
            net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub stub = new net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub();
             net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.RenameEndpoint renameEndpoint64=
                                                        (net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.RenameEndpoint)getTestObject(net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.RenameEndpoint.class);
                    // TODO : Fill in the renameEndpoint64 here
                

                stub.startrenameEndpoint(
                         renameEndpoint64,
                    new tempCallbackN103FE()
                );
              


        }

        private class tempCallbackN103FE  extends net.idea.i5wscli.endpointaccess.EndpointAccessEngineCallbackHandler{
            public tempCallbackN103FE(){ super(null);}

            public void receiveResultrenameEndpoint(
                         net.idea.i5wscli.endpointaccess.EndpointAccessEngineStub.RenameEndpointResponse result
                            ) {
                
            }

            public void receiveErrorrenameEndpoint(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    