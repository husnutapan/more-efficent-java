package multitenancy.config;

public class StoreContext {

    public static ThreadLocal<String> tenantInfo = new ThreadLocal<>();

    public static ThreadLocal<String> getTenantInfo() {
        return tenantInfo;
    }

    public static void setTenantInfo(String tenant) {
        tenantInfo.set(tenant);
    }

    public static void clearContext() {
        tenantInfo.set(null);
    }
}
