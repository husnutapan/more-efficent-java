package multitenancy.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultiTenantDS extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return StoreContext.getTenantInfo();
    }
}
