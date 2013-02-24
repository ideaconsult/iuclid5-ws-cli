

/**
 * VersionTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  VersionTest Junit test case
    */

    public class VersionTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetVersion() throws java.lang.Exception{

        net.idea.i5wscli.version.VersionStub stub =
                    new net.idea.i5wscli.version.VersionStub();//the default implementation should point to the right endpoint

           
                        assertNotNull(stub.getVersion(
                        ));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetVersion() throws java.lang.Exception{
            net.idea.i5wscli.version.VersionStub stub = new net.idea.i5wscli.version.VersionStub();
             

                stub.startgetVersion(
                         
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.version.VersionCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultgetVersion(
                         net.idea.i5wscli.version.VersionStub.GetVersionResponse result
                            ) {
                
            }

            public void receiveErrorgetVersion(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    