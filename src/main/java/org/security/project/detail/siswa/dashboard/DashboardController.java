package org.security.project.detail.siswa.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DashboardController {

    @GetMapping("home")
    public String home() {
        return "pages/dashboard/home";
    }
}
