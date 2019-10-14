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

class findPetsByTags_200 {

    private static ApiResponseParser apiResponseParser;

    @BeforeClass
    public static void beforeClass() throws IOException {
        apiResponseParser = new ApiResponseParser();
        
        
    }

	@Test
	public void findPetsByTags_TEST_200() throws Exception {
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
	{
		// Test Step findPetsByStatus
	
		java.lang.String string1111897955 = java.lang.String.valueOf("available");
		java.lang.String string1509309988 = java.lang.String.valueOf("pending");
		java.lang.String string1643141512 = java.lang.String.valueOf("sold");
		List<Object> arraylist2091072548 = new ArrayList<>();
		arraylist2091072548.add(string1111897955);
		arraylist2091072548.add(string1509309988);
		arraylist2091072548.add(string1643141512);
		arraylist2091072548.add(string1111897955);
	
		ExecutionResult executionresult263053820;
		try {
			// API Call
			Object returnValue_executionresult263053820 = new PetApi().findPetsByStatusWithHttpInfo(arraylist2091072548);
			executionresult263053820 = apiResponseParser.parseApiResponseObject(ReflectionHelper.getMethodByName(PetApi.class, "findPetsByStatusWithHttpInfo"), returnValue_executionresult263053820);
		} catch (InvocationTargetException e) {
			// Here, if request executed with http error code
			Throwable targetException = e.getTargetException();
			if (targetException.toString().contains("io.swagger.client.ApiException")){
				executionresult263053820 = apiResponseParser.parseApiExceptionObject(targetException);
			} else {
				throw new OperationExecutionException("Exception during the execution of operation", e);
			}
		} catch (IllegalAccessException e) {
			throw new OperationExecutionException("Illegal access to method", e);
		}
	
		assertTrue(executionresult263053820.getStatusCode() == 200);
	
		assertEquals(0, executionresult263053820.getValidationErrors().size());
	
	}
	{
		// Test Step findPetsByTags
	
		String string1600594643 = "tOShCf";
		List<Object> arraylist1368862151 = new ArrayList<>();
		arraylist1368862151.add(string1600594643);
	
		ExecutionResult executionresult922807452;
		try {
			// API Call
			Object returnValue_executionresult922807452 = new PetApi().findPetsByTagsWithHttpInfo(arraylist1368862151);
			executionresult922807452 = apiResponseParser.parseApiResponseObject(ReflectionHelper.getMethodByName(PetApi.class, "findPetsByTagsWithHttpInfo"), returnValue_executionresult922807452);
		} catch (InvocationTargetException e) {
			// Here, if request executed with http error code
			Throwable targetException = e.getTargetException();
			if (targetException.toString().contains("io.swagger.client.ApiException")){
				executionresult922807452 = apiResponseParser.parseApiExceptionObject(targetException);
			} else {
				throw new OperationExecutionException("Exception during the execution of operation", e);
			}
		} catch (IllegalAccessException e) {
			throw new OperationExecutionException("Illegal access to method", e);
		}
	
		assertTrue(executionresult922807452.getStatusCode() == 200);
	
		assertEquals(0, executionresult922807452.getValidationErrors().size());
	
	}
	}

}
