package com.ebac.memems.controller;

import com.ebac.memems.entity.Meme;
import com.ebac.memems.exceptions.ExceptionResponse;
import com.ebac.memems.service.MemeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memeland")
@Slf4j
public class MemeController {
    @Autowired
    private MemeService service;

    /**
     * Retrieves all the memes from the service and returns them as a list.
     *
     * @return         	a list of Meme objects representing all the memes
     */
    @GetMapping("/memes")
    public List<Meme> getAll(){
        return service.getAll();
    }

    /**
     * Creates a new meme using the provided request body.
     *
     * @param  meme  the meme object to be created
     * @return       the created meme object
     * @throws ExceptionResponse if there is an error creating the meme
     */
    @PostMapping("/newMeme")
    public Object create(@RequestBody Meme meme) throws ExceptionResponse {
        return service.create(meme);
    }

    /**
     * Retrieves a meme with the specified ID from the service.
     *
     * @param  id  the ID of the meme to retrieve
     * @return     the meme with the specified ID, or null if not found
     */
    @GetMapping("/memes/id={id}")
    public Meme getMeme(@PathVariable Long id){
        return service.getMeme(id);
    }

    /**
     * Retrieves a list of memes associated with the given user.
     *
     * @param  user  the user whose memes are to be retrieved
     * @return       a list of memes associated with the given user
     */
    @GetMapping("/memes/user={user}")
    public List<Meme> getMemeByUser(@PathVariable String user){
        return service.getMemeByUser(user);
    }

    /**
     * Deletes a meme with the specified ID.
     *
     * @param  id  the ID of the meme to delete
     */
    @DeleteMapping("/memes/del/id={id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    /**
     * Retrieves a list of memes by category.
     *
     * @param  category  the category of memes to retrieve
     * @return          a list of memes based on the specified category
     */
    @GetMapping("/memes/category={category}")
    public List<Meme> memeByCategory(@PathVariable String category){
        return service.memeByCategory(category);
    }
}
