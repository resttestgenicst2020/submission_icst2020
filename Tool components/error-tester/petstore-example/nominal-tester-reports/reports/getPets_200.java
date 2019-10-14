import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import io.swagger.client.*;
import io.swagger.client.api.*;
import io.swagger.client.model.*;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;
import org.junit.*;

import com.bpr.resttestgen.helper.ApiResponseParser;
import com.bpr.resttestgen.helper.ReflectionHelper;
import com.bpr.resttestgen.models.ExecutionResult;
import com.bpr.resttestgen.testgenerator.exceptions.OperationExecutionException;

class getPets_200 {

    private static ApiResponseParser apiResponseParser;

    @BeforeClass
    public static void beforeClass() throws IOException {
        apiResponseParser = new ApiResponseParser();
        
        
    }

	@Test
	public void getPets_TEST_200() throws Exception {
	{
		// Test Step getPets
	
		ExecutionResult executionresult1376151044;
		try {
			// API Call
			Object returnValue_executionresult1376151044 = new PetApi().getPetsWithHttpInfo();
			executionresult1376151044 = apiResponseParser.parseApiResponseObject(ReflectionHelper.getMethodByName(PetApi.class, "getPetsWithHttpInfo"), returnValue_executionresult1376151044);
		} catch (InvocationTargetException e) {
			// Here, if request executed with http error code
			Throwable targetException = e.getTargetException();
			if (targetException.toString().contains("io.swagger.client.ApiException")){
				executionresult1376151044 = apiResponseParser.parseApiExceptionObject(targetException);
			} else {
				throw new OperationExecutionException("Exception during the execution of operation", e);
			}
		} catch (IllegalAccessException e) {
			throw new OperationExecutionException("Illegal access to method", e);
		}
	
		assertTrue(executionresult1376151044.getStatusCode() == 200);
	
		assertEquals(0, executionresult1376151044.getValidationErrors().size());
	
	}
	}

}
