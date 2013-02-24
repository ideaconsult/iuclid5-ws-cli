

/**
 * ResourceEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  ResourceEngineTest Junit test case
    */

    public class ResourceEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testgetAvailableLanguages() throws java.lang.Exception{

        net.idea.i5wscli.resource.ResourceEngineStub stub =
                    new net.idea.i5wscli.resource.ResourceEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.resource.ResourceEngineStub.GetAvailableLanguages getAvailableLanguages8=
                                                        (net.idea.i5wscli.resource.ResourceEngineStub.GetAvailableLanguages)getTestObject(net.idea.i5wscli.resource.ResourceEngineStub.GetAvailableLanguages.class);
                    // TODO : Fill in the getAvailableLanguages8 here
                
                        assertNotNull(stub.getAvailableLanguages(
                        getAvailableLanguages8));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetAvailableLanguages() throws java.lang.Exception{
            net.idea.i5wscli.resource.ResourceEngineStub stub = new net.idea.i5wscli.resource.ResourceEngineStub();
             net.idea.i5wscli.resource.ResourceEngineStub.GetAvailableLanguages getAvailableLanguages8=
                                                        (net.idea.i5wscli.resource.ResourceEngineStub.GetAvailableLanguages)getTestObject(net.idea.i5wscli.resource.ResourceEngineStub.GetAvailableLanguages.class);
                    // TODO : Fill in the getAvailableLanguages8 here
                

                stub.startgetAvailableLanguages(
                         getAvailableLanguages8,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.resource.ResourceEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultgetAvailableLanguages(
                         net.idea.i5wscli.resource.ResourceEngineStub.GetAvailableLanguagesResponse result
                            ) {
                
            }

            public void receiveErrorgetAvailableLanguages(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetResource() throws java.lang.Exception{

        net.idea.i5wscli.resource.ResourceEngineStub stub =
                    new net.idea.i5wscli.resource.ResourceEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.resource.ResourceEngineStub.GetResource getResource10=
                                                        (net.idea.i5wscli.resource.ResourceEngineStub.GetResource)getTestObject(net.idea.i5wscli.resource.ResourceEngineStub.GetResource.class);
                    // TODO : Fill in the getResource10 here
                
                        assertNotNull(stub.getResource(
                        getResource10));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetResource() throws java.lang.Exception{
            net.idea.i5wscli.resource.ResourceEngineStub stub = new net.idea.i5wscli.resource.ResourceEngineStub();
             net.idea.i5wscli.resource.ResourceEngineStub.GetResource getResource10=
                                                        (net.idea.i5wscli.resource.ResourceEngineStub.GetResource)getTestObject(net.idea.i5wscli.resource.ResourceEngineStub.GetResource.class);
                    // TODO : Fill in the getResource10 here
                

                stub.startgetResource(
                         getResource10,
                    new tempCallbackN1005D()
                );
              


        }

        private class tempCallbackN1005D  extends net.idea.i5wscli.resource.ResourceEngineCallbackHandler{
            public tempCallbackN1005D(){ super(null);}

            public void receiveResultgetResource(
                         net.idea.i5wscli.resource.ResourceEngineStub.GetResourceResponse result
                            ) {
                
            }

            public void receiveErrorgetResource(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    