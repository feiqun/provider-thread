package com.beta.providerthread.service;

import com.beta.providerthread.model.Mo;
import com.beta.providerthread.model.MoType;

import java.util.List;

public interface MoService {

    List<Mo> findByMoType(MoType moType);
}
