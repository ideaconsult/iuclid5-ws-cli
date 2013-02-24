

/**
 * ReferenceTrackerEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  ReferenceTrackerEngineTest Junit test case
    */

    public class ReferenceTrackerEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testqueryInbound() throws java.lang.Exception{

        net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub stub =
                    new net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryInbound queryInbound8=
                                                        (net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryInbound)getTestObject(net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryInbound.class);
                    // TODO : Fill in the queryInbound8 here
                
                        assertNotNull(stub.queryInbound(
                        queryInbound8));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartqueryInbound() throws java.lang.Exception{
            net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub stub = new net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub();
             net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryInbound queryInbound8=
                                                        (net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryInbound)getTestObject(net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryInbound.class);
                    // TODO : Fill in the queryInbound8 here
                

                stub.startqueryInbound(
                         queryInbound8,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.referencetracker.ReferenceTrackerEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultqueryInbound(
                         net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryInboundResponse result
                            ) {
                
            }

            public void receiveErrorqueryInbound(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testqueryOutbound() throws java.lang.Exception{

        net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub stub =
                    new net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryOutbound queryOutbound10=
                                                        (net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryOutbound)getTestObject(net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryOutbound.class);
                    // TODO : Fill in the queryOutbound10 here
                
                        assertNotNull(stub.queryOutbound(
                        queryOutbound10));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartqueryOutbound() throws java.lang.Exception{
            net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub stub = new net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub();
             net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryOutbound queryOutbound10=
                                                        (net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryOutbound)getTestObject(net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryOutbound.class);
                    // TODO : Fill in the queryOutbound10 here
                

                stub.startqueryOutbound(
                         queryOutbound10,
                    new tempCallbackN1005D()
                );
              


        }

        private class tempCallbackN1005D  extends net.idea.i5wscli.referencetracker.ReferenceTrackerEngineCallbackHandler{
            public tempCallbackN1005D(){ super(null);}

            public void receiveResultqueryOutbound(
                         net.idea.i5wscli.referencetracker.ReferenceTrackerEngineStub.QueryOutboundResponse result
                            ) {
                
            }

            public void receiveErrorqueryOutbound(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    