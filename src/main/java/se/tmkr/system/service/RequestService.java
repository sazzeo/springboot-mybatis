package se.tmkr.system.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se.tmkr.system.dto.RequestDto;
import se.tmkr.system.repository.RequestRepository;

@RequiredArgsConstructor
@Service
public class RequestService {

    private final RequestRepository requestRepository;

    @Transactional
    public RequestDto selectRequest(String reqNo){

        return requestRepository.selectRequest(reqNo);

    }

}
