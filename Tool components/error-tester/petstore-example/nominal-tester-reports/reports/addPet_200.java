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

class addPet_200 {

    private static ApiResponseParser apiResponseParser;

    @BeforeClass
    public static void beforeClass() throws IOException {
        apiResponseParser = new ApiResponseParser();
        
        
    }

	@Test
	public void addPet_TEST_200() throws Exception {
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
	{
		// Test Step addPet
	
		Pet pet1924990666 = new Pet();
		Long long144445623 = Long.valueOf("3089703816923003002");
		pet1924990666.setId(long144445623);
		Category category1572745406 = new Category();
		Long long1340644388 = Long.valueOf("-1044756419685828537");
		category1572745406.setId(long1340644388);
		String string1434015813 = "vIGWSyXaUeHW";
		category1572745406.setName(string1434015813);
		pet1924990666.setCategory(category1572745406);
		String string1023996917 = "doggie";
		pet1924990666.setName(string1023996917);
		String string295640874 = "FihxQXJyEkfi";
		String string438151297 = "HIhGUWSQjufk";
		String string96039159 = "wTaMVNVxGRSG";
		String string2144644334 = "iGqcaoBqhjWZ";
		String string375097969 = "cTVB";
		String string1635082651 = "NlZKtlJYjRAEfk";
		List<Object> arraylist788892554 = new ArrayList<>();
		arraylist788892554.add(string295640874);
		arraylist788892554.add(string438151297);
		arraylist788892554.add(string96039159);
		arraylist788892554.add(string2144644334);
		arraylist788892554.add(string375097969);
		arraylist788892554.add(string1635082651);
		pet1924990666.setPhotoUrls(arraylist788892554);
		Tag tag1970073944 = new Tag();
		Long long1060042118 = Long.valueOf("-3928863812351958658");
		tag1970073944.setId(long1060042118);
		String string1964847681 = "trOQVRLXszLHgvkLhGk";
		tag1970073944.setName(string1964847681);
		Tag tag1992801971 = new Tag();
		Long long1681094402 = Long.valueOf("-327677751494739256");
		tag1992801971.setId(long1681094402);
		String string754527431 = "FtfczCSl";
		tag1992801971.setName(string754527431);
		Tag tag820677667 = new Tag();
		Long long2064883371 = Long.valueOf("-7400273271666676018");
		tag820677667.setId(long2064883371);
		String string82275756 = "RnhKwLjvXPE";
		tag820677667.setName(string82275756);
		Tag tag1629353699 = new Tag();
		Long long99808631 = Long.valueOf("456848481802360402");
		tag1629353699.setId(long99808631);
		String string1651754404 = "IwdLlHWGLqTGXJqYmZ";
		tag1629353699.setName(string1651754404);
		Tag tag1564892747 = new Tag();
		Long long1407324654 = Long.valueOf("2785912134899724298");
		tag1564892747.setId(long1407324654);
		String string1101598632 = "aYqzoGutwwAmY";
		tag1564892747.setName(string1101598632);
		Tag tag1032568028 = new Tag();
		Long long1380976928 = Long.valueOf("-462630831041320369");
		tag1032568028.setId(long1380976928);
		String string293474277 = "r";
		tag1032568028.setName(string293474277);
		Tag tag413373997 = new Tag();
		Long long2024711353 = Long.valueOf("-1815628445708685612");
		tag413373997.setId(long2024711353);
		String string711310213 = "shTJi";
		tag413373997.setName(string711310213);
		List<Object> arraylist1267042315 = new ArrayList<>();
		arraylist1267042315.add(tag1970073944);
		arraylist1267042315.add(tag1992801971);
		arraylist1267042315.add(tag820677667);
		arraylist1267042315.add(tag1629353699);
		arraylist1267042315.add(tag1564892747);
		arraylist1267042315.add(tag1032568028);
		arraylist1267042315.add(tag413373997);
		pet1924990666.setTags(arraylist1267042315);
		io.swagger.client.model.Pet.StatusEnum statusenum1335061928 = io.swagger.client.model.Pet.StatusEnum.fromValue("pending");
		pet1924990666.setStatus(statusenum1335061928);
	
		ExecutionResult executionresult1108706191;
		try {
			// API Call
			Object returnValue_executionresult1108706191 = new PetApi().addPetWithHttpInfo(pet1924990666);
			executionresult1108706191 = apiResponseParser.parseApiResponseObject(ReflectionHelper.getMethodByName(PetApi.class, "addPetWithHttpInfo"), returnValue_executionresult1108706191);
		} catch (InvocationTargetException e) {
			// Here, if request executed with http error code
			Throwable targetException = e.getTargetException();
			if (targetException.toString().contains("io.swagger.client.ApiException")){
				executionresult1108706191 = apiResponseParser.parseApiExceptionObject(targetException);
			} else {
				throw new OperationExecutionException("Exception during the execution of operation", e);
			}
		} catch (IllegalAccessException e) {
			throw new OperationExecutionException("Illegal access to method", e);
		}
	
		assertTrue(executionresult1108706191.getStatusCode() == 200);
	
		assertEquals(0, executionresult1108706191.getValidationErrors().size());
	
	}
	}

}
