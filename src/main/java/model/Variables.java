package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Variables {
    private List<String> types = new ArrayList<>();
    private Map<String, Object> variables = new HashMap<>();

    public List<String> getTypes() {
        return types;
    }

    public void addType(String type) {
        this.types.add(type);
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void addVariable(String key, Object value) {
        this.variables.put(key, value);
    }
}
