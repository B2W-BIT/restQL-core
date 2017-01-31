package restql.core.query;

import restql.core.interop.Hook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ideais on 12/12/16.
 */
public class QueryOptions {

    private boolean debugging = false;

    private Integer globalTimeout = 5000;

    private Integer timeout = 1000;

    private Map<String, Class> hooks;


    public QueryOptions() {
        this.hooks = new HashMap<>();
    }

    public void setDebugging(boolean debugging) {
        this.debugging = debugging;
    }

    public boolean isDebugging() {
        return this.debugging;
    }

    public Integer getGlobalTimeout() {
        return globalTimeout;
    }

    public void setGlobalTimeout(Integer globalTimeout) {
        this.globalTimeout = globalTimeout;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public void addHook(String name, Class clazz) { this.hooks.put(name, clazz); }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("debugging", debugging);
        map.put("timeout", timeout);
        map.put("global-timeout", globalTimeout);
        map.put("java-hooks", hooks);
        return map;
    }

}
