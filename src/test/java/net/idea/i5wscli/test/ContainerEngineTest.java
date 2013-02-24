

/**
 * ContainerEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  ContainerEngineTest Junit test case
    */

    public class ContainerEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testdownloadContainer() throws java.lang.Exception{

        net.idea.i5wscli.container.ContainerEngineStub stub =
                    new net.idea.i5wscli.container.ContainerEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.container.ContainerEngineStub.DownloadContainerE downloadContainer12=
                                                        (net.idea.i5wscli.container.ContainerEngineStub.DownloadContainerE)getTestObject(net.idea.i5wscli.container.ContainerEngineStub.DownloadContainerE.class);
                    // TODO : Fill in the downloadContainer12 here
                
                        assertNotNull(stub.downloadContainer(
                        downloadContainer12));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartdownloadContainer() throws java.lang.Exception{
            net.idea.i5wscli.container.ContainerEngineStub stub = new net.idea.i5wscli.container.ContainerEngineStub();
             net.idea.i5wscli.container.ContainerEngineStub.DownloadContainerE downloadContainer12=
                                                        (net.idea.i5wscli.container.ContainerEngineStub.DownloadContainerE)getTestObject(net.idea.i5wscli.container.ContainerEngineStub.DownloadContainerE.class);
                    // TODO : Fill in the downloadContainer12 here
                

                stub.startdownloadContainer(
                         downloadContainer12,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.container.ContainerEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultdownloadContainer(
                         net.idea.i5wscli.container.ContainerEngineStub.DownloadContainerResponse result
                            ) {
                
            }

            public void receiveErrordownloadContainer(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testimportExternalContainer() throws java.lang.Exception{

        net.idea.i5wscli.container.ContainerEngineStub stub =
                    new net.idea.i5wscli.container.ContainerEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.container.ContainerEngineStub.ImportExternalContainer importExternalContainer14=
                                                        (net.idea.i5wscli.container.ContainerEngineStub.ImportExternalContainer)getTestObject(net.idea.i5wscli.container.ContainerEngineStub.ImportExternalContainer.class);
                    // TODO : Fill in the importExternalContainer14 here
                
                        assertNotNull(stub.importExternalContainer(
                        importExternalContainer14));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartimportExternalContainer() throws java.lang.Exception{
            net.idea.i5wscli.container.ContainerEngineStub stub = new net.idea.i5wscli.container.ContainerEngineStub();
             net.idea.i5wscli.container.ContainerEngineStub.ImportExternalContainer importExternalContainer14=
                                                        (net.idea.i5wscli.container.ContainerEngineStub.ImportExternalContainer)getTestObject(net.idea.i5wscli.container.ContainerEngineStub.ImportExternalContainer.class);
                    // TODO : Fill in the importExternalContainer14 here
                

                stub.startimportExternalContainer(
                         importExternalContainer14,
                    new tempCallbackN10085()
                );
              


        }

        private class tempCallbackN10085  extends net.idea.i5wscli.container.ContainerEngineCallbackHandler{
            public tempCallbackN10085(){ super(null);}

            public void receiveResultimportExternalContainer(
                         net.idea.i5wscli.container.ContainerEngineStub.ImportExternalContainerResponse result
                            ) {
                
            }

            public void receiveErrorimportExternalContainer(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testuploadContainer() throws java.lang.Exception{

        net.idea.i5wscli.container.ContainerEngineStub stub =
                    new net.idea.i5wscli.container.ContainerEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.container.ContainerEngineStub.UploadContainer uploadContainer16=
                                                        (net.idea.i5wscli.container.ContainerEngineStub.UploadContainer)getTestObject(net.idea.i5wscli.container.ContainerEngineStub.UploadContainer.class);
                    // TODO : Fill in the uploadContainer16 here
                
                        assertNotNull(stub.uploadContainer(
                        uploadContainer16));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartuploadContainer() throws java.lang.Exception{
            net.idea.i5wscli.container.ContainerEngineStub stub = new net.idea.i5wscli.container.ContainerEngineStub();
             net.idea.i5wscli.container.ContainerEngineStub.UploadContainer uploadContainer16=
                                                        (net.idea.i5wscli.container.ContainerEngineStub.UploadContainer)getTestObject(net.idea.i5wscli.container.ContainerEngineStub.UploadContainer.class);
                    // TODO : Fill in the uploadContainer16 here
                

                stub.startuploadContainer(
                         uploadContainer16,
                    new tempCallbackN100EA()
                );
              


        }

        private class tempCallbackN100EA  extends net.idea.i5wscli.container.ContainerEngineCallbackHandler{
            public tempCallbackN100EA(){ super(null);}

            public void receiveResultuploadContainer(
                         net.idea.i5wscli.container.ContainerEngineStub.UploadContainerResponse result
                            ) {
                
            }

            public void receiveErroruploadContainer(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    