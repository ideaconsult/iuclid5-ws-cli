

/**
 * QueryToolEngineTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package net.idea.i5wscli.test;

    /*
     *  QueryToolEngineTest Junit test case
    */

    public class QueryToolEngineTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testexecuteQuery() throws java.lang.Exception{

        net.idea.i5wscli.querytool.QueryToolEngineStub stub =
                    new net.idea.i5wscli.querytool.QueryToolEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.querytool.QueryToolEngineStub.ExecuteQueryExpression executeQueryExpression8=
                                                        (net.idea.i5wscli.querytool.QueryToolEngineStub.ExecuteQueryExpression)getTestObject(net.idea.i5wscli.querytool.QueryToolEngineStub.ExecuteQueryExpression.class);
                    // TODO : Fill in the executeQueryExpression8 here
                
                        assertNotNull(stub.executeQuery(
                        executeQueryExpression8));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartexecuteQuery() throws java.lang.Exception{
            net.idea.i5wscli.querytool.QueryToolEngineStub stub = new net.idea.i5wscli.querytool.QueryToolEngineStub();
             net.idea.i5wscli.querytool.QueryToolEngineStub.ExecuteQueryExpression executeQueryExpression8=
                                                        (net.idea.i5wscli.querytool.QueryToolEngineStub.ExecuteQueryExpression)getTestObject(net.idea.i5wscli.querytool.QueryToolEngineStub.ExecuteQueryExpression.class);
                    // TODO : Fill in the executeQueryExpression8 here
                

                stub.startexecuteQuery(
                         executeQueryExpression8,
                    new tempCallbackN1000C()
                );
              


        }

        private class tempCallbackN1000C  extends net.idea.i5wscli.querytool.QueryToolEngineCallbackHandler{
            public tempCallbackN1000C(){ super(null);}

            public void receiveResultexecuteQuery(
                         net.idea.i5wscli.querytool.QueryToolEngineStub.ExecuteQueryExpressionResponse result
                            ) {
                
            }

            public void receiveErrorexecuteQuery(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testcountQuery() throws java.lang.Exception{

        net.idea.i5wscli.querytool.QueryToolEngineStub stub =
                    new net.idea.i5wscli.querytool.QueryToolEngineStub();//the default implementation should point to the right endpoint

           net.idea.i5wscli.querytool.QueryToolEngineStub.CountQueryExpression countQueryExpression10=
                                                        (net.idea.i5wscli.querytool.QueryToolEngineStub.CountQueryExpression)getTestObject(net.idea.i5wscli.querytool.QueryToolEngineStub.CountQueryExpression.class);
                    // TODO : Fill in the countQueryExpression10 here
                
                        assertNotNull(stub.countQuery(
                        countQueryExpression10));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcountQuery() throws java.lang.Exception{
            net.idea.i5wscli.querytool.QueryToolEngineStub stub = new net.idea.i5wscli.querytool.QueryToolEngineStub();
             net.idea.i5wscli.querytool.QueryToolEngineStub.CountQueryExpression countQueryExpression10=
                                                        (net.idea.i5wscli.querytool.QueryToolEngineStub.CountQueryExpression)getTestObject(net.idea.i5wscli.querytool.QueryToolEngineStub.CountQueryExpression.class);
                    // TODO : Fill in the countQueryExpression10 here
                

                stub.startcountQuery(
                         countQueryExpression10,
                    new tempCallbackN10071()
                );
              


        }

        private class tempCallbackN10071  extends net.idea.i5wscli.querytool.QueryToolEngineCallbackHandler{
            public tempCallbackN10071(){ super(null);}

            public void receiveResultcountQuery(
                         net.idea.i5wscli.querytool.QueryToolEngineStub.CountQueryExpressionResponse result
                            ) {
                
            }

            public void receiveErrorcountQuery(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    