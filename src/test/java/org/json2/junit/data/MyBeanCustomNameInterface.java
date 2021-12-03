package org.json2.junit.data;

import org.json2.JSONPropertyIgnore;
import org.json2.JSONPropertyName;

public interface MyBeanCustomNameInterface {
    @JSONPropertyName("InterfaceField")
    float getSomeFloat();
    @JSONPropertyIgnore
    int getIgnoredInt();
}