package com.ice.av.sample.test.integration;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.cxf.helpers.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractIntegrationTest {
	
	private static final Logger log = LoggerFactory.getLogger(AbstractIntegrationTest.class);

	
	public String sendPost(String input, final int expectedResponseCode) throws IOException, UnsupportedEncodingException, ClientProtocolException {
        CloseableHttpClient httpclient = HttpClients.createDefault();

        try {
            HttpPost httpPost = new HttpPost("http://localhost:8080/transactions");

            log.debug("Executing request {}", httpPost.getRequestLine());

            HttpEntity reqEntity = new StringEntity(input);
            httpPost.setEntity(reqEntity);

            httpPost.addHeader("Content-Type","application/json");
            CloseableHttpResponse response = httpclient.execute(httpPost);
            Assert.assertNotNull(response);
            Assert.assertEquals(expectedResponseCode, response.getStatusLine().getStatusCode());
            String responseBody = IOUtils.readStringFromStream(response.getEntity().getContent());
            log.debug("----------------------------------------\n Response Body {}" , responseBody);
            return responseBody;
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            httpclient.close();
        }
        return null;
    }

}
