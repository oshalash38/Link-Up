package com.example.link_up;

import java.util.ArrayList;

public class Group {
    private ArrayList<UserAccount> members = new ArrayList<>();
    private static int groupCount;
    private int groupID;

    /**
     * Initializes a group and sets an id.
     */
    public Group(){
        groupCount++;
        groupID = groupCount;
    }

    /**
     * Returns this group's id
     * @return int
     */
    public int getGroupID(){
        return groupID;
    }

    /**
     * Adds a member to a group and returns true iff member is added.
     * @param potMember UserAccount
     * @return boolean
     */
    public boolean addMember(UserAccount potMember){
        if (!members.contains(potMember)){
            members.add(potMember);
            return true;
        }
        return false;
    }
}
