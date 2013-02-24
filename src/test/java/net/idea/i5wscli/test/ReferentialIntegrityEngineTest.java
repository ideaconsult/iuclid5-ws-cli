

/**
 * ReferentialIntegrityEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  ReferentialIntegrityEngineTest Junit test case
    */

    public class ReferentialIntegrityEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testcheck() throws java.lang.Exception{

        net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub stub =
                    new net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub.Check check4=
                                                        (net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub.Check)getTestObject(net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub.Check.class);
                    // TODO : Fill in the check4 here
                
                        assertNotNull(stub.check(
                        check4));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcheck() throws java.lang.Exception{
            net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub stub = new net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub();
             net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub.Check check4=
                                                        (net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub.Check)getTestObject(net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub.Check.class);
                    // TODO : Fill in the check4 here
                

                stub.startcheck(
                         check4,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultcheck(
                         net.idea.i5wscli.referentialintegrity.ReferentialIntegrityEngineStub.EmptyResponse result
                            ) {
                
            }

            public void receiveErrorcheck(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    