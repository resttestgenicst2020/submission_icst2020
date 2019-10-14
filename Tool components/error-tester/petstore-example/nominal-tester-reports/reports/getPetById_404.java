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

class getPetById_404 {

    private static ApiResponseParser apiResponseParser;

    @BeforeClass
    public static void beforeClass() throws IOException {
        apiResponseParser = new ApiResponseParser();
        
        
    }

	@Test
	public void getPetById_TEST_404() throws Exception {
	{
		// Test Step getPetById
	
		Long long1914108708 = Long.valueOf("-7488964475995776912");
	
		ExecutionResult executionresult544386226;
		try {
			// API Call
			Object returnValue_executionresult544386226 = new PetApi().getPetByIdWithHttpInfo(long1914108708);
			executionresult544386226 = apiResponseParser.parseApiResponseObject(ReflectionHelper.getMethodByName(PetApi.class, "getPetByIdWithHttpInfo"), returnValue_executionresult544386226);
		} catch (InvocationTargetException e) {
			// Here, if request executed with http error code
			Throwable targetException = e.getTargetException();
			if (targetException.toString().contains("io.swagger.client.ApiException")){
				executionresult544386226 = apiResponseParser.parseApiExceptionObject(targetException);
			} else {
				throw new OperationExecutionException("Exception during the execution of operation", e);
			}
		} catch (IllegalAccessException e) {
			throw new OperationExecutionException("Illegal access to method", e);
		}
	
		assertTrue(executionresult544386226.getStatusCode() == 404);
	
		assertEquals(0, executionresult544386226.getValidationErrors().size());
	
	}
	}

}
