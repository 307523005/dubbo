package com.text.api.service;


import com.text.api.entity.RemotecontrolEntity;
import com.text.api.entity.RemotecontrolBeen;
import java.util.List;

public interface RemotecontrolService {

    List<RemotecontrolBeen> getRemotecontrol(RemotecontrolBeen remotecontrolBeen);
}
