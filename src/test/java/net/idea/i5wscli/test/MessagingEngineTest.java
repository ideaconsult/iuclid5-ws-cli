

/**
 * MessagingEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  MessagingEngineTest Junit test case
    */

    public class MessagingEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testbroadcastShowDocument() throws java.lang.Exception{

        net.idea.i5wscli.messaging.MessagingEngineStub stub =
                    new net.idea.i5wscli.messaging.MessagingEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.messaging.MessagingEngineStub.BroadcastShowDocument broadcastShowDocument4=
                                                        (net.idea.i5wscli.messaging.MessagingEngineStub.BroadcastShowDocument)getTestObject(net.idea.i5wscli.messaging.MessagingEngineStub.BroadcastShowDocument.class);
                    // TODO : Fill in the broadcastShowDocument4 here
                
                        assertNotNull(stub.broadcastShowDocument(
                        broadcastShowDocument4));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartbroadcastShowDocument() throws java.lang.Exception{
            net.idea.i5wscli.messaging.MessagingEngineStub stub = new net.idea.i5wscli.messaging.MessagingEngineStub();
             net.idea.i5wscli.messaging.MessagingEngineStub.BroadcastShowDocument broadcastShowDocument4=
                                                        (net.idea.i5wscli.messaging.MessagingEngineStub.BroadcastShowDocument)getTestObject(net.idea.i5wscli.messaging.MessagingEngineStub.BroadcastShowDocument.class);
                    // TODO : Fill in the broadcastShowDocument4 here
                

                stub.startbroadcastShowDocument(
                         broadcastShowDocument4,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.messaging.MessagingEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultbroadcastShowDocument(
                         net.idea.i5wscli.messaging.MessagingEngineStub.EmptyResponse result
                            ) {
                
            }

            public void receiveErrorbroadcastShowDocument(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    