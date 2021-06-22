package com.example.otpartner.service;

import com.example.otpartner.data.request.ReserveRequest;
import com.example.otpartner.data.response.ReserveResponse;
import org.springframework.core.io.ByteArrayResource;

public interface EventService {

    ByteArrayResource getEvents();

    ByteArrayResource getEvent(Long id);

    ReserveResponse reserve(ReserveRequest request);
}
