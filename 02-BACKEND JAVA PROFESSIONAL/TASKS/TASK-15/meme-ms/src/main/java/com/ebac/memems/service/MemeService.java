package com.ebac.memems.service;

import com.ebac.memems.apiwebflux.APIServiceCategory;
import com.ebac.memems.apiwebflux.APIServiceUser;
import com.ebac.memems.entity.Meme;
import com.ebac.memems.exceptions.APIResponseException;
import com.ebac.memems.repository.MemeRepository;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MemeService {
    Logger logger = LogManager.getLogger(MemeService.class);

    @Autowired
    private MemeRepository repository;

    @Autowired
    private APIServiceUser apiUser;

    @Autowired
    private APIServiceCategory apiCategory;

    private Meme meme;

    /**
     * Retrieves all the memes from the repository and logs the count of memes.
     *
     * @return  a list of Meme objects representing all the memes in the repository
     */
    public List<Meme> getAll(){
        logger.info("\u001B[34mSearching memes list: " + repository.count());
        return repository.findAll();
    }

    /**
     * Retrieves a specific meme by its ID.
     *
     * @param  id   the unique identifier of the meme
     * @return      the Meme object corresponding to the provided ID
     */
    public Meme getMeme(Long id){
        logger.info("\u001B[34mSearching meme id: " + id);
        return repository.findById(id).get();
    }

    /**
     * Creates a new meme in the repository after checking if the category and user are valid.
     *
     * @param  meme   the Meme object to be created
     * @return        returns the saved Meme object if creation is successful, otherwise returns an error log
     */
    public Object create(Meme meme) throws APIResponseException {
        StringBuilder errorLog = new StringBuilder();

        boolean isValidCategory = isCategoryInAPIResponse(meme);
        boolean isValidUser = isUserNameInAPIResponse(meme);

        if (!isValidCategory) {
            logger.error("Category not found: " + meme.getCategory());
            errorLog.append("Category not found: ").append(meme.getCategory());
        }

        if (!isValidUser) {
            if (errorLog.length() > 0) {
                errorLog.append(" " +
                        ";" + " ");
            }
            logger.error("User not found: " + meme.getUser());
            errorLog.append("User not found: ").append(meme.getUser());
        }

        if (errorLog.length() > 0) {
            throw new APIResponseException(errorLog.toString());
        }

        if (isValidCategory && isValidUser) {
            logger.info("\u001B[34mMeme inserted sucessfully! :" + meme.getName());
            return repository.save(meme);
        }
        return errorLog.toString();
    }

    /**
     * Retrieves whether the provided user name is found in the API response.
     *
     * @param  meme   the Meme object containing the user name to search for
     * @return        true if the user name is found in the API response, false otherwise
     */
    public boolean isUserNameInAPIResponse(Meme meme) {
        String targetUserName = meme.getUser();
        String apiResponse = apiUser.fetchDataFromApi();

        JsonArray usersArray = new Gson().fromJson(apiResponse, JsonArray.class);

        for (JsonElement userElement : usersArray) {
            JsonObject userObject = userElement.getAsJsonObject();
            String name = userObject.get("name").getAsString();

            if (name.equals(targetUserName)) {
                System.out.println("User found");
                return true;
            }
        }
        System.out.println("User not found");
        return false;
    }

    /**
     * Determines whether the given category exists in the API response.
     *
     * @param  meme  the Meme object containing the category to search for
     * @return       true if the category exists in the API response, false otherwise
     */
    public boolean isCategoryInAPIResponse(Meme meme) {
        String targetCategoryName = meme.getCategory();
        String apiResponse = apiCategory.fetchDataFromApi();

        JsonArray categoriesArray = new Gson().fromJson(apiResponse, JsonArray.class);

        for (JsonElement categoryElement : categoriesArray) {
            JsonObject categoryObject = categoryElement.getAsJsonObject();
            String category = categoryObject.get("name").getAsString();

            if (category.equals(targetCategoryName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retrieves memes based on the provided user.
     *
     * @param  user   the user for whom to retrieve memes
     * @return        a list of Meme objects related to the user
     */
    public List<Meme> getMemeByUser(String user){
        try {
            logger.info("\u001B[34mSearching memes by user: " + user + "\u001B[0m");
            return repository.memeByUser(user);
        } catch (APIResponseException e) {
            logger.error("User not found " + user);
            throw new APIResponseException("User not found " + user);
        }
    }

    /**
     * Removes a meme from the repository based on the provided ID.
     *
     * @param  id   the unique identifier of the meme to be deleted
     */
    public void delete(Long id){
        logger.info("\u001B[34mRemoving meme: " + id);
        repository.deleteById(id);
    }

    /**
     * Retrieves a list of memes based on the provided category.
     *
     * @param  category  the category to search for
     * @return           a list of Meme objects related to the category
     * @throws APIResponseException  if the category is not found
     */
    public List<Meme> memeByCategory(String category){
        try {
            logger.info("\u001B[34mSearching memes by category: " + category + "\u001B[0m");
            return repository.memeByCategory(category);
        } catch (APIResponseException e) {
            logger.error("Category not found" + category);
            throw new APIResponseException("Category not found" + category);
        }
    }
}
