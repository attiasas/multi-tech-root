package dummy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VulnSurfaceController {

    @GetMapping("/vuln-surface")
    public String surface() {
        return VulnSurfaceSample.describeSurface();
    }
}
