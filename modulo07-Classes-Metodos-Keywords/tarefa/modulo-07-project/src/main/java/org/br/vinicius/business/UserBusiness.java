package org.br.vinicius.business;

import org.br.vinicius.models.User;

/**
 * @author VINNIVSO
 */
public class UserBusiness {
    public static void main(String[] args) {
        System.out.println(createUser());
    }

    /**
     *
     * @return String returned from method createUser()
     */
    public static String createUser() {
        /**
         * @see User
         */
            User newUser = new User();
            newUser.setUuid("1345rewasfghjhgfd");
            newUser.setName("Mestre dos Magos");
            newUser.setEmail("mestredosmagos@email.com");
            newUser.setPassword("1234567");
            newUser.setCreatedAt("22/05/2023");
            newUser.setUpdatedAt("23/05/2023");

            if (newUser.getUuid().length() < 12) {
                return "INVALID UUID ARGUMENT";
            }
            if (newUser.getName().length() < 3) {
                return "INVALID NAME ARGUMENT";
            }
            if (!newUser.getEmail().matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
                return "INVALID EMAIL ARGUMENT";
            }
            if (newUser.getPassword().length() < 6) {
                return "INVALID PASSWORD ARGUMENT";
            }
            if (newUser.getCreatedAt().length() < 3) {
                return "INVALID CREATEDAT ARGUMENT";
            }
            if (newUser.getUpdatedAt().length() < 3) {
                return "INVALID UPDATEDAT ARGUMENT";
            }
            return "USER CREATED";
    }
}
