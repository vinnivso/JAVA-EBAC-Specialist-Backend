package com.ebac.communityms.controller;

import com.ebac.communityms.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memeland")
public class CommunityController {
    @Autowired
    private CommunityService service;

    /**
     * Retrieves the meme of the day from the community service.
     *
     * @return  the meme of the day as an Object
     */
    @GetMapping("/memeOfDay")
    public Object memeOfDay(){
        return service.memeOfDay();
    }
}
