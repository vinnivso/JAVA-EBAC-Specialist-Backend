package com.ebac.categoryms.controller;

import com.ebac.categoryms.entity.Category;
import com.ebac.categoryms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memeland")
public class CategoryController {
    @Autowired
    private CategoryService service;

    /**
     * Retrieves a list of all categories.
     *
     * @return  a list of Category objects representing all categories
     */
    @GetMapping("/categories")
    public List<Category> getAll() {
        return service.getAll();
    }

    /**
     * Retrieves a category by its ID.
     *
     * @param  id  the ID of the category to retrieve
     * @return     the category with the specified ID
     */
    @GetMapping("/categories/id={id}")
    public Category getCategory(@PathVariable Long id){
        return service.getCategory(id);
    }

    /**
     * Retrieves a category by its name.
     *
     * @param  name  the name of the category to retrieve
     * @return       the category with the specified name
     */
    @GetMapping("/categories/name={name}")
    public Category getCategoryByName(@PathVariable String name){
        return service.getCategoryByName(name);
    }

    /**
     * Creates a new category.
     *
     * @param  category  the category object to be created
     * @return           the created category if successful, null otherwise
     */
    @PostMapping ("/newCategory")
    public Category create(@RequestBody Category category){
        return service.create(category);
    }

    /**
     * Deletes a category by its ID.
     *
     * @param  id  the ID of the category to be deleted
     * @return     void
     */
    @DeleteMapping("/category/del/id={id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
