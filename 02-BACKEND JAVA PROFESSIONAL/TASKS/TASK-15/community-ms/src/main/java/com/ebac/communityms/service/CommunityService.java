package com.ebac.communityms.service;

import com.ebac.communityms.apiwebflux.APIServiceMeme;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Random;

@Component
public class CommunityService {
    Logger logger = LogManager.getLogger(CommunityService.class);

    @Autowired
    private APIServiceMeme apiMeme;

    /**
     * Retrieves a random meme of the day from the API.
     *
     * @return  a random meme of the day, or null if no memes are available
     */
    public Object memeOfDay() {
        List<Map<String, Object>> memes = apiMeme.fetchDataFromApi("/memes");

        if (memes == null || memes.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int min = 0;
        int randomMemeIndex = random.nextInt(memes.size() - min) + min;

        return memes.get(randomMemeIndex);
    }

}
