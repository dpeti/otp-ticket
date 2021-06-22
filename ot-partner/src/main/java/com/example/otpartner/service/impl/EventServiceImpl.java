package com.example.otpartner.service.impl;

import com.example.otpartner.data.request.ReserveRequest;
import com.example.otpartner.data.response.ReserveResponse;
import com.example.otpartner.service.EventService;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Override
    public ByteArrayResource getEvents() {
        return null;
    }

    @Override
    public ByteArrayResource getEvent(Long id) {
        return null;
    }

    @Override
    public ReserveResponse reserve(ReserveRequest request) {
        return null;
    }
}
