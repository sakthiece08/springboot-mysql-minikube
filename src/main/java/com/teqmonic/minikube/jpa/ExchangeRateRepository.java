package com.teqmonic.minikube.jpa;

import com.teqmonic.minikube.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {

    public Optional<ExchangeRate> findBySourceAndTarget(String source, String target);
}
