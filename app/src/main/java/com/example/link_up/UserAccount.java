package com.example.link_up;

import java.util.ArrayList;
import java.util.HashMap;

public class UserAccount {
    /*
    Initializing attributes.
     */
    private String username;
    private String password;
    public ArrayList<UserAccount> friends = new ArrayList<>();
    private HashMap<Integer, ArrayList<UserAccount>> groups = new HashMap<>();

    /**
     * Constructor of a user account.
     * @param username String
     * @param password String
     */
    public UserAccount(String username, String password){
        this.username = username;
        this.password = password;
    }


    /**
     * Accepts a friend request.
     * @param friend String
     * @return boolean
     */
    public boolean acceptFriendRequest(UserAccount friend) {
        this.friends.add(friend);
        return true;
    }

}
