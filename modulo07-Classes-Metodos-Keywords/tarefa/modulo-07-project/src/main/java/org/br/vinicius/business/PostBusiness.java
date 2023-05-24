package org.br.vinicius.business;


import org.br.vinicius.models.Post;

/**
 * @author VINNIVSO
 */
public class PostBusiness {
    public static void main(String[] args) {
        System.out.println(createPost());
    }

    /**
     *
     * @return String returned from method createPost()
     */
    public static String createPost() {
        /**
         * @see Post
         */
        Post newPost = new Post();
        newPost.setUuid("1345rew");
        newPost.setCreatorId("1345rewasfghjhgfd");
        newPost.setContent("Mestre dos Magos, sempre foi o melhor!");
        newPost.setCreatedAt("22/05/2023");
        newPost.setUpdatedAt("23/05/2023");

        if (newPost.getUuid().length() < 6) {
            return "INVALID UUID ARGUMENT";
        }
        if (newPost.getCreatorId().length() < 12) {
           return "INVALID CREATORID ARGUMENT";
        }
        if (newPost.getContent().length() < 3) {
            return "INVALID CONTENT ARGUMENT";
        }
        if (newPost.getCreatedAt().length() < 3) {
            return "INVALID CREATEDAT ARGUMENT";
        }
        if (newPost.getUpdatedAt().length() < 3) {
            return "INVALID UPDATEDAT ARGUMENT";
        }
        return "POST CREATED CREATED";
    }
}
