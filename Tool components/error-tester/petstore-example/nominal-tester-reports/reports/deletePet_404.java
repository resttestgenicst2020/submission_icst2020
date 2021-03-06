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

class deletePet_404 {

    private static ApiResponseParser apiResponseParser;

    @BeforeClass
    public static void beforeClass() throws IOException {
        apiResponseParser = new ApiResponseParser();
        
        
    }

	@Test
	public void deletePet_TEST_404() throws Exception {
	{
		// Test Step deletePet
	
		Long long1357700757 = Long.valueOf("-116042446451639720");
	
		String string900298796 = "RS";
	
		ExecutionResult executionresult1889757798;
		try {
			// API Call
			Object returnValue_executionresult1889757798 = new PetApi().deletePetWithHttpInfo(long1357700757,string900298796);
			executionresult1889757798 = apiResponseParser.parseApiResponseObject(ReflectionHelper.getMethodByName(PetApi.class, "deletePetWithHttpInfo"), returnValue_executionresult1889757798);
		} catch (InvocationTargetException e) {
			// Here, if request executed with http error code
			Throwable targetException = e.getTargetException();
			if (targetException.toString().contains("io.swagger.client.ApiException")){
				executionresult1889757798 = apiResponseParser.parseApiExceptionObject(targetException);
			} else {
				throw new OperationExecutionException("Exception during the execution of operation", e);
			}
		} catch (IllegalAccessException e) {
			throw new OperationExecutionException("Illegal access to method", e);
		}
	
		assertTrue(executionresult1889757798.getStatusCode() == 404);
	
		assertEquals(0, executionresult1889757798.getValidationErrors().size());
	
	}
	}

}
