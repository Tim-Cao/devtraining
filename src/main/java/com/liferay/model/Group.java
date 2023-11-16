package com.liferay.model;

import java.util.Random;

public class Group {

    public Group(String groupKey) {
        this.groupId = new Random().nextInt(100000) + 10000;
        this.groupKey = groupKey;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public long getGroupId() {
        return groupId;
    }

    private long groupId;

    private String groupKey;

}