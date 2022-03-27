package poni.perro.logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegexDic {
    

    private final Map<String, String> regexs = new HashMap<String,String>();

    public RegexDic () {
        this.initRegexs();
    }

    private void initRegexs() {
        this.addRegexs("byOne", "I[X]|I[V]|X[C]|X[L]|C[M]|C[D]|[M]|[C]|[X]|[I]|[D]|[L]|[V]");
    }

    private void addRegexs(String key, String value) {
        this.regexs.putIfAbsent(key, value);
    }
    
    public String getRegetBykey(String key) {
        return this.regexs.get(key);
    }

    public List<String> getListValues() {
        List<String> values = new ArrayList<String>(regexs.values());
        return values;
    }
}
