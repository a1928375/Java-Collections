package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;                                      //fields都設為private final => 外user不能改
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;

//        this.exits = exits;                                          //此exits (parameter) 就會是外user自己設的 parameter => 所以外user可以自由更改

        if (exits != null) {                                          //exits不可以是null不可以是null

            this.exits = new HashMap<String, Integer>(exits);          // 每次call location's constructor時 => 都會create shallow copy的new HashMap object
                                                                       //就是此exits (parameter) 傳入之後 => 會create shallow copy的new HashMap object
                                                                       //所以外user只能自由更改 外user自己設的 parameter，不能更改shallow copy的new HashMap object
                                                                       //讓外user不能直接modify original exits (HashMap)
        } else {

            this.exits = new HashMap<String, Integer>();
        }

        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {            //不用addExit => 讓外user不能直接modify original exits (HashMap) in the location class
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
