package dummy;

import org.apache.commons.beanutils.BeanUtils;
import org.yaml.snakeyaml.Yaml;

import java.util.HashMap;
import java.util.Map;

/**
 * References intentionally outdated third-party libs (see pom.xml) for SCA / Xray tests.
 */
public final class VulnSurfaceSample {

    private VulnSurfaceSample() {
    }

    public static String describeSurface() {
        Yaml yaml = new Yaml();
        Map<String, Object> map = new HashMap<>();
        map.put("probe", "vuln-surface");
        String dumped = yaml.dump(map);
        return "snakeyaml+beanutils: " + dumped.length() + " " + BeanUtils.class.getSimpleName();
    }
}
