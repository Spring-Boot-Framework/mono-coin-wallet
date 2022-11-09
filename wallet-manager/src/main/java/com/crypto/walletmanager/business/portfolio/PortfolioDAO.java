package com.crypto.walletmanager.business.portfolio;

import java.util.List;
import java.util.UUID;

public interface PortfolioDAO {
    List<Portfolio> findAll();
    void save(Portfolio portfolio);
    List<Portfolio> findBy(UUID userId);
}
