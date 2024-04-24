package com.ebac.categoryms.service;

import com.ebac.categoryms.apiwebflux.APIServiceUser;
import com.ebac.categoryms.entity.Category;
import com.ebac.categoryms.repository.CategoryRepository;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Component
public class CategoryService {
    Logger logger = LogManager.getLogger(CategoryService.class);


    @Autowired
    private CategoryRepository repository;


    private Category category;

    @Autowired
    private final APIServiceUser apiUser;

    public CategoryService( APIServiceUser apiUser){
        this.apiUser = apiUser;
    }

    /**
     * Checks if the given category's username exists in the API response.
     *
     * @param  category  the category object containing the username
     * @return           true if the username exists in the API response, false otherwise
     */
    public boolean isUserNameInApiResponse(Category category) {
        String targetUserName = category.getUserName();
        String apiResponse = apiUser.fetchDataFromApi();

        JsonArray usersArray = new Gson().fromJson(apiResponse, JsonArray.class);

        for (JsonElement userElement : usersArray) {
            JsonObject userObject = userElement.getAsJsonObject();
            String name = userObject.get("name").getAsString();

            if (name.equals(targetUserName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the given category is unique based on its name.
     *
     * @param category The category to check for uniqueness.
     * @return True if the category is unique, false otherwise.
     */
    private boolean isCategoryUnique(Category category) {
        return repository.findByName(category.getName()) == null;
    }

    /**
     * Creates a new category if it is unique and the user's name exists in the API response.
     *
     * @param  category  the category object to be created
     * @return           the created category if successful, null otherwise
     */
    public Category create(Category category) {
        if (isCategoryUnique(category)) {
            if (isUserNameInApiResponse(category)) {
                logger.info("\u001B[34mCategory inserted successfully! :" + category.getName());
                return repository.save(category);
            }
        }
        logger.error("\u001B[34mCategory not inserted! :" + category);
        return null;
    }

    /**
     * Retrieves all categories from the repository and logs the count of categories.
     *
     * @return a list of all categories
     */
    public List<Category> getAll(){
        logger.info("\u001B[34mSearching all categories:" + repository.count());
        return repository.findAll();
    }

    /**
     * Removes a category by its ID.
     *
     * @param  id  the ID of the category to be removed
     */
    public void delete(Long id) {
        logger.info("\u001B[34mRemoving category: " + id + " - " + repository.findById(id).get().getName());
        repository.deleteById(id);
    }

    /**
     * Retrieves a category by its ID from the repository and logs the category's name.
     *
     * @param  id  the ID of the category to retrieve
     * @return     the category with the specified ID, or null if not found
     */
    public Category getCategory(Long id) {
        logger.info("\u001B[34mSearching category: " + id + " - " + repository.findById(id).get().getName());
        return repository.findById(id).get();
    }

    /**
     * Retrieves a category by its name from the repository and logs the category's name.
     *
     * @param  name  the name of the category to retrieve
     * @return       the category with the specified name, or null if not found
     */
    public Category getCategoryByName(String name) {
        logger.info("\u001B[34mSearching category: " + name);
        return repository.findByName(name);
    }
}
