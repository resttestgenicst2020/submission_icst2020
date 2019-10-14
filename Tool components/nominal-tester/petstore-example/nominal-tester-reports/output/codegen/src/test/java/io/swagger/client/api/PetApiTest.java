/*
 * Swagger Petstore
 * This is a fork of Petstore server specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: emavgl@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Pet;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PetApi
 */
@Ignore
public class PetApiTest {

    private final PetApi api = new PetApi();

    /**
     * Add a new pet to the store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPetTest() throws ApiException {
        Pet body = null;
        Pet response = api.addPet(body);

        // TODO: test validations
    }
    /**
     * Deletes a pet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePetTest() throws ApiException {
        Long petId = null;
        String apiKey = null;
        api.deletePet(petId, apiKey);

        // TODO: test validations
    }
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() throws ApiException {
        List<String> status = null;
        List<Pet> response = api.findPetsByStatus(status);

        // TODO: test validations
    }
    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() throws ApiException {
        List<String> tags = null;
        List<Pet> response = api.findPetsByTags(tags);

        // TODO: test validations
    }
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPetByIdTest() throws ApiException {
        Long petId = null;
        Pet response = api.getPetById(petId);

        // TODO: test validations
    }
    /**
     * Get List of Pets
     *
     * Get List of Pets
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPetsTest() throws ApiException {
        List<Pet> response = api.getPets();

        // TODO: test validations
    }
    /**
     * Update an existing pet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePetTest() throws ApiException {
        Pet body = null;
        Pet response = api.updatePet(body);

        // TODO: test validations
    }
}
