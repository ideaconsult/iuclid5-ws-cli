

/**
 * SessionEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

import net.idea.i5wscli.PropertiesUtil;
import net.idea.i5wscli.StubUtil;
import net.idea.i5wscli.session.SessionEngineStub.Credentials;
import net.idea.i5wscli.session.SessionEngineStub.LoginResponse;
import net.idea.i5wscli.session.SessionEngineStub.Session;

    /*
     *  SessionEngineTest Junit test case
    */

    public class SessionEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testlogout() throws java.lang.Exception{

        net.idea.i5wscli.session.SessionEngineStub stub =
                    new net.idea.i5wscli.session.SessionEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.session.SessionEngineStub.Logout logout12=
                                                        (net.idea.i5wscli.session.SessionEngineStub.Logout)getTestObject(net.idea.i5wscli.session.SessionEngineStub.Logout.class);
                    // TODO : Fill in the logout12 here
	   		Session param=null;
    		logout12.setSession(param);

                        assertNotNull(stub.logout(
                        logout12));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartlogout() throws java.lang.Exception{
            net.idea.i5wscli.session.SessionEngineStub stub = new net.idea.i5wscli.session.SessionEngineStub();
             net.idea.i5wscli.session.SessionEngineStub.Logout logout12=
                                                        (net.idea.i5wscli.session.SessionEngineStub.Logout)getTestObject(net.idea.i5wscli.session.SessionEngineStub.Logout.class);
                    // TODO : Fill in the logout12 here
                

                stub.startlogout(
                         logout12,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.session.SessionEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultlogout(
                         net.idea.i5wscli.session.SessionEngineStub.EmptyResponse result
                            ) {
                
            }

            public void receiveErrorlogout(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testlogin() throws java.lang.Exception{

        net.idea.i5wscli.session.SessionEngineStub stub =
                    new net.idea.i5wscli.session.SessionEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.session.SessionEngineStub.Login login14=
                                                        (net.idea.i5wscli.session.SessionEngineStub.Login)getTestObject(net.idea.i5wscli.session.SessionEngineStub.Login.class);
                    // TODO : Fill in the login14 here
	   		Credentials credentials = new Credentials();
			credentials.setUsername(PropertiesUtil.getUsername());
			credentials.setPassword(StubUtil.encryptPassword(PropertiesUtil.getPassword()));
    		login14.setCredentials(credentials);
    		LoginResponse loginResponse = stub.login(login14);
    		Session session = loginResponse.getSession();
            assertNotNull(loginResponse);
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartlogin() throws java.lang.Exception{
            net.idea.i5wscli.session.SessionEngineStub stub = new net.idea.i5wscli.session.SessionEngineStub();
             net.idea.i5wscli.session.SessionEngineStub.Login login14=
                                                        (net.idea.i5wscli.session.SessionEngineStub.Login)getTestObject(net.idea.i5wscli.session.SessionEngineStub.Login.class);
                    // TODO : Fill in the login14 here
                

                stub.startlogin(
                         login14,
                    new tempCallbackN1005D()
                );
              


        }

        private class tempCallbackN1005D  extends net.idea.i5wscli.session.SessionEngineCallbackHandler{
            public tempCallbackN1005D(){ super(null);}

            public void receiveResultlogin(
                         net.idea.i5wscli.session.SessionEngineStub.LoginResponse result
                            ) {
                
            }

            public void receiveErrorlogin(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testgetWebServiceVersion() throws java.lang.Exception{

        net.idea.i5wscli.session.SessionEngineStub stub =
                    new net.idea.i5wscli.session.SessionEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.session.SessionEngineStub.EmptyRequest emptyRequest16=
                                                        (net.idea.i5wscli.session.SessionEngineStub.EmptyRequest)getTestObject(net.idea.i5wscli.session.SessionEngineStub.EmptyRequest.class);
                    // TODO : Fill in the emptyRequest16 here
                
                        assertNotNull(stub.getWebServiceVersion(
                        emptyRequest16));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartgetWebServiceVersion() throws java.lang.Exception{
            net.idea.i5wscli.session.SessionEngineStub stub = new net.idea.i5wscli.session.SessionEngineStub();
             net.idea.i5wscli.session.SessionEngineStub.EmptyRequest emptyRequest16=
                                                        (net.idea.i5wscli.session.SessionEngineStub.EmptyRequest)getTestObject(net.idea.i5wscli.session.SessionEngineStub.EmptyRequest.class);
                    // TODO : Fill in the emptyRequest16 here
                

                stub.startgetWebServiceVersion(
                         emptyRequest16,
                    new tempCallbackN100AE()
                );
              


        }

        private class tempCallbackN100AE  extends net.idea.i5wscli.session.SessionEngineCallbackHandler{
            public tempCallbackN100AE(){ super(null);}

            public void receiveResultgetWebServiceVersion(
                         net.idea.i5wscli.session.SessionEngineStub.Version result
                            ) {
                
            }

            public void receiveErrorgetWebServiceVersion(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    